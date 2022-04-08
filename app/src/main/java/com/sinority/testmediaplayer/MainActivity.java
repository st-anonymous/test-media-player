package com.sinority.testmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static MediaPlayer mediaPlayer;

    public static void setMediaPlayer(MediaPlayer mediaPlayer) {
        MainActivity.mediaPlayer = mediaPlayer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.start);
        Button stop = findViewById(R.id.stop);
        Button pause = findViewById(R.id.pause);
        Button quit = findViewById(R.id.quit);

        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                stop.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                start.setVisibility(View.GONE);
            }
        });

        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                stop.setVisibility(View.GONE);
                pause.setVisibility(View.GONE);
                start.setVisibility(View.VISIBLE);
            }
        });

        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                stop.setVisibility(View.VISIBLE);
                start.setVisibility(View.VISIBLE);
                pause.setVisibility(View.GONE);
            }
        });

        quit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                Intent i = new Intent(getBaseContext(), BaseActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaPlayer.reset();
    }
}