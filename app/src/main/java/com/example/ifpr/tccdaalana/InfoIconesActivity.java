package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InfoIconesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_icones);
    }
    public void voltarPerfilRp (View view){
        Intent intent = new Intent(this, PerfilPaiActivity.class);
        startActivity(intent);
    }

}
