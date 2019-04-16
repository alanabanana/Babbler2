package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
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

        AdicionarBotaoActivity.this.setContentView(R.layout.activity_adicionar_botao);
        buttonStart = (ImageButton) findViewById(R.id.StartAudio);
        buttonStop = (ImageButton) findViewById(R.id.StopAudio);

        buttonStop.setEnabled(false);

        buttonStart.setOnClickListener ( new View.OnClickListener() {

            public void onClick (View view){

            }
        });

    }
    public void EditarBotaoEmOutraTela (View v ){
        Intent intent = new Intent(this,AdicionarBotaoActivity.class);
        startActivity(intent);
    }

}
