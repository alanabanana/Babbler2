package com.example.ifpr.tccdaalana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ComidaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
    }
    public void euQueroChocolate(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_chocolate);
        mediaPlayer.start();
    }

    public void euQueroComerPao(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_pao);
        mediaPlayer.start();
    }

    public void euQueroComerBatataFrita(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_batata_frita);
        mediaPlayer.start();
    }

    public void euQueroComerQueijo(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_queijo);
        mediaPlayer.start();
    }

    public void euQueroComerCarne(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_carne);
        mediaPlayer.start();
    }

    public void euQueroComerHamburguer(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_hamburguer);
        mediaPlayer.start();
    }

    public void euQueroComerUva(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_uva);
        mediaPlayer.start();
    }

    public void euQueroComerMacarrao(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_macarrao);
        mediaPlayer.start();
    }

    public void euQueroComerMelancia(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_melancia);
        mediaPlayer.start();
    }

    public void euQueroComerOvo(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_ovo);
        mediaPlayer.start();
    }

    public void euQueroBeberAgua(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_beber_agua);
        mediaPlayer.start();
    }

    public void euQueroBeberRefri(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_beber_refrigerante);
        mediaPlayer.start();
    }

    public void euQueroBeberLeite(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_beber_leite);
        mediaPlayer.start();
    }
}
