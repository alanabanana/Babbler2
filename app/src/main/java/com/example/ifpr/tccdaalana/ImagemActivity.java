package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ImagemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem);
    }

    public void escolheuChocolate(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "Chocolate");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuCachorroQuente(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "cachorroQuente");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuHamburguer(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "Hamburguer");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuPizza(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "pizza");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuBatataFrita(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "batataFrita");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}