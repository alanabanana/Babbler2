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

public class LetrasActivity extends AppCompatActivity {
    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }
    public void a (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "A",horario,data);
        geraRelatorio("A");
    }
    public void b (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "B",horario,data);
        geraRelatorio("B");
    }
    public void c (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "C",horario,data);
        geraRelatorio("C");
    }
    public void d (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "D",horario,data);
        geraRelatorio("D");
    }
    public void e (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "E",horario,data);
        geraRelatorio("E");
    }
    public void f (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "G",horario,data);
        geraRelatorio("G");
    }
    public void g (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "G",horario,data);
        geraRelatorio("G");
    }
    public void h (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "H",horario,data);
        geraRelatorio("H");
    }
    public void i (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "I",horario,data);
        geraRelatorio("I");
    }
    public void j (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "J",horario,data);
        geraRelatorio("J");
    }
    public void k (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "K",horario,data);
        geraRelatorio("K");
    }
    public void l (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "L",horario,data);
        geraRelatorio("L");
    }
    public void m (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "M",horario,data);
        geraRelatorio("M");
    }
    public void n (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "N",horario,data);
        geraRelatorio("N");
    }
    public void o (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "O",horario,data);
        geraRelatorio("O");
    }
    public void p (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "P",horario,data);
        geraRelatorio("P");
    }
    public void q (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Q",horario,data);
        geraRelatorio("Q");
    }
    public void r (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "R",horario,data);
        geraRelatorio("R");
    }
    public void s (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "S",horario,data );
        geraRelatorio("S");
    }
    public void t (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "T",horario,data);
        geraRelatorio("T");
    }
    public void u (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "U",horario,data);
        geraRelatorio("U");
    }
    public void v (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "V",horario,data);
        geraRelatorio("V");
    }
    public void w (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "W",horario,data);
        geraRelatorio("W");
    }
    public void x (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "X",horario,data);
        geraRelatorio("X");
    }

    public void y (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Y",horario,data);
        geraRelatorio("Y");
    }
    public void z (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Z",horario,data);
        geraRelatorio("Z");
    }
    public void TelaLetrasComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaLetrasSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
