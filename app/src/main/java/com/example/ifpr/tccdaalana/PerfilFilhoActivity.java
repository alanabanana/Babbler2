package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class PerfilFilhoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_filho);
    }


    public void sairLogin(View v){
        SharedPreferences login = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = login.edit();
        editor.remove("email_dep");
        editor.remove("senha");
        editor.commit();

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
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
    public void euQueroChocolate (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_chocolate);
        mediaPlayer.start();
    }
    public void euQueroComerPao (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_pao);
        mediaPlayer.start();
    }
    public void euQueroComerBatataFrita (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_batata_frita);
        mediaPlayer.start();
    }
    public void euQueroComerQueijo (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_queijo);
        mediaPlayer.start();
    }
    public void euQueroComerCarne (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_carne);
        mediaPlayer.start();
    }
    public void euQueroComerHamburguer (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_hamburguer);
        mediaPlayer.start();
    }
    public void euQueroComerUva (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_uva);
        mediaPlayer.start();
    }
    public void euQueroComerMacarrao (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_macarrao);
        mediaPlayer.start();
    }
    public void euQueroComerMelancia (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_melancia);
        mediaPlayer.start();
    }
    public void euQueroComerOvo (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_comer_ovo);
        mediaPlayer.start();
    }
    public void euQueroBeberAgua (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_beber_agua);
        mediaPlayer.start();
    }
    public void euQueroBeberRefri (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_beber_refrigerante);
        mediaPlayer.start();
    }
    public void euQueroBeberLeite (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_quero_beber_leite);
        mediaPlayer.start();
    }
}


