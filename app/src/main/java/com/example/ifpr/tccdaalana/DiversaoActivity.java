package com.example.ifpr.tccdaalana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DiversaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diversao);
    }
    public void brincarAmigo(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_amigo);
        mediaPlayer.start();
    }
    public void andarSkate (View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_balanco);
        mediaPlayer.start();
    }
    public void cubos(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_cubo);
        mediaPlayer.start();
    }
    public void brincarCarrinho(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_carrinho);
        mediaPlayer.start();
    }
   // public void brincarBoneca(View v) {
     //   MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_boneca);
       // mediaPlayer.start();
    //}
  //  public void brincarDinossauro(View v) {
    //    MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_dinossauro);
      //  mediaPlayer.start();
    //}
    public void tocarTeclado(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tocar_teclado);
        mediaPlayer.start();
    }
    public void videoGame(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jogar_videogame);
        mediaPlayer.start();
    }
    public void balanço(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar_balanco);
        mediaPlayer.start();
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
