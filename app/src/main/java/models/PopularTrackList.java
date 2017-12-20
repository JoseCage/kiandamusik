package models;

import java.util.ArrayList;

/**
 * Created by josecage on 18-12-2017.
 */

public class PopularTrackList {
    private int popularTrackListId;
    private int popularArtistId;
    private ArrayList<Track> popularTracks;

    public PopularTrackList(int popularTrackListId, int popularArtistId, ArrayList<Track> popularTracks) {
        this.popularTrackListId = popularTrackListId;
        this.popularArtistId = popularArtistId;
        this.popularTracks = popularTracks;
    }

    public int getpopularTrackListId() {
        return popularTrackListId;
    }

    public void setpopularTrackListId(int popularTrackListId) {
        this.popularTrackListId = popularTrackListId;
    }

    public int getpopularArtistId() {
        return popularArtistId;
    }

    public void setpopularArtistId(int popularArtistId) {
        this.popularArtistId = popularArtistId;
    }

    public ArrayList<Track> getPopularTracks() {
        return popularTracks;
    }

    public void setPopularTracks(ArrayList<Track> popularTracks) {
        this.popularTracks = popularTracks;
    }
}
