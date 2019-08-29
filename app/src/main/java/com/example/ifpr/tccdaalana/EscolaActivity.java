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

public class EscolaActivity extends AppCompatActivity {
    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escola);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }
    public void caderno (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.caderno);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Caderno",horario,data);
        geraRelatorio("Caderno");
    }
    public void estojo (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estojo);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Estojo",horario,data);
        geraRelatorio("Estojo");
    }
    public void quadroBranco (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.quadro_branco);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "QuadroBranco",horario,data);
        geraRelatorio("QuadroBranco");
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

}
