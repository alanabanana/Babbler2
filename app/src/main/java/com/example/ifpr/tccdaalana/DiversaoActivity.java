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

public class DiversaoActivity extends AppCompatActivity {
    private DBController dbController = new DBController();
    private Date data = new Date();
    private Time horario = new Time();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diversao);
    }
    public void geraRelatorio(String botao) throws IOException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(data);
        SimpleDateFormat formataHora = new SimpleDateFormat("hh-mm-ss");
        String horaFormatada = formataHora.format(data);
        dbController.insertIntoRelatorio(this, botao, horaFormatada, dataFormatada);
    }
    public void brincarAmigo(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_amigo);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "BrincarAmigo",horario,data);
        geraRelatorio("BrincarAmigo");
    }
    public void andarSkate (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_balanco);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Skate",horario,data);
        geraRelatorio("Skate");
    }
    public void cubos(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_cubo);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Cubos",horario,data);
        geraRelatorio("Cubos");
    }
    public void brincarCarrinho(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_carrinho);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Carrinho",horario,data);
        geraRelatorio("carrinho");
    }
   // public void brincarBoneca(View v) {
     //   MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_boneca);
       // mediaPlayer.start();
        //dbController.insertIntoRelatorio(this, "Boneca",horario,data);
        //geraRelatorio("Boneca");
    //}
  //  public void brincarDinossauro(View v) {
    //    MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_dinossauro);
      //  mediaPlayer.start();
     // dbController.insertIntoRelatorio(this, "Dinossauro",horario,data);
        //geraRelatorio("Dinossauro");
    //}
    public void tocarTeclado(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tocar_teclado);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Teclado",horario,data);
        geraRelatorio("Teclado");
    }
    public void videoGame(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jogar_videogame);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "VideoGame",horario,data);
        geraRelatorio("VideoGame");
    }
    public void balanço(View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_balanco);
        mediaPlayer.start();
        dbController.insertIntoRelatorio(this, "Balanco",horario,data);
        geraRelatorio("Balanco");
    }
    public void TelaDiversaoComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoRoupas(View v){
        Intent intent = new Intent(this, RoupasActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaDiversaoSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
}
