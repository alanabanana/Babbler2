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
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class EditarBotaoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_botao);

        final TableRow tr = new TableRow(this);
        final Button button1 = new Button(this);
        final Button button2 = new Button(this);

        button1.setText("Adicionar botão");
        button2.setText("Adicionar outro botão <3");
        button1.setTextSize(10);
        button2.setTextSize(10);

        button1.setWidth(135);
        button2.setWidth(135);

        button1.setMinimumHeight(30);
        button2.setMinimumHeight(30);

        button1.setHeight(35);
        button2.setHeight(35);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //Obtém o TableLayout
                TableLayout ll = (TableLayout) findViewById(R.id.tableLayoutFrame2);

                //Limpa as views criadas anteriormente
                tr.removeAllViews();
                ll.removeAllViews();

                //Adiciona os botões à tabela
                tr.addView(button1);
                tr.addView(button2);

                int lHeight = RelativeLayout.LayoutParams.FILL_PARENT;
                int lWidth = RelativeLayout.LayoutParams.WRAP_CONTENT;

                //Adiciona a tabela ao TableLayout
                ll.addView(tr, new RelativeLayout.LayoutParams(lHeight, lWidth));
            }
        });


    }

    public void editarBotao (View v ){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Em construção...");
        builder.setMessage("Esta funcionalidade estará disponível em breve...");
        builder.setPositiveButton("OK", null);
        builder.create().show();
    }

    public void adicionarBotaoEmOutraTela (View v ){
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        startActivity(intent);
    }
    public void voltarPerfilPai (View v ){
        Intent intent = new Intent(this, AdicionarBotaoActivity.class);
        startActivity(intent);
    }

}

