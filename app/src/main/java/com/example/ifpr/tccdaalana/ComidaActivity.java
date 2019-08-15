package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bancodedados.DBController;

public class ComidaActivity extends AppCompatActivity {

    private DBController dbController = new DBController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
    }
    public void euQueroChocolate(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_chocolate);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Chocolate", ,);

    }

    public void euQueroComerPao(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_pao);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Pao", ,);

    }

    public void euQueroComerBatataFrita(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_batata_frita);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Fries", ,);

    }

    public void euQueroComerQueijo(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_queijo);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Queijo", ,);

    }

    public void euQueroComerCarne(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_carne);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Carne", ,);

    }

    public void euQueroComerHamburguer(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_hamburguer);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Hamburguer", ,);

    }

    public void euQueroComerUva(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_uva);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Uva", ,);

    }

    public void euQueroComerMacarrao(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_macarrao);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Macarrao", ,);

    }

    public void euQueroComerMelancia(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_melancia);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Melancia", ,);

    }

    public void euQueroComerOvo(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_ovo);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Ovo", ,);

    }

    public void euQueroBeberAgua(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_agua);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Agua", ,);

    }

    public void euQueroBeberRefri(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_refrigerante);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Refri", ,);
    }

    public void euQueroBeberLeite(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.beber_leite);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Leite", ,);

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
