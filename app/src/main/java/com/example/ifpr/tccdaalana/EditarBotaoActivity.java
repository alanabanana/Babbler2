package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditarBotaoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_botao);

    }


    public void editarBotaoEmOutraTela (View v ){
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        startActivity(intent);
    }

    public void adicionarBotaoEmOutraTela (View v ){
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        startActivity(intent);
    }


}

