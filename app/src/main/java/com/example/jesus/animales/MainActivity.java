package com.example.jesus.animales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnSelva, btnGtankja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaComponentes();

        btnGtankja.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent granja = new Intent(getApplicationContext(),Granja.class);
                        startActivity(granja);
                    }
                }
        );
        btnSelva.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent domesticos = new Intent(getApplicationContext(),Domesticos.class);
                        startActivity(domesticos);
                    }
                }
        );
    }

    private void inicializaComponentes(){
        btnSelva=(ImageButton) findViewById(R.id.mainBtnSelva);
        btnGtankja=(ImageButton) findViewById(R.id.mainBtnGranja);
    }
}
