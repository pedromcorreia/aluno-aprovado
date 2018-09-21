package com.example.pedro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class freq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freq);
        Intent it = getIntent();
        if(it != null){

            String nome = it.getStringExtra("nome");
            String nota1 = it.getStringExtra("nota1");
            String nota2 = it.getStringExtra("nota2");
            String frequencia = it.getStringExtra("frequencia");


            int n1 = Integer.parseInt(nota1.toString());
            int n2 = Integer.parseInt(nota2.toString());
            int fr = Integer.parseInt(frequencia.toString());


            int media = (n1 + n2)/2;
            String status = "";

            if((media >= 70) && fr >= 75){
                status = "aprovado";
            }
            else if(media>=40 && media<=69 && fr >= 75){
                status = "final";
            }
            else if(fr < 75) {
                status = "reprovado por falta";
            }
            else if(media < 40) {
                status = "reprovado por nota";
            }

            TextView output = (TextView)findViewById(R.id.resultado);
            output.setText(status);
        }
    }
}
