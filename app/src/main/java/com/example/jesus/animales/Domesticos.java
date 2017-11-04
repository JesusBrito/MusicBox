package com.example.jesus.animales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Domesticos extends AppCompatActivity {
    ImageButton listaBtnImg[]= new ImageButton[4];
    MediaPlayer Player =new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domesticos);
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
        listaBtnImg[0]=(ImageButton) findViewById(R.id.ImbPez);
        listaBtnImg[1]=(ImageButton) findViewById(R.id.ImbGato);
        listaBtnImg[2]=(ImageButton) findViewById(R.id.ImbTortuga);
        listaBtnImg[3]=(ImageButton) findViewById(R.id.ImbPerro);
    }

    private void imageOnClicked(View sender){
        if (Player!=null){
            Player.release();
        }
        int id = sender.getId();
        if (id==R.id.ImbPez){
            Player=MediaPlayer.create(this,R.raw.goldfisch);
            Player.seekTo(0);
            Player.start();
        }else if (id==R.id.ImbGato){
            Player=MediaPlayer.create(this,R.raw.katze);
            Player.seekTo(0);
            Player.start();
        }else if (id==R.id.ImbTortuga){
            Player=MediaPlayer.create(this,R.raw.schildkrote);
            Player.seekTo(0);
            Player.start();
        }else{
            Player=MediaPlayer.create(this,R.raw.hunt);
            Player.seekTo(0);
            Player.start();
        }
    }
}
