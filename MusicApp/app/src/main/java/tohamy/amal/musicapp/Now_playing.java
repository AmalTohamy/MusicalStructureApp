package tohamy.amal.musicapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Now_playing extends AppCompatActivity implements OnClickListener {

    TextView artistNameTextView;
    TextView songNameTextView;
    ImageView artistImageView;
    ImageView playNext;
    ImageView playPrevious;
    ImageView play;
    String artistName;
    int artistImage;
    String songName;
    int currentPosition;
    ArrayList<String> songList;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        artistName = getIntent().getStringExtra(MyConstants.artistKey);
        artistImage = getIntent().getIntExtra(MyConstants.imageKey, 0);
        songName = getIntent().getStringExtra(MyConstants.songNameKey);
        songList = getIntent().getStringArrayListExtra(MyConstants.songListKey);
        currentPosition = getIntent().getIntExtra(MyConstants.currentPositionKey, 0);

        //To make circle image
        //I watched youtube toturial
        artistImageView = findViewById(R.id.artist_image);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), artistImage);
        //Set all the images to the same size
        Bitmap resized = Bitmap.createScaledBitmap(bitmap, 550, 550, true);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), resized);
        roundedBitmapDrawable.setCircular(true);
        artistImageView.setImageDrawable(roundedBitmapDrawable);

        artistNameTextView = findViewById(R.id.artist_name);
        artistNameTextView.setText(artistName);

        songNameTextView = findViewById(R.id.song_name);
        songNameTextView.setText(songName);

        playNext = findViewById(R.id.play_next_image_view);
        playPrevious = findViewById(R.id.play_previous_image_view);
        play = findViewById(R.id.play_image_view);

        playNext.setOnClickListener(this);
        playPrevious.setOnClickListener(this);
        play.setOnClickListener(this);
    }


    //Instead of using multiple anonymous instances of the clickListener, I used switch statements
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.play_next_image_view:
                   /*In here we test to see if we've hit the last
                   element in the array and reset if we have,
                   else just carry on to the next
                 */
                if (currentPosition < songList.size() - 1) {
                    currentPosition++;
                    songNameTextView.setText(songList.get(currentPosition));
                } else {
                    currentPosition = 0;
                }
                break;
            case R.id.play_previous_image_view:
                if (currentPosition < songList.size() - 1 && currentPosition > 0) {
                    currentPosition--;
                    songNameTextView.setText(songList.get(currentPosition));
                } else {
                    currentPosition = songList.size() - 1;
                    songNameTextView.setText(songList.get(currentPosition));
                    currentPosition--;
                }
                break;
            case R.id.play_image_view:
                play.setImageResource(R.drawable.pause);
                break;
        }
    }
}
