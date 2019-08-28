package com.example.ifpr.tccdaalana;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;

import bancodedados.DBController;

public class CadastroRespActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_resp);
    }

    public void criarAlertDialog(String titulo, String mensagem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(titulo);
        builder.setMessage(mensagem);
        builder.setPositiveButton("OK", null);
        builder.create().show();
    }

    public void confirmaCadastroPai(View v) throws IOException {
        EditText editTextSenha = findViewById(R.id.cSenha);
        String senha = editTextSenha.getText().toString();
        EditText editTextConfirma = findViewById(R.id.cConfirmarSenha);
        String confirmaSenha = editTextConfirma.getText().toString();
        if (!senha.equals(confirmaSenha)) {
            criarAlertDialog("Problema!", "Senhas não conferem!");
        } else {
            EditText emailTextSenha = findViewById(R.id.cEmail);
            String email = emailTextSenha.getText().toString();

            DBController dbController = new DBController();
            int deuCerto = dbController.insertIntoResponsavel(this, email, senha);

            if (deuCerto == 1) {
                Intent intent = new Intent(this, PerfilPaiActivity.class);
                startActivity(intent);
            }
        }
    }
    public void voltarInicio (View v){
        Intent intent =  new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
