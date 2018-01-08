package me.mentedigital.kiandamusik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import adapters.PopularTrackAdapter;
import models.Album;
import models.Artista;
import models.PopularTrackList;
import models.Track;

public class PrincipalActivity extends Base2Activity {

    RecyclerView listaDeMusicaPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listaDeMusicaPopular = findViewById(R.id.listaDeMusicaPopular);
        setTitle("Neru Americano");
        Artista ps = new Artista(1, "Neru Americano", "description",
                "Kuduro", R.drawable.big_shaq_track, false);
        Track selfie = new Track();
        Album capaDura = new Album(1, "CapaDura", ps.getId(), "2017", "1.000kz");
        selfie.setAlbum(capaDura);
        selfie.setArtist(ps);
        selfie.setTrackCover(R.drawable.fs);
        selfie.setId(1);
        selfie.setaName("CapaDura");

        Track selfie1 = new Track();
        Album capaDura1 = new Album(1, "CapaDura", ps.getId(), "2017", "1.000kz");
        selfie1.setAlbum(capaDura);
        selfie1.setArtist(ps);
        selfie1.setTrackCover(R.drawable.fs);
        selfie1.setId(1);
        selfie1.setaName("CapaDura1");


        Track selfie2 = new Track();
        Album capaDura2 = new Album(1, "CapaDura", ps.getId(), "2017", "1.000kz");
        selfie2.setAlbum(capaDura);
        selfie2.setArtist(ps);
        selfie2.setTrackCover(R.drawable.fs);
        selfie2.setId(1);
        selfie2.setaName("CapaDura2");

        Track selfie3 = new Track();
        Album capaDura3 = new Album(1, "CapaDura", ps.getId(), "2017", "1.000kz");
        selfie3.setAlbum(capaDura);
        selfie3.setArtist(ps);
        selfie3.setTrackCover(R.drawable.fs);
        selfie3.setId(1);
        selfie3.setaName("CapaDura3");

        ArrayList<Track> tracksPopular = new ArrayList<>();
        tracksPopular.add(selfie);
        tracksPopular.add(selfie1);
        tracksPopular.add(selfie2);
        tracksPopular.add(selfie3);
        PopularTrackList pTrackList = new PopularTrackList(1, ps.getId(), tracksPopular);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDeMusicaPopular.setLayoutManager(linearLayoutManager);
        PopularTrackAdapter adapter = new PopularTrackAdapter(this, pTrackList);
        listaDeMusicaPopular.setAdapter(adapter);
        new initNowPlayingControls().execute("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_acerca) {
            startActivity(new Intent(this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
