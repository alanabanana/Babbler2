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

public class FamiliaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);
    }

    public void mae(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_chocolate);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Mae");
    }
    public void pai(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.comer_chocolate);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Pai");
    }
    public void avoHomem (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.avoh);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "avoHomem");
    }
    public void avoMulher (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.avoh);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "avoMulher");
    }
    public void irmao (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.irmao);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Irmao");
    }
    public void irma (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.irma);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Irma");
    }


    public void TelaFamiliaComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaFamiliaSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
    public void voltarFamilia (View v){
        Intent intent = new Intent(this, PerfilFilhoActivity.class);
        startActivity(intent);
    }

}
