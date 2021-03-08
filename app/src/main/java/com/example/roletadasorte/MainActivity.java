package com.example.roletadasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rodar(View view) {
       TextView texto = findViewById(R.id.textView3);

       int x = new Random().nextInt(21);
       texto.setText("O resultado é: " + x);
    }
}