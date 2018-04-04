package tohamy.amal.musicapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Now_playing extends AppCompatActivity {

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

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        artistName = getIntent().getStringExtra("artist");
        artistImage = getIntent().getIntExtra("image", 0);
        songName = getIntent().getStringExtra("songName");
        final ArrayList<String> songList = getIntent().getStringArrayListExtra("songList");
        currentPosition = getIntent().getIntExtra("currentPosition", 0);

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

        playNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* In here we test to see if we've hit the last
                 *  element in the array and reset if we have,
                 *  else just carry on to the next
                 */
                if (currentPosition < songList.size() - 1) {
                    currentPosition++;
                    songNameTextView.setText(songList.get(currentPosition));
                } else
                    currentPosition = 0;
            }
        });


        playPrevious = findViewById(R.id.play_previous_image_view);
        playPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPosition < songList.size() - 1 && currentPosition > 0) {
                    currentPosition--;
                    songNameTextView.setText(songList.get(currentPosition));
                } else {
                    currentPosition = songList.size() - 1;
                    songNameTextView.setText(songList.get(currentPosition));
                    currentPosition--;
                }
            }
        });

        play = findViewById(R.id.play_image_view);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               play.setImageResource(R.drawable.pause);
            }
        });

        //Adding image to the actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayShowCustomEnabled(true);

        final LayoutInflater inflator = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflator != null;
        View v = inflator.inflate(R.layout.activity_custom_action_bar, null);
        actionBar.setCustomView(v);
        final ImageView homeButton = findViewById(R.id.home_image_view);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Now_playing.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
