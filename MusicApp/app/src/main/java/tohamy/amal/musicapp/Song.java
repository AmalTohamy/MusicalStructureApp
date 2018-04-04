package tohamy.amal.musicapp;

public class Song {
    private String mDefaultArtist;
    private int mImageResourceId;

    public Song(String mDefaultArtist, int mImageResourceId) {
        this.mDefaultArtist = mDefaultArtist;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDefaultArtist() {
        return mDefaultArtist;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
