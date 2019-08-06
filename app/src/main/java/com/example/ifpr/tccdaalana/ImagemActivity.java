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
        bundle.putString("Imagem", "hamburguer");
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
        bundle.putString("Imagem", "fries");
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
    public void escolheuPeixe (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "fish");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCarne (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "steak");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuFrango (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "turkey");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCenora (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "carrot");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuOvo (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "egg");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMacarrao (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "spaguetti");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuLeite (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "milk");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAgua (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "water");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSorvete (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "iceCream");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPao (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "bread");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuRefri (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "can");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuFeliz (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "smile");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTriste (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sad");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuChorar (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sad");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAmar (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "inLove");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuEstressado (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "stress");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDivertir (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "laugh");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDorminhoco (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sleep");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuChoque (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "shock");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMaisSad (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "maisad");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCreepy (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "creepy");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAssustado (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "shocked");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSuspeito (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "suspicious");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDoente (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sick");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDesapontado (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "dissapointment");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPensar (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "thinking");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMudo (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "muted");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuRaiva (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "angry");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDormir (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sleepy");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuVomitar (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "vomit");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuFurioso (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "muitoangry");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuCalor (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "hot");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuUm (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "one");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDois (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "two");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTres (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "three");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuQuatro (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "four");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCinco (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "five");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSeis (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "six");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSete (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "seven");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuOito (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "eight");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuNove (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "nine");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuDez (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "ten");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuVinte (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "twenty");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTrinta (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "thirty");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuQuarenta (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "forty");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCinquenta (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "fifty");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSessenta (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sixty");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSetenta (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "seventy");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuOitenta (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "eighty");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuNoventa (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "ninety");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCem (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "onehundred");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCasa (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "house");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCama (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "bed");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPrivada (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "toilet");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuBanho (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "shower");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuBanheira (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "bathtub");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPapelHigienico (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "bathtub");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuEscovaDeDente (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "toothbrush");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSecador (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "hairDryer");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuUrsinho (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "teddyBear");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuBola (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "ball");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuXadrez (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "chess");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSkate (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "skateboard");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuGameboy (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "gameboy");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuGameConsole(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "gameConsole");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuRobo(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "robot");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCriancasJogandoBola(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "kids");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuBalanco(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "swing");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCubos(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "cubes");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTeclado (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "keyboard");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCarrinho (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "car");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCorrida (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "racing");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuLego (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "brick");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuQuebraCabeca (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "puzzle");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuBoneca (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "doll");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCasteloDeAreia (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "sandCastle");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void escolheuDinossauro (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "dinosaur");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuLivros (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "books");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuAnotacao (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "notebook");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuEstudante (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "student");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuProfessor (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "teacher");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuQuadroBranco(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "whiteboard");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuArte (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "art");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPenal (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "pencilCase");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuIdeia (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "think");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuGiz (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "crayon");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuElefante (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "elephant");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPintinho (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "chicken");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPig (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "crayon");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCoelho (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "rabbit");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuEsquilo (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "squirrel");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCachorro (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "dog");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCobra (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "snake");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPeru (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "peru");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTartaruga (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "turtle");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuHen (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "hen");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuMacaco (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "monkey");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuSapo (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "frog");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuFish (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "fish");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuGirafa (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "giraffe");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuJoaninha (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "ladybug");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuVaca (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "cow");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTigre (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "tiger");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuTubarao (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "shark");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuGato (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "cat");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuCoala (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "koala");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuZebra (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "zebra");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuRaposa (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "fox");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void escolheuPolvo (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("Imagem", "octopus");
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }





}