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
        }else if (nomeImagem.equals("fish")){
        }else if (nomeImagem.equals("steak")){
        }else if (nomeImagem.equals("turkey")){
        }else if (nomeImagem.equals("carrot")){
        }else if (nomeImagem.equals("egg")){
        }else if (nomeImagem.equals("spaguetti")){
        }else if (nomeImagem.equals("milk")){
        }else if (nomeImagem.equals("water")){
        }else if (nomeImagem.equals("iceCream")){
        }else if (nomeImagem.equals("bread ")){
        }else if (nomeImagem.equals("can")){
        }else if (nomeImagem.equals("smile")){
        }else if (nomeImagem.equals("sad")){
        }else if (nomeImagem.equals("laughing")){
        }else if (nomeImagem.equals("crying")){
        }else if (nomeImagem.equals("inLove")){
        }else if (nomeImagem.equals("stress")){
        }else if (nomeImagem.equals("laugh")){
        }else if (nomeImagem.equals("sleep")){
        }else if (nomeImagem.equals("shock")){
        }else if (nomeImagem.equals("maisSad")){
        }else if (nomeImagem.equals("creepy")){
        }else if (nomeImagem.equals("shocked")){
        }else if (nomeImagem.equals("suspicious")){
        }else if (nomeImagem.equals("sick")){
        }else if (nomeImagem.equals("dissapointment")){
        }else if (nomeImagem.equals("thinking")){
        }else if (nomeImagem.equals("mudo")){
        }else if (nomeImagem.equals("angry")){
        }else if (nomeImagem.equals("sleepy")){
        }else if (nomeImagem.equals("vomit")){
        }else if (nomeImagem.equals("muitoAngry")){
        }else if (nomeImagem.equals("hot")){
        }else if (nomeImagem.equals("one")){
        }else if (nomeImagem.equals("two")){
        }else if (nomeImagem.equals("three")){
        }else if (nomeImagem.equals("four")){
        }else if (nomeImagem.equals("five")){
        }else if (nomeImagem.equals("six")){
        }else if (nomeImagem.equals("seven")){
        }else if (nomeImagem.equals("eight")){
        }else if (nomeImagem.equals("nine")){
        }else if (nomeImagem.equals("ten")){
        }else if (nomeImagem.equals("twenty")){
        }else if (nomeImagem.equals("thirty")){
        }else if (nomeImagem.equals("forty")){
        }else if (nomeImagem.equals("fifty")){
        }else if (nomeImagem.equals("sixty")){
        }else if (nomeImagem.equals("seventy")){
        }else if (nomeImagem.equals("eighty")){
        }else if (nomeImagem.equals("ninety")){
        }else if (nomeImagem.equals("oneHundred")){
        }else if (nomeImagem.equals("house")){
        }else if (nomeImagem.equals("bed")){
        }else if (nomeImagem.equals("toilet")){
        }else if (nomeImagem.equals("shower")){
        }else if (nomeImagem.equals("bathtub")){
        }else if (nomeImagem.equals("toiletPaper")){
        }else if (nomeImagem.equals("toothbrush")){
        }else if (nomeImagem.equals("hairDryer")){
        }else if (nomeImagem.equals("teddear")){
        }else if (nomeImagem.equals("ball")){
        }else if (nomeImagem.equals("chess")){
        }else if (nomeImagem.equals("skateboard")){
        }else if (nomeImagem.equals("gameboy")){
        }else if (nomeImagem.equals("gameConsole")){
        }else if (nomeImagem.equals("robot")){
        }else if (nomeImagem.equals("kids")){
        }else if (nomeImagem.equals("swing")){
        }else if (nomeImagem.equals("cubes")){
        }else if (nomeImagem.equals("keyboard")){
        }else if (nomeImagem.equals("car")){
        }else if (nomeImagem.equals("racing")){
        }else if (nomeImagem.equals("brick")){
        }else if (nomeImagem.equals("puzzle")){
        }else if (nomeImagem.equals("doll")){
        }else if (nomeImagem.equals("sandCastle")){
        }else if (nomeImagem.equals("tricycle")){
        }else if (nomeImagem.equals("dinosaur")){
        }else if (nomeImagem.equals("books")){
        }else if (nomeImagem.equals("notebook")){
        }else if (nomeImagem.equals("student")){
        }else if (nomeImagem.equals("teacher")){
        }else if (nomeImagem.equals("whiteboard")){
        }else if (nomeImagem.equals("art")){
        }else if (nomeImagem.equals("pencilCase")){
        }else if (nomeImagem.equals("think")){
        }else if (nomeImagem.equals("crayon")){
        }else if (nomeImagem.equals("elephant")){
        }else if (nomeImagem.equals("chicken")){
        }else if (nomeImagem.equals("pig")){
        }else if (nomeImagem.equals("rabbit")){
        }else if (nomeImagem.equals("squirrel")){
        }else if (nomeImagem.equals("dog")){
        }else if (nomeImagem.equals("snake")){
        }else if (nomeImagem.equals("peru")){
        }else if (nomeImagem.equals("turtle")){
        }else if (nomeImagem.equals("hen")){
        }else if (nomeImagem.equals("monkey")){
        }else if (nomeImagem.equals("frog")){
        }else if (nomeImagem.equals("fish")){
        }else if (nomeImagem.equals("giraffe")){
        }else if (nomeImagem.equals("ladybug")){
        }else if (nomeImagem.equals("cow")){
        }else if (nomeImagem.equals("tiger")){
        }else if (nomeImagem.equals("shark")){
        }else if (nomeImagem.equals("cat")){
        }else if (nomeImagem.equals("koala")){
        }else if (nomeImagem.equals("zebra")){
        }else if (nomeImagem.equals("fox")){
        }else if (nomeImagem.equals("octopus")){















        }

    }

    public void EditarBotaoEmOutraTela (View v ){
        Intent intent = new Intent(this,AdicionarBotaoActivity.class);
        startActivity(intent);
    }

}
