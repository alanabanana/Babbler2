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

public class NecessidadeActivity extends Activity {
    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necessidade);

        }
      public void geraRelatorio(String botao) throws IOException {
    SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
    String dataFormatada = formataData.format(data);
    SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
    String horaFormatada = formataHora.format(data);
    dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
}
//    public void tomarBanho (View view) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
//        mediaPlayer.start();
//        geraRelatorio("TomarBanho");
//    }
//    public void fazerXixi (View view) throws IOException {
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.);
//        mediaPlayer.start();
//        geraRelatorio("FazerXixi");
//    }

    public void TelaNecessidadeComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadePablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaNecessidadeSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
