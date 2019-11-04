package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ej15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej15);
    }

    public void salir(View view){
        finish();
    }

    public void ejercicioa(View view){
        Intent i = new Intent(this, ejercicio15_1.class);
        startActivity(i);

    }

    public void ejerciciob(View view){
        Intent i = new Intent(this, ejercicio15_2.class);
        startActivity(i);

    }
}
