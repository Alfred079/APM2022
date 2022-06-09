package com.example.mamae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity2 extends AppCompatActivity {

    public Button fazerlogin;
    public TextView  criar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().hide();
    }
    public void abrirActivity(View view) {
        Intent intent = new Intent(LoginActivity2.this, CadastroActivity.class);
        startActivity(intent);
    }

    public void proceguir(View view) {
        Intent intent = new Intent(LoginActivity2.this, RegistarBebe.class);
        startActivity(intent);
    }
}