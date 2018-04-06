package tohamy.amal.musicapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        final ArrayList<String> songList = getIntent().getStringArrayListExtra(MyConstants.songListKey);
        final String artistName = getIntent().getStringExtra(MyConstants.artistKey);
        final int artistImage = getIntent().getIntExtra(MyConstants.imageKey, 0);

        //To make circle image
        //I watched youtube toturial
        final ImageView imageView = findViewById(R.id.artist_image);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), artistImage);
        //Set all the images to the same size
        Bitmap resized = Bitmap.createScaledBitmap(bitmap, 500, 500, true);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), resized);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(SongList.this, Now_playing.class);
                intent.putExtra(MyConstants.artistKey, artistName);
                intent.putExtra(MyConstants.imageKey, artistImage);
                intent.putExtra(MyConstants.songNameKey, songList.get(position));
                intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                intent.putExtra(MyConstants.currentPositionKey, songList.indexOf(songList.get(position)));
                startActivity(intent);
            }
        });

    }
}
