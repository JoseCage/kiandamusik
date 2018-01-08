package me.mentedigital.kiandamusik;


import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;

import fragments.NowPlayingCard;

public class Base2Activity extends AppCompatActivity {
    public class initNowPlayingControls extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            NowPlayingCard nowplaying = new NowPlayingCard();
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.quick_controls_container, nowplaying).commitAllowingStateLoss();
            return "Executed";
        }
    }

}
