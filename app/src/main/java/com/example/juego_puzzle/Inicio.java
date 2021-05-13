package com.example.juego_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    Button play ,salir,creditos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);
        play = findViewById(R.id.btn_iniciar_juego);
        salir = findViewById(R.id.btn_salir);
        creditos=findViewById(R.id.btn_creditos);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("iniciando juego...");
                iniciarJuego();
            }
        });

        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("iniciando juego...");
              //  iniciarCreditos();
            }
        });
    }
    private void iniciarJuego(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}