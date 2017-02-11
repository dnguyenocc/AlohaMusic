package edu.orangecoastcollege.cs273.dnguyen1214.alohamusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Inflate Splash Screen activity
        TimerTask mediaTask = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashScreenActivity.this, MusicActivity.class));

            }
        };

        // Create a timer object that launches task after 3-5 sec
        Timer timer = new Timer();
        timer.schedule(mediaTask, 3000);
    }

}
