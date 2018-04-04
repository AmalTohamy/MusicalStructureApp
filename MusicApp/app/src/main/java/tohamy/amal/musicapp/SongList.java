package tohamy.amal.musicapp;

import android.annotation.SuppressLint;
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

        final ArrayList<String> songList = getIntent().getStringArrayListExtra("songList");
        final String artistName = getIntent().getStringExtra("artist");
        final int artistImage = getIntent().getIntExtra("image", 0);

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
                intent.putExtra("artist", artistName);
                intent.putExtra("image", artistImage);
                intent.putExtra("songName", songList.get(position));
                intent.putStringArrayListExtra("songList", songList);
                intent.putExtra("currentPosition", songList.indexOf(songList.get(position)));
                startActivity(intent);
            }
        });

        //Adding image to the actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayShowCustomEnabled(true);

        LayoutInflater inflator = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflator != null;
        @SuppressLint("InflateParams") View v = inflator.inflate(R.layout.activity_custom_action_bar, null);
        actionBar.setCustomView(v);
        final ImageView homeButton = findViewById(R.id.home_image_view);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongList.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
