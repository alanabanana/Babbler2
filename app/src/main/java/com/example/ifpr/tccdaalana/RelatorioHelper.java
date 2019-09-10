package com.example.ifpr.tccdaalana;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import bancodedados.DBController;

public class RelatorioHelper {

    public static void geraRelatorio(Context context, String botao) throws IOException {
        SharedPreferences login = context.getSharedPreferences("Login", context.MODE_PRIVATE);
        String emailResp = login.getString("email_resp", null);
        String apelido = login.getString("apelido", null);
        DBController.insertIntoRelatorio(context, botao, DataUtils.getDate(), DataUtils.getTime(), apelido, emailResp);
    }
}
