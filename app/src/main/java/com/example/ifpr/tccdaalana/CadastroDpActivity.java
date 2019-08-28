package com.example.ifpr.tccdaalana;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import bancodedados.DBController;

public class CadastroDpActivity extends AppCompatActivity {


    DBController dbController = new DBController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_dp);
    }

    public void criarAlertDialog(String titulo, String mensagem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(titulo);
        builder.setMessage(mensagem);
        builder.setPositiveButton("OK", null);
        builder.create().show();
    }

    public int verificaExistencia() throws IOException, JSONException {
        int verdade = 0;
        ArrayList<String> listaAudios = new ArrayList<String>();
        JSONArray jsonAudios = dbController.selectAllFromReadAtividadePadrao(getApplicationContext());
        for (int i = 0; i<jsonAudios.length(); i++){
            JSONObject audioObject = jsonAudios.getJSONObject(i);
            String audio = audioObject.getString("Audio");
            listaAudios.add(audio);
        }
        if (listaAudios.isEmpty()){
            verdade = 1;
            return verdade;
        }
    return verdade;
    }

    public void confirmaCadastroDependente(View v) throws IOException, JSONException {
        int verdade=verificaExistencia();
        EditText editTextSenha = findViewById(R.id.TextSenha);
        String senha = editTextSenha.getText().toString();
        EditText editTextConfirma = findViewById(R.id.TextConfirmarSenha);
        String confirmaSenha = editTextConfirma.getText().toString();
        if (!senha.equals(confirmaSenha)) {
            criarAlertDialog("Problema!", "Senhas não conferem!");
        } else {
            EditText emailTextSenha = findViewById(R.id.TextEmail);
            String email = emailTextSenha.getText().toString();

            EditText editTextApelido = findViewById(R.id.TextApelido);
            String apelido = editTextApelido.getText().toString();

            int deuCerto = dbController.insertIntoDependente(this, verdade, apelido, email, senha);

            if (deuCerto == 1) {
                Intent intent = new Intent(this, PerfilFilhoActivity.class);
                startActivity(intent);
            }
        }
    }

    public void cadastrarDp(View v) throws IOException{


    }
    public void voltarLogin (View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}


