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

public class PerfilFilhoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_filho);
    }


    public void sairLogin(View v){
        SharedPreferences login = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = login.edit();
        editor.remove("email_dep");
        editor.remove("senha");
        editor.commit();

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}


