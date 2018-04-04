package tohamy.amal.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Song> {


    public CustomAdapter(@NonNull Context context, ArrayList<Song> songName) {
        super(context, 0, songName);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list, parent, false);
        }

        Song currentArtist = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        assert currentArtist != null;
        artistTextView.setText(currentArtist.getmDefaultArtist());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = listItemView.findViewById(R.id.artist_image_view);
        imageView.setImageResource(currentArtist.getmImageResourceId());
        return listItemView;
    }
}
