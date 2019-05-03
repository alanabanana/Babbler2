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
    public void escolheuBacon(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "bacon");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuApple(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "apple");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuUva(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "grapes");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuLaranja(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "orange");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMorango(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "strawberry");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMelancia(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "watermelon");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAbacaxi(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "pineapple");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCereja (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "cherries");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuLimao (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "lemon");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuBanana (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "banana");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPera (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "pear");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMilho (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "corn");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAbacate (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "avocado");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSushi (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sushi");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCouveFlor (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "cauliflower");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAbobora (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "pumpkin");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTomate (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "tomato");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuQueijo (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "tomato");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}