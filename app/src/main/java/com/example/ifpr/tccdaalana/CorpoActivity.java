package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import bancodedados.DBController;

public class CorpoActivity extends AppCompatActivity {

    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corpo);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }
    public void orelha (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Orelha",horario,data);
        geraRelatorio("Orelha");
    }
    public void olho (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Olho",horario,data);
        geraRelatorio("Olho");
    }
    public void nariz (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Nariz",horario,data);
        geraRelatorio("Nariz");
    }
    public void brain (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Cerebro",horario,data);
        geraRelatorio("Cerebro");
    }
    public void TelaCorpoComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaCorpoSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
