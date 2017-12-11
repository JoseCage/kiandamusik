package me.mentedigital.kiandamusik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import models.Album;
import models.ArtistTrackList;
import models.Artista;
import models.Track;

public class TelaArtistaDetalhada extends AppCompatActivity {

    RecyclerView listaDeMusicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDeMusicas = findViewById(R.id.listaDeMusicas);
        setTitle("Força Suprema");
        Artista fs = new Artista( id: 1, name: "Força Suprema", description: "description", musicStyle: "Hip Hop", R.drawable.header, verified: true);
        Track urna = new Track();
        Album Caveira = new Album( id: 1, name: "Caveira", fs.getId(), releaseDate: "2017", price: "500.00 Kz");
        urna.setAlbum(caveira);
        urna.setArtist(js);
        urna.setTrackCover(R.drawable.fs);
        urna.setId(1);
        urna.setName("Urna");

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(urna);
        ArtistTrackList fsTrackList = new ArtistTrackList( trackListId: 1, fs.getId(), tracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context: this);
        listaDeMusicas.setLayoutManager(linearLayoutManager);
    }
}
