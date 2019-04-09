package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerfilPaiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_pai);
    }
    public void redirecionarParaEditarBotao (View v){
        Intent intent = new Intent(this, EditarBotaoActivity.class);
        startActivity(intent);
    }

}
