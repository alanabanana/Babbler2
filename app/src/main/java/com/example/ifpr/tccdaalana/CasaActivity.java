package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import bancodedados.DBController;

public class CasaActivity extends Activity {

    private DBController dbController = new DBController();
    private Date data = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa);
    }
   // public void cama (View v) {
     //   MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cama);
       // mediaPlayer.start();
    //}
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }

    public void cama(View v) throws IOException {
     MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cama);
     mediaPlayer.start();
     dbController.insertIntoRelatorio(this, "Cama", ,);
     geraRelatorio("Cama");
    }

    public void mesa(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.mesa);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Mesa", ,);
        geraRelatorio("Mesa");
    }
    public void cozinha (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cozinha);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Cozinha", ,);
        geraRelatorio("Cozinha");
    }
    public void garagem(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.garagem);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Garagem", ,);
        geraRelatorio("Garagem");
    }
    public void jardim(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jardim);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Jardim", ,);

    }
    public void minhaCasa(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.esta_e_a_minha_casa);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Minhacasa", ,);

    }
    public void sala(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sala);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Sala", ,);

    }
    public void TelaCasaComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaCasaComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaCasaCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaCasaDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaCasaDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaCasaEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaCasaFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaCasaLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaCasaNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaCasaNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaCasaPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaCasaRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaCasaSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaCasaSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
