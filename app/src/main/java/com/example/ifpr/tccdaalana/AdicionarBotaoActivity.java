package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import android.app.Application;
import android.content.Context;
import bancodedados.DBController;

public class AdicionarBotaoActivity extends Activity {
//    private Context context;
//    private MyApp my_instance;

    ImageButton buttonStart;
    ImageButton buttonStop;
    MediaRecorder mediaRecorder;
    DBController dbController = new DBController();
    File outputDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_botao);
        File outputDir = getApplicationContext().getCacheDir();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String nomeImagem = bundle.getString("Imagem");
            if (nomeImagem != null) {
                colocarImagemAdequada(nomeImagem);
            }
        }
        AdicionarBotaoActivity.this.setContentView(R.layout.activity_adicionar_botao);
        buttonStart = (ImageButton) findViewById(R.id.StartAudio);
        buttonStop = (ImageButton) findViewById(R.id.StopAudio);
        buttonStop.setEnabled(false);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void comecarGravacao(View v) throws IOException {
        buttonStart.setEnabled(false);
        buttonStop.setEnabled(true);
        //CODIGO PARA REALIZAR GRAVACAO
//        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
//        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
//        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
//        mediaRecorder.setOutputFile(outputDir + "/teste.3gpp");
//        mediaRecorder.prepare();
//        mediaRecorder.start();
//        salvarAudio();
    }

    private Context MyApp(Context context) {
        context = context;
        return context;
    }

    private void salvarAudio() {
        ImageButton imageButtonAudio = findViewById(R.id.imageButtonEscolhido);
        Drawable d = imageButtonAudio.getBackground();
        BitmapDrawable bitDw = ((BitmapDrawable) d);
        Bitmap bitmap = bitDw.getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        String imageInString = stream.toString();

        EditText campoNomeAudio = findViewById(R.id.audioNameEditText);
        String nome = campoNomeAudio.getText().toString();

        //dbController.insertIntoAtividades(getApplicationContext(), nome, imageInString, )
    }

    public void pausarGravacao(View v) {
        buttonStart.setEnabled(true);
        buttonStop.setEnabled(false);
        //CODIGO PARA PAUSAR GRAVACAO
        mediaRecorder.stop();
    }

    private void colocarImagemAdequada(String nomeImagem) {
        ImageButton imagemButtonEscolhido = (ImageButton) findViewById(R.id.imageButtonEscolhido);
        if (nomeImagem.equals("chocolate")) {
            imagemButtonEscolhido.setBackgroundResource(R.drawable.chocolate);
        }else if (nomeImagem.equals("cachorroQuente")) {
            imagemButtonEscolhido.setBackgroundResource(R.drawable.hotdog);
        }else if (nomeImagem.equals("Hamburguer")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.hamburguer);
        }else if (nomeImagem.equals("pizza")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.pizza);
        }else if (nomeImagem.equals("fries")) {
            imagemButtonEscolhido.setBackgroundResource(R.drawable.fries);
        }else if (nomeImagem.equals("bacon")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.bacon);
        }else if (nomeImagem.equals("apple")) {
            imagemButtonEscolhido.setBackgroundResource(R.drawable.apple);
        }else if (nomeImagem.equals("grapes")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.grapes);
        }else if (nomeImagem.equals("orange")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.orange);
        }else if (nomeImagem.equals("strawberry")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.strawberry);
        }else if (nomeImagem.equals("watermelon")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.watermelon);
        }else if (nomeImagem.equals("pineapple")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.pineapple);
        }else if (nomeImagem.equals("cherrie")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.cherries);
        }else if (nomeImagem.equals("lemon")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.lemon);
        }else if (nomeImagem.equals("banana")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.banana);
        }else if (nomeImagem.equals("pear")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.pear);
        }else if (nomeImagem.equals("corn")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.corn);
        }else if (nomeImagem.equals("avocado")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.avocado);
        }else if (nomeImagem.equals("sushi")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sushi);
        }else if (nomeImagem.equals("cauliflower")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.cauliflower);
        }else if (nomeImagem.equals("pumpkin")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.pumpkin);
        }else if (nomeImagem.equals("tomato")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.tomato);
        }else if (nomeImagem.equals("cheese")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.cheese);
        }else if (nomeImagem.equals("fish")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.fish);
        }else if (nomeImagem.equals("steak")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.steak);
        }else if (nomeImagem.equals("turkey")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.turkey);
        }else if (nomeImagem.equals("carrot")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.carrot);
        }else if (nomeImagem.equals("egg")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.egg);
        }else if (nomeImagem.equals("spaguetti")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.spaguetti);
        }else if (nomeImagem.equals("milk")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.milk);
        }else if (nomeImagem.equals("water")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.water);
        }else if (nomeImagem.equals("iceCream")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.icecream);
        }else if (nomeImagem.equals("bread ")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.bread);
        }else if (nomeImagem.equals("can")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.can);
        }else if (nomeImagem.equals("smile")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.smile);
        }else if (nomeImagem.equals("sad")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sad);
        }else if (nomeImagem.equals("laughing")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.laughing);
        }else if (nomeImagem.equals("crying")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.crying);
        }else if (nomeImagem.equals("inLove")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.inlove);
        }else if (nomeImagem.equals("stress")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.stress);
        }else if (nomeImagem.equals("laugh")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.laugh);
        }else if (nomeImagem.equals("sleep")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sleep);
        }else if (nomeImagem.equals("shock")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.shock);
        }else if (nomeImagem.equals("maisad")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.maisad);
        }else if (nomeImagem.equals("creepy")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.creepy);
        }else if (nomeImagem.equals("shocked")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.shocked);
        }else if (nomeImagem.equals("suspicious")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.suspicious);
        }else if (nomeImagem.equals("sick")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sick);
        }else if (nomeImagem.equals("dissapointment")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.dissapointment);
        }else if (nomeImagem.equals("thinking")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.thinking);
        }else if (nomeImagem.equals("mudo")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.muted);
        }else if (nomeImagem.equals("angry")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.angry);
        }else if (nomeImagem.equals("sleepy")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sleepy);
        }else if (nomeImagem.equals("vomit")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.vomit);
        }else if (nomeImagem.equals("muitoangry")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.muitoangry);
        }else if (nomeImagem.equals("hot")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.hot);
        }else if (nomeImagem.equals("one")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.one);
        }else if (nomeImagem.equals("two")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.two);
        }else if (nomeImagem.equals("three")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.three);
        }else if (nomeImagem.equals("four")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.four);
        }else if (nomeImagem.equals("five")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.five);
        }else if (nomeImagem.equals("six")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.six);
        }else if (nomeImagem.equals("seven")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.seven);
        }else if (nomeImagem.equals("eight")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.eight);
        }else if (nomeImagem.equals("nine")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.nine);
        }else if (nomeImagem.equals("ten")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.ten);
        }else if (nomeImagem.equals("twenty")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.twenty);
        }else if (nomeImagem.equals("thirty")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.thirty);
        }else if (nomeImagem.equals("forty")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.forty);
        }else if (nomeImagem.equals("fifty")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.fifty);
        }else if (nomeImagem.equals("sixty")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sixty);
        }else if (nomeImagem.equals("seventy")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.seventy);
        }else if (nomeImagem.equals("eighty")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.eighty);
        }else if (nomeImagem.equals("ninety")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.ninety);
        }else if (nomeImagem.equals("onehundred")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.onehundred);
        }else if (nomeImagem.equals("house")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.house);
        }else if (nomeImagem.equals("bed")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.bed);
        }else if (nomeImagem.equals("toilet")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.toilet);
        }else if (nomeImagem.equals("shower")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.shower);
        }else if (nomeImagem.equals("bathtub")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.bathtub);
        }else if (nomeImagem.equals("toiletpaper")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.toiletpaper);
        }else if (nomeImagem.equals("toothbrush")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.toothbrush);
        }else if (nomeImagem.equals("hairDryer")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.hairdryer);
        }else if (nomeImagem.equals("teddear")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.teddybear);
        }else if (nomeImagem.equals("ball")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.ball);
        }else if (nomeImagem.equals("chess")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.chess);
        }else if (nomeImagem.equals("skateboard")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.skateboard);
        }else if (nomeImagem.equals("gameboy")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.gameboy);
        }else if (nomeImagem.equals("gameConsole")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.gameconsole);
        }else if (nomeImagem.equals("robot")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.robot);
        }else if (nomeImagem.equals("kids")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.kids);
        }else if (nomeImagem.equals("swing")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.swing);
        }else if (nomeImagem.equals("cubes")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.cubes);
        }else if (nomeImagem.equals("keyboard")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.keyboard);
        }else if (nomeImagem.equals("car")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.car);
        }else if (nomeImagem.equals("racing")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.racing);
        }else if (nomeImagem.equals("brick")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.brick);
        }else if (nomeImagem.equals("puzzle")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.puzzle);
        }else if (nomeImagem.equals("doll")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.doll);
        }else if (nomeImagem.equals("sandCastle")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.sandcastle);
        }else if (nomeImagem.equals("tricycle")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.tricycle);
        }else if (nomeImagem.equals("dinosaur")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.dinosaur);
        }else if (nomeImagem.equals("books")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.books);
        }else if (nomeImagem.equals("notebook")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.notebook);
        }else if (nomeImagem.equals("student")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.student);
        }else if (nomeImagem.equals("teacher")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.teacher);
        }else if (nomeImagem.equals("whiteboard")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.whiteboard);
        }else if (nomeImagem.equals("art")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.art);
        }else if (nomeImagem.equals("pencilCase")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.pencilcase);
        }else if (nomeImagem.equals("think")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.think);
        }else if (nomeImagem.equals("crayon")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.crayon);
        }else if (nomeImagem.equals("elephant")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.elephant);
        }else if (nomeImagem.equals("chicken")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.chicken);
        }else if (nomeImagem.equals("pig")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.pig);
        }else if (nomeImagem.equals("rabbit")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.rabbit);
        }else if (nomeImagem.equals("squirrel")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.squirrel);
        }else if (nomeImagem.equals("dog")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.dog);
        }else if (nomeImagem.equals("snake")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.snake);
        }else if (nomeImagem.equals("peru")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.peru);
        }else if (nomeImagem.equals("turtle")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.turtle);
        }else if (nomeImagem.equals("hen")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.hen);
        }else if (nomeImagem.equals("monkey")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.monkey);
        }else if (nomeImagem.equals("frog")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.frog);
        }else if (nomeImagem.equals("fish")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.fish);
        }else if (nomeImagem.equals("giraffe")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.giraffe);
        }else if (nomeImagem.equals("ladybug")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.ladybug);
        }else if (nomeImagem.equals("cow")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.cow);
        }else if (nomeImagem.equals("tiger")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.tiger);
        }else if (nomeImagem.equals("shark")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.shark);
        }else if (nomeImagem.equals("cat")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.cat);
        }else if (nomeImagem.equals("koala")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.koala);
        }else if (nomeImagem.equals("zebra")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.zebra);
        }else if (nomeImagem.equals("fox")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.fox);
        }else if (nomeImagem.equals("octopus")){
            imagemButtonEscolhido.setBackgroundResource(R.drawable.octopus);
        }

    }

    public void addImagem (View v ){
        Intent intent = new Intent(this,ImagemActivity.class);
        startActivity(intent);
    }

}
