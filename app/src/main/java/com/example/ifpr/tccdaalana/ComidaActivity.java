package com.example.ifpr.tccdaalana;

import android.app.Activity;
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

public class ComidaActivity extends Activity {
    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }

    public void euQueroChocolate(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_chocolate);
        mediaPlayer.start();
        geraRelatorio("Chocolate");
    }

    public void euQueroComerPao(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_pao);
        mediaPlayer.start();
        geraRelatorio("Pao");
    }

    public void euQueroComerBatataFrita(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_batata_frita);
        mediaPlayer.start();
        geraRelatorio("BatataFrita");
    }

    public void euQueroComerQueijo(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_queijo);
        mediaPlayer.start();
        geraRelatorio("Queijo");
    }

    public void euQueroComerCarne(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_carne);
        mediaPlayer.start();
        geraRelatorio("Carne");
    }

    public void euQueroComerHamburguer(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_hamburguer);
        mediaPlayer.start();
        geraRelatorio("Hamburguer");
    }

    public void euQueroComerUva(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_uva);
        mediaPlayer.start();
        geraRelatorio("Uva");
    }

    public void euQueroComerMacarrao(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_macarrao);
        mediaPlayer.start();
        geraRelatorio("Macarrao");
    }

    public void euQueroComerMelancia(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_melancia);
        mediaPlayer.start();
        geraRelatorio("Melancia");
    }

    public void euQueroComerOvo(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_ovo);
        mediaPlayer.start();
        geraRelatorio("Ovo");
    }

    public void euQueroBeberAgua(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_agua);
        mediaPlayer.start();
        geraRelatorio("Agua");
    }

    public void euQueroBeberRefri(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_refrigerante);
        mediaPlayer.start();
        geraRelatorio("Refri");
    }

    public void euQueroBeberLeite(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_leite);
        mediaPlayer.start();
        geraRelatorio("Leite");
    }
    public void TelaComidaCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaComidaComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaComidaCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaComidaDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaComidaDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaComidaEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaComidaFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaComidaLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaComidaNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaComidaNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaComidaPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaComidaRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaComidaSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaComidaSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
