package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salir(View view){
        finish();
    }

    public void ej14(View view){
        Intent i = new Intent(this, ej15.class);
        startActivity(i);
    }

    public void ej25(View view){
        Intent i = new Intent(this, ej25.class);
        startActivity(i);
    }

    public void ej36(View view){
        Intent i = new Intent(this, ej36.class);
        startActivity(i);
    }

    public void ej51(View view){
        Intent i = new Intent(this, ej51.class);
        startActivity(i);
    }

}

