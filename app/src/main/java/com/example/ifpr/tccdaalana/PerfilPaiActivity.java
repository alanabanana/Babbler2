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
import android.widget.TextView;

public class PerfilPaiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_pai);

        SharedPreferences login = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        String email = login.getString("email_dep", null);
        TextView textView = (TextView) findViewById(R.id.textViewNomeDep);
        textView.setText(email);

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
    public void redirecionarParaInformacao (View view){
        Intent intent =  new Intent(this, InformacaoActivity.class);
        startActivity(intent);
    }

}
