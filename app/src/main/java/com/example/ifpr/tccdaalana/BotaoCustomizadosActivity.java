package com.example.ifpr.tccdaalana;

import android.Manifest;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import bancodedados.DBController;

public class BotaoCustomizadosActivity extends Activity {

    private ArrayList<String> audioFileDirs = new ArrayList<String>();
    private ArrayList<String> fileNames = new ArrayList<String>();
    private Integer index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botao_customizado);
        LinearLayout linearLayout = findViewById(R.id.layoutBotaoCustomizado);
        JSONArray jsonArray = lerAtividades();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                index = i;
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                fileNames.add(jsonObject.getString("Nome"));
                String audio = jsonObject.getString("Audio");
                String nomeImagem = jsonObject.getString("Imagem");
                baixarAudio(audio);
                ImageButton imageButton = new ImageButton(BotaoCustomizadosActivity.this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(450, 450);
                imageButton.setLayoutParams(layoutParams);
                colocarImagemNoBotao(imageButton, nomeImagem);
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri uriAudio = Uri.parse(audioFileDirs.get(index));
                        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), uriAudio);
                        mediaPlayer.start();
                        try {
                            RelatorioHelper.geraRelatorio(getApplicationContext(), fileNames.get(index));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                TextView textView = new TextView(BotaoCustomizadosActivity.this);
                textView.setText(fileNames.get(index).replace("_", " "));
                linearLayout.addView(imageButton);
                linearLayout.addView(textView);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void baixarAudio(String urlAudio) {
        verificarAudiosDir();

        audioFileDirs.add(Environment.getExternalStorageDirectory() + File.separator + "Audios/"+fileNames.get(index)+".3gp");
        File outputFile = new File(audioFileDirs.get(index));
        if (outputFile.exists()) {
            return;
        }

        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        Uri downloadUri = Uri.parse(DBController.URL_WEB_SERVICE + urlAudio);
        DownloadManager.Request request = new DownloadManager.Request(downloadUri);

        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE)
                .setDestinationInExternalPublicDir("Audios/", fileNames.get(index) + ".3gp")
                .setTitle(fileNames.get(index)).setDescription("Downloading...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

        dm.enqueue(request);
    }

    private void verificarAudiosDir() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
        }
        File audiosDir = new File(Environment.getExternalStorageDirectory() + File.separator + "Audios/");
        if (!audiosDir.exists()) {
            audiosDir.mkdirs();
        }
    }

    private JSONArray lerAtividades() {
        SharedPreferences login = getApplicationContext().getSharedPreferences("Login", MODE_PRIVATE);
        String emailResp = login.getString("email_resp", null);
        try {
            return DBController.selectAllFromAtividadeByEmail(this, emailResp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void voltarBotaoCustomizado (View view){
        Intent intent = new Intent(this, PerfilFilhoActivity.class);
        startActivity(intent);
    }

    private void colocarImagemNoBotao(ImageButton imageButton, String nomeImagem) {
        if (nomeImagem.equals("default")) {
            imageButton.setBackgroundResource(R.drawable.imagem);
        } else if (nomeImagem.equals("chocolate")) {
            imageButton.setBackgroundResource(R.drawable.chocolate);
        } else if (nomeImagem.equals("hotdog")) {
            imageButton.setBackgroundResource(R.drawable.hotdog);
        }
    }
}