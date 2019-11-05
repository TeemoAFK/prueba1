package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.media.MediaPlayer;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

public class problema2 extends AppCompatActivity implements MediaPlayer.OnPreparedListener{
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar(View v) {
        mp = new MediaPlayer();
        mp.setOnPreparedListener(this);
        try {
            mp.setDataSource("http://cdn-private.vnzl.club/download/2f8ad1a44c430d92d86616fc4b1a07f9c94b99fc/psn_rs_a5O0/9b7258c32d1ac0aa.mp3");
            mp.prepareAsync();
        } catch (IOException e) {
        }
        Toast t = Toast.makeText(this,
                "Espere un momento mientras se carga el mp3",
                Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.start();
    }
}
