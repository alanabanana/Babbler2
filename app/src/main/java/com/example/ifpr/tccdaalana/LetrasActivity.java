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

public class LetrasActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra);
    }
    
    public void a (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.a);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "A");
    }
    public void b (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "B");
    }
    public void c (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.c);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "C");
    }
    public void d (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.d);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "D");
    }
    public void e (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "E");
    }
    public void f (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.f);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "F");
    }
    public void g (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.g);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "G");
    }
    public void h (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.h);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "H");
    }
    public void i (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.i);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "I");
    }
    public void j (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.j);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "J");
    }
    public void k (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.k);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "K");
    }
    public void l (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.l);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "L");
    }
    public void m (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.m);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "M");
    }
    public void n (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.n);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "N");
    }
    public void o (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.o);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "O");
    }
    public void p (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.p);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "P");
    }
    public void q (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.q);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Q");
    }
    public void r (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.r);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "R");
    }
    public void s (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.s);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "S");
    }
    public void t (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.t);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "T");
    }
    public void u (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.u);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "U");
    }
    public void v (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.v);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "V");
    }
    public void w (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.w);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "W");
    }
    public void x (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.x);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "X");
    }

    public void y (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.y);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Y");
    }
    public void z (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.z);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Z");
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
    public void voltarLetras (View view){
        Intent intent = new Intent(this, PerfilFilhoActivity.class);
        startActivity(intent);
    }
}
