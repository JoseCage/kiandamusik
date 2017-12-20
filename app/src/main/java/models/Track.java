package models;

/**
 * Created by josecage on 08-12-2017.
 */

public class Track {
    private int trackId;
    private String aPath;
    private String aName;
    private Album album;
    private Artista artist;
    private int trackCover;

    public Track() {
    }

    public Track(int trackId, String aPath, String aName, Album album, Artista artist, int trackCover) {
        this.trackId = trackId;
        this.aPath = aPath;
        this.aName = aName;
        this.album = album;
        this.artist = artist;
        this.trackCover = trackCover;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getaPath() {
        return aPath;
    }

    public void setaPath(String aPath) {
        this.aPath = aPath;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtist() {
        return artist;
    }

    public void setArtist(Artista artist) {
        this.artist = artist;
    }

    public int getTrackCover() {
        return trackCover;
    }

    public void setTrackCover(int trackCover) {
        this.trackCover = trackCover;
    }
}
