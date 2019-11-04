package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

public class ej25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej25);
    }

    public void r2d2(View view) {
        Uri dato1 = Uri.parse(Environment.getExternalStorageDirectory()
                .getPath() + "/r2d2.mp3");
        MediaPlayer mp = MediaPlayer.create(this, dato1);
        mp.start();
    }

    public void sable(View view) {
        Uri dato2 = Uri.parse(Environment.getExternalStorageDirectory()
                .getPath() + "/sable-laser.mp3");
        MediaPlayer mp = MediaPlayer.create(this, dato2);
        mp.start();
    }
}
