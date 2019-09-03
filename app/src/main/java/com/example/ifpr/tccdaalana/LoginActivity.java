package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import bancodedados.DBController;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SharedPreferences login = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        String email = login.getString("email", null);
        String email_dep = login.getString("email_dep", null);
        if (email != null){
            Intent intent = new Intent(this, PerfilPaiActivity.class);
            startActivity(intent);
        }
        else if (email_dep != null){
            Intent intent = new Intent(this, PerfilFilhoActivity.class);
            startActivity(intent);
        }

    }

    public void confirmaLogin (View v) throws JSONException, IOException {
        EditText editTextEmailApelido = findViewById(R.id.editTextEmail);
        String emailApelidoDigitado = editTextEmailApelido.getText().toString();
        EditText editTextSenha = findViewById(R.id.editTextSenha);
        String senhaDigitada = editTextSenha.getText().toString();


        boolean encontrouResponsavel = buscaResponsavel(emailApelidoDigitado, senhaDigitada);
        if (encontrouResponsavel == true) {
            SharedPreferences login = getApplicationContext().getSharedPreferences("Login", MODE_PRIVATE);
            SharedPreferences.Editor editor = login.edit();
            editor.putString("email", emailApelidoDigitado);
            editor.putString("senha", senhaDigitada);
            editor.commit();

            Intent intent = new Intent(this, PerfilPaiActivity.class);
            startActivity(intent);
        } else {
            boolean encontrouDependente = buscaDependente(emailApelidoDigitado, senhaDigitada);
            if (encontrouDependente == true) {
                SharedPreferences login = getApplicationContext().getSharedPreferences("Login", MODE_PRIVATE);
                SharedPreferences.Editor editor = login.edit();
                editor.putString("email_dep", emailApelidoDigitado);
                editor.putString("senha", senhaDigitada);
                editor.commit();

                Intent intent = new Intent(this, PerfilFilhoActivity.class);
                startActivity(intent);
            } else {
                criarAlertDialog("Erro!", "Usuário não encontrado!");
            }
        }
    }

    private boolean buscaDependente(String emailApelidoDigitado, String senhaDigitada) throws IOException, JSONException {
        DBController dbController = new DBController();
        JSONArray dependente = dbController.selectAllFromDependente(this);
        for (int i = 0; i < dependente.length(); i++) {
            JSONObject jsonObject = dependente.getJSONObject(i);
            String apelido = jsonObject.getString("Apelido");
            String emailResponsavel = jsonObject.getString("Responsável_email");
            String senha = jsonObject.getString("Senha");

            if (emailResponsavel.equals(emailApelidoDigitado) && senha.equals(senhaDigitada)) {
                return true;
            }
            if (apelido.equals(emailApelidoDigitado) && senha.equals(senhaDigitada)) {
                return true;
            }
        }
        return false;
    }

    private boolean buscaResponsavel(String emailDigitado, String senhaDigitada) throws IOException, JSONException {
        DBController dbController = new DBController();
        JSONArray responsaveis = dbController.selectAllFromResponsavel(this);
        for (int i = 0; i < responsaveis.length(); i++) {
            JSONObject jsonObject = responsaveis.getJSONObject(i);
            String email = jsonObject.getString("email");
            String senha = jsonObject.getString("senha");
            if (email.equals(emailDigitado) && senha.equals(senhaDigitada)) {
                return true;
            }
        }
        return false;
    }

    public void criarAlertDialog(String titulo, String mensagem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(titulo);
        builder.setMessage(mensagem);
        builder.setPositiveButton("OK", null);
        builder.create().show();
    }

    public void cadastroResponsavel(View v){
        Intent intent = new Intent(this, CadastroRespActivity.class);
        startActivity(intent);

    }

    public void cadastroDependente (View v){
        Intent intent = new Intent(this, CadastroDpActivity.class);
        startActivity(intent);

    }

}
