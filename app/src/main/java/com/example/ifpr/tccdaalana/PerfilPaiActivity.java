package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class PerfilPaiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_pai);

//        final TableRow tr = new TableRow(this);
//        final Button button1 = new Button(this);
//        final Button button2 = new Button(this);
//
//        button1.setText("Adicionar botão");
//        button2.setText("Adicionar outro botão <3");
//        button1.setTextSize(10);
//        button2.setTextSize(10);
//
//        button1.setWidth(135);
//        button2.setWidth(135);
//
//        button1.setMinimumHeight(30);
//        button2.setMinimumHeight(30);
//
//        button1.setHeight(35);
//        button2.setHeight(35);
//
//        final Button button0 = (Button) findViewById(R.id.botao1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                //Obtém o TableLayout
//                TableLayout ll = (TableLayout) findViewById(R.id.tableLayoutFrame2);
//
//                //Limpa as views criadas anteriormente
//                tr.removeAllViews();
//                ll.removeAllViews();
//
//                //Adiciona os botões à tabela
//                tr.addView(button1);
//                tr.addView(button2);
//
//                int lHeight = RelativeLayout.LayoutParams.FILL_PARENT;
//                int lWidth = RelativeLayout.LayoutParams.WRAP_CONTENT;
//
//                //Adiciona a tabela ao TableLayout
//                ll.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));
//            }
//        });
    }

    public void redirecionarParaEditarBotao (View v){
        Intent intent = new Intent(this, EditarBotaoActivity.class);
        startActivity(intent);
    }

    public void sairLogin(View v){
        SharedPreferences login = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = login.edit();
        editor.remove("email");
        editor.remove("senha");
        editor.commit();

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void redirecionarParaRelatorio (View v){
        Intent intent = new Intent(this, RelatorioActivity.class);
        startActivity(intent);
    }

}
