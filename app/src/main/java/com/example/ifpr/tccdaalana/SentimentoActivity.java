package com.example.ifpr.tccdaalana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SentimentoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentimento);
    }
    public void euTeAmo (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_te_amo);
        mediaPlayer.start();
    }
    public void euEstouFeliz (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_feliz);
        mediaPlayer.start();
    }
    public void euEstouTriste (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_triste);
        mediaPlayer.start();
    }
    public void euEstouComRaiva (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_com_raiva);
        mediaPlayer.start();
    }
    public void euEstouComMedo (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_com_medo);
        mediaPlayer.start();
    }
    public void euEstouDesapontado (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_desapontada);
        mediaPlayer.start();
    }
    public void euEstouChorando (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_chorando);
        mediaPlayer.start();
    }
    public void euEstouComCalor (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_com_calor);
        mediaPlayer.start();
    }
    public void euEstouSemPalavras (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_sem_palavras);
        mediaPlayer.start();
    }
    public void euEstouComSono (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_estou_com_sono);
        mediaPlayer.start();
    }

}
