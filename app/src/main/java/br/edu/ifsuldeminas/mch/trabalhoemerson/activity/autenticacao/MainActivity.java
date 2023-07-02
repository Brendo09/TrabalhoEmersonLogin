package br.edu.ifsuldeminas.mch.trabalhoemerson.activity.autenticacao;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsuldeminas.mch.trabalhoemerson.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configCliques();
    }

    private void configCliques(){
        findViewById(R.id.ib_voltar).setOnClickListener(view -> finish());
    }
}