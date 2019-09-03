package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.Time;
import android.view.View;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import bancodedados.DBController;

public class SentidosActivity extends AppCompatActivity {
    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentidos);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }
//    public void ver (View v) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ver);
//        mediaPlayer.start();
//        geraRelatorio("Visao");
//    }
//    public void tato (View v) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tato);
//        mediaPlayer.start();
//        geraRelatorio("Tato");
//    }
//    public void cheirar (View v) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cheirar);
//        mediaPlayer.start();
//        geraRelatorio("Cheirar");
//    }
//    public void escutar (View v) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.escutar);
//        mediaPlayer.start();
//        geraRelatorio("Escutar");
//    }
//    public void paladar (View v) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.paladar);
//        mediaPlayer.start();
//        geraRelatorio("Paladar");
//    }
    public void TelaSentidosComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaSentidosSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
