package com.example.sonidosstarwars;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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