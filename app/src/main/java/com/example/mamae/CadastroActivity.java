package com.example.mamae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    private Button criarconta;
    private TextView fazerlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();

    }

    public void abrirActivity(View view) {
        Intent intent = new Intent(CadastroActivity.this, LoginActivity2.class);
        startActivity(intent);
    }


    public void proceguir(View view) {
        Intent intent = new Intent(CadastroActivity.this, RegistarBebe.class);
        startActivity(intent);
    }
}