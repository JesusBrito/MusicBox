package com.example.jesus.animales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Granja extends AppCompatActivity {
    ImageButton listaBtnImg[]= new ImageButton[4];
    MediaPlayer mediaPlayer =new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granja);
        inicializarComponentes();

        for (int i=0;i<listaBtnImg.length;i++){
            listaBtnImg[i].setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            imageOnClicked(view);
                        }
                    }
            );
        }
    }

    private void inicializarComponentes(){
        listaBtnImg[0]=(ImageButton) findViewById(R.id.ImbCaballo);
        listaBtnImg[1]=(ImageButton) findViewById(R.id.ImbGallo);
        listaBtnImg[2]=(ImageButton) findViewById(R.id.ImbCerdito);
        listaBtnImg[3]=(ImageButton) findViewById(R.id.ImbVaca);
    }

    private void imageOnClicked(View sender){
        if (mediaPlayer!=null){
            mediaPlayer.release();
        }
        int id = sender.getId();
        if (id==R.id.ImbVaca){
            mediaPlayer=MediaPlayer.create(this,R.raw.die_kuh);
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }else if (id==R.id.ImbGallo){
            mediaPlayer=MediaPlayer.create(this,R.raw.der_hahn);
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }else if (id==R.id.ImbCerdito){
            mediaPlayer=MediaPlayer.create(this,R.raw.cerdito);
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }else{
            mediaPlayer=MediaPlayer.create(this,R.raw.das_pferd);
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }

}


