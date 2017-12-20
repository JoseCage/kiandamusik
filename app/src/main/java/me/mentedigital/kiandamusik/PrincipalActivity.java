package me.mentedigital.kiandamusik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.ImageView;

import java.util.ArrayList;

import adapters.PopularTracksAdapter;
import models.Album;
import models.Artista;
import models.PopularTrackList;
import models.Track;

public class PrincipalActivity extends AppCompatActivity {

    RecyclerView listaDeMusicasPopulares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listaDeMusicasPopulares = findViewById(R.id.popularTrackList);
        Artista bs = new Artista(0, "Big Shaq", "Not for now", "RNB", R.drawable.big_shaq_track, false);

        Track mbh = new Track();
        Album bigOne = new Album(0, "Big One", bs.getId(), "2017", "1500.00 kzs");

        mbh.setAlbum(bigOne);
        mbh.setArtist(bs);
        mbh.setaName("Main Bot Hot");
        mbh.setTrackCover(R.drawable.big_shaq_track);

        ArrayList<Track> popularTracks = new ArrayList<>();
        popularTracks.add(mbh);
        PopularTrackList pTrackList = new PopularTrackList(1, bigOne.getId(), popularTracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDeMusicasPopulares.setLayoutManager(linearLayoutManager);
        PopularTracksAdapter adapter = new PopularTracksAdapter(this, pTrackList);
        listaDeMusicasPopulares.setAdapter(adapter);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
    }*/
}
