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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
    }

    public void euQueroChocolate(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_chocolate);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Chocolate");
    }

    public void euQueroComerPao(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_pao);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Pao");
    }

    public void euQueroComerBatataFrita(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_batata_frita);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "BatataFrita");
    }

    public void euQueroComerQueijo(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_queijo);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Queijo");
    }

    public void euQueroComerCarne(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_carne);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Carne");
    }

    public void euQueroComerHamburguer(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_hamburguer);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Hamburguer");
    }

    public void euQueroComerUva(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_uva);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Uva");
    }

    public void euQueroComerMacarrao(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_macarrao);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Macarrao");
    }

    public void euQueroComerMelancia(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_melancia);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Melancia");
    }

    public void euQueroComerOvo(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_ovo);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Ovo");
    }

    public void euQueroBeberAgua(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_agua);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Agua");
    }

    public void euQueroBeberRefri(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_refrigerante);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Refri");
    }

    public void euQueroBeberLeite(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_leite);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Leite");
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
    public void voltarComida (View view){
        Intent intent = new Intent(this, PerfilFilhoActivity.class);
        startActivity(intent);
    }
}
