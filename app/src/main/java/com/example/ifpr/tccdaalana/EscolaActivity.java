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

public class EscolaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escola);
    }

    public void caderno (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Caderno");
    }
    public void estojo (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estojo);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Estojo");
    }
    public void quadroBranco (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.quadro_branco);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "QuadroBranco");
    }
    public void irAoBanheiro (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.iraobanheiro);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "IrAoBanheiro");
    }
    public void recreio (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recreio);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Recreio");
    }
    public void professor (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.professor);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Professor");
    }
    public void professora (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.professora);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Professora");
    }
    public void TelaEscolaComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaEscolaSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
    public void voltarEscola (View v){
        Intent intent = new Intent(this, PerfilFilhoActivity.class);
        startActivity(intent);
    }
}
