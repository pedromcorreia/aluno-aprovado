package com.example.pedro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.*;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mediaFinal(View view){

        EditText nome = (EditText)findViewById(R.id.nome);
        EditText nota1 = (EditText)findViewById(R.id.nota1);
        EditText nota2 = (EditText)findViewById(R.id.nota2);
        EditText frequencia = (EditText)findViewById(R.id.frequencia);


        Bundle params = new Bundle();


        params.putString("nome", String.valueOf(nome.getText().toString()));
        params.putString("nota1", String.valueOf(nota1.getText().toString()));
        params.putString("nota2", String.valueOf(nota2.getText().toString()));
        params.putString("frequencia", String.valueOf(frequencia.getText().toString()));

        Intent it = new Intent(this, freq.class);

        it.putExtras(params);
        startActivity(it);
        finish();
    }
}
