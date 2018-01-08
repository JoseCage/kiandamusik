package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import custom_views.PlayPauseButton;
import me.mentedigital.kiandamusik.R;

public class NowPlayingCard extends Fragment {

    ImageView albumArt;
    ProgressBar progressBar_1;
    TextView title_1;
    TextView artist_1;
    PlayPauseButton playPauseButton_1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.nowplay, container, false);
        albumArt = v.findViewById(R.id.album);
        progressBar_1 = v.findViewById(R.id.processamento);
        title_1 = v.findViewById(R.id.title);
        artist_1 = v.findViewById(R.id.artist);
        playPauseButton_1 = v.findViewById(R.id.playPauseButton);

        return v;
    }
}
