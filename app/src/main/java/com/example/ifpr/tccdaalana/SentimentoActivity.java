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

public class SentimentoActivity extends AppCompatActivity {
    public class SentidosActivity extends AppCompatActivity {
        private DBController dbController = new DBController();
        private Date data = new Date();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentimento);
    }
        public void geraRelatorio(String botao) throws IOException {
            SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
            String dataFormatada = formataData.format(data);
            SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
            String horaFormatada = formataHora.format(data);
            dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
        }

    public void euTeAmo (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.te_amo);
        mediaPlayer.start();
        geraRelatorio("TeAmo");
    }
    public void euEstouFeliz (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_feliz);
        mediaPlayer.start();
        geraRelatorio("Feliz");
    }
    public void euEstouTriste (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_triste);
        mediaPlayer.start();
        geraRelatorio("Triste");
    }
    public void euEstouComRaiva (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_com_raiva);
        mediaPlayer.start();
        geraRelatorio("Raiva");
    }
    public void euEstouComMedo (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_com_medo);
        mediaPlayer.start();
        geraRelatorio("Medo");
    }
    public void euEstouDesapontado (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_desapontado);
        mediaPlayer.start();
        geraRelatorio("Desapontado");
    }
    public void euEstouChorando (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_chorando);
        mediaPlayer.start();
        geraRelatorio("Chorando");
    }
    public void euEstouComCalor (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_com_calor);
        mediaPlayer.start();
        geraRelatorio("Calor");
    }
    public void euEstouSemPalavras (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_sem_palavras);
        mediaPlayer.start();
        geraRelatorio("SemPalavras");
    }
    public void euEstouComSono (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estou_com_sono);
        mediaPlayer.start();
        geraRelatorio("Sono");
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
    }
}
