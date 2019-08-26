package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import bancodedados.DBController;

public class NumerosActivity extends AppCompatActivity {
    private DBController dbController = new DBController();
    private Date data = new Date();

    public Date getData() {
        return data;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }
    public void um (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.um);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Um",getData(),);
        geraRelatorio("Um");
    }
    public void dois (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dois);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Dois", ,);
        geraRelatorio("Dois");
    }
    public void tres (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tres);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Tres", ,);
        geraRelatorio("Tres");
    }
    public void quatro (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.quatro);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Quatro", ,);
        geraRelatorio("Quatro");
    }
    public void cinco (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cinco);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Cinco", ,);
        geraRelatorio("Cinco");
    }
    public void seis (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.seis);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Seis", ,);
        geraRelatorio("Seis");
    }
    public void sete (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sete);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Sete", ,);
        geraRelatorio("Sete");
    }
    public void oito (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.oito);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Oito",getData,);
        geraRelatorio("Oito");
    }
    public void nove (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nove);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Nove", ,);
        geraRelatorio("Nove");
    }
    public void dez (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dez);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Dez", ,);
        geraRelatorio("Dez");
    }
    public void TelaNumerosComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaNumerosSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
