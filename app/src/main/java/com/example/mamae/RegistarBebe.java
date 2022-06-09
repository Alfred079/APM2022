package com.example.mamae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistarBebe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar_bebe);
    }
    public void abrirActivity(View view) {
        Intent intent = new Intent(RegistarBebe.this, Home.class);
        startActivity(intent);
    }
}