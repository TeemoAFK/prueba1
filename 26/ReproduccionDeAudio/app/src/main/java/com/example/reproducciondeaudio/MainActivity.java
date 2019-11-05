package com.example.reproducciondeaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.media.MediaPlayer;

import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ejecutar(View v) {
        MediaPlayer mp = new MediaPlayer();
        try {
            mp.setDataSource("http://cdn-private.vnzl.club/download/2f8ad1a44c430d92d86616fc4b1a07f9c94b99fc/psn_rs_a5O0/9b7258c32d1ac0aa.mp3");
            mp.prepare();
            mp.start();
        } catch (IOException e) {
        }
    }
}
