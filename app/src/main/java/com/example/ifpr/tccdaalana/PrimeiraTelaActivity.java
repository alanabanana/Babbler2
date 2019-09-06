package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimeiraTelaActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);
    }
    public void telaInicio (View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
