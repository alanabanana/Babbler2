package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bancodedados.DBController;

public class DorActivity extends AppCompatActivity {

    private DBController dbController = new DBController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dor);
    }
    public void dorNoPeito (View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Peito", ,);
    }
    public void dorNaGarganta (View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Garganta", ,);
    }
    public void dorDeBarriga (View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Barriga", ,);
    }
    public void dorDeCabeca (View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Cabeça", ,);

    }
    public void TelaDorComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaDorCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaDorComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaDorCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaDorDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaDorEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaDorFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaDorLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaDorNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaDorNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaDorPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaDorRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaDorSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaDorSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
