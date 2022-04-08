package com.sinority.testmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

    }

    public void openSongOne (View view){
        MainActivity.setMediaPlayer(MediaPlayer.create(this, R.raw.jabsaiyan));
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openSongTwo (View view){
        MainActivity.setMediaPlayer(MediaPlayer.create(this, R.raw.lobonko));
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openSongThree (View view){
        MainActivity.setMediaPlayer(MediaPlayer.create(this, R.raw.maahi));
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openSongFour (View view){
        MainActivity.setMediaPlayer(MediaPlayer.create(this, R.raw.terabanjaunga));
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openSongFive (View view){
        MainActivity.setMediaPlayer(MediaPlayer.create(this, R.raw.tohphiraao));
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}