package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

import bancodedados.DBController;

public class SentimentoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentimento);
    }
    public void TelaSentimentosComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaSentimentosSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }

    public void euTeAmo (View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eu_te_amo);
        mediaPlayer.start();
        //dbController.insertIntoRelatorio(emailDep, emailResp, "Eu Te Amo", Utils.getDate(), Utils.getTime());
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
