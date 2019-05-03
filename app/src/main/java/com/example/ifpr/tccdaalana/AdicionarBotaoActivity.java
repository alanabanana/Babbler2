package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AdicionarBotaoActivity extends Activity {

    Button StartAudio, StopAudio;
    String audioSaved = null;
    ImageButton buttonStart;
    ImageButton buttonStop;
    MediaRecorder mediaRecorder;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_botao);

        Bundle bundle = getIntent().getExtras();
        String nomeImagem = bundle.getString("Imagem");
        if (nomeImagem != null) {
            colocarImagemAdequada(nomeImagem);
        }
        AdicionarBotaoActivity.this.setContentView(R.layout.activity_adicionar_botao);
        buttonStart = (ImageButton) findViewById(R.id.StartAudio);
        buttonStop = (ImageButton) findViewById(R.id.StopAudio);

        buttonStop.setEnabled(false);

        buttonStart.setOnClickListener ( new View.OnClickListener() {

            public void onClick (View view){

            }
        });

    }

    private void colocarImagemAdequada(String nomeImagem) {
        ImageButton imagemButtonEscolhido = (ImageButton) findViewById(R.id.imageButtonEscolhido);
        if (nomeImagem.equals("chocolate")) {
            imagemButtonEscolhido.setBackgroundResource(R.drawable.chocolate);
        }else if (nomeImagem.equals("cachorroQuente")) {
        }else if (nomeImagem.equals("Hamburguer")){
        }else if (nomeImagem.equals("Pizza")){
        }else if (nomeImagem.equals("batataFrita")) {
        }else if (nomeImagem.equals("bacon")){
        }else if (nomeImagem.equals("apple")) {
        }else if (nomeImagem.equals("grapes")){
        }else if (nomeImagem.equals("orange")){
        }else if (nomeImagem.equals("strawberry")){
        }else if (nomeImagem.equals("watermelon")){
        }else if (nomeImagem.equals("pineapple")){
        }else if (nomeImagem.equals("cherrie")){
        }else if (nomeImagem.equals("lemon")){
        }else if (nomeImagem.equals("banana")){
        }else if (nomeImagem.equals("pear")){
        }else if (nomeImagem.equals("corn")){
        }else if (nomeImagem.equals("avocado")){
        }else if (nomeImagem.equals("sushi")){
        }else if (nomeImagem.equals("cauliflower")){
        }else if (nomeImagem.equals("pumpkin")){
        }else if (nomeImagem.equals("tomato")){
        }else if (nomeImagem.equals("cheese")){

        }
    }

    public void EditarBotaoEmOutraTela (View v ){
        Intent intent = new Intent(this,AdicionarBotaoActivity.class);
        startActivity(intent);
    }

}
