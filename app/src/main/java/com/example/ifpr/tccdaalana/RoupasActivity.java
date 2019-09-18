package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;

public class RoupasActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roupas);
    }
    public void camiseta (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.camiseta);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Camiseta");
    }
    public void calca (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.calca);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Calça");
    }
    public void meiaCalca (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.meiacalca);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "MeiaCalça");
    }
    public void cachecol (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cachecol);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Cachecol");
    }
    public void oculos (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.oculos);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Oculos");
    }
    public void casacoDeFrio (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.casacodefrio);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "CasacoDeFrio");
    }
    public void meia (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.meiacalca);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Meia");
    }

    /*/    public void biquini (View v) throws IOException {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.biquini);
        mediaPlayer.start();
        RelatorioHelper.geraRelatorio(this, "Biquini");
    }/*/
    public void TelaRoupasComida(View v){
        Intent intent = new Intent(this, ComidaActivity.class);
        startActivity(intent);
    }

    public void TelaRoupasCasa(View v){
        Intent intent = new Intent(this,CasaActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasComunicacao(View v){
        Intent intent = new Intent(this, ComunicaçãoActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasCorpo(View v){
        Intent intent = new Intent(this, CorpoActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasDiversao(View v){
        Intent intent = new Intent(this,DiversaoActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasDor(View v){
        Intent intent = new Intent(this,DorActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasEscola(View v){
        Intent intent = new Intent(this,EscolaActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasFamilia(View v){
        Intent intent = new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasLetras(View v){
        Intent intent = new Intent(this,LetrasActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasNumeros(View v){
        Intent intent = new Intent(this,NumerosActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasNecessidades(View v){
        Intent intent = new Intent(this, NecessidadeActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasPablavrasBasicas(View v){
        Intent intent = new Intent(this,PalavrasBasicasActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasSentidos(View v){
        Intent intent = new Intent(this,SentidosActivity.class);
        startActivity(intent);
    }
    public void TelaRoupasSentimentos (View v){
        Intent intent = new Intent(this, SentimentoActivity.class);
        startActivity(intent);
    }
    public void voltarRoupas (View view){
        Intent intent = new Intent(this, PerfilFilhoActivity.class);
        startActivity(intent);
    }
}
