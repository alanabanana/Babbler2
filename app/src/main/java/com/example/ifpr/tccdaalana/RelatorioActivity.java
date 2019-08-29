package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import bancodedados.DBController;

public class RelatorioActivity extends Activity {

    private ArrayList<Relatorio> relatorios = new ArrayList<Relatorio>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);
        try {
            obterRelatorios();
            construirRelatoriosNaTela();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void construirRelatoriosNaTela() {
        LinearLayout linearLayout = findViewById(R.id.linearLayoutRelatorio);
        for (Relatorio relatorio : relatorios) {
            TextView textView = new TextView(this);
            String frase = "Dependente: "+ relatorio.getApelidoDependente() + "\n";
            for (Acao acao : relatorio.getAcoes()) {
                String data = acao.getData();
                frase = frase + "Data: " + data + "\n";
                String horario = acao.getHorario();
                frase = frase + "Horário: " + horario + "\n";
                String botao = acao.getBotao();
                frase = frase + "Botão Apertado: " + botao + "\n\n";
            }
            textView.setText(frase);
            textView.setTextSize(18);
            linearLayout.addView(textView);
        }
    }

    public int buscaRelatorio(String dependente) {
        for (int i = 0; i < relatorios.size(); i++) {
            Relatorio relatorio = relatorios.get(i);
            if (relatorio.getApelidoDependente().equals(dependente)) {
                return i;
            }
        }
        return -1;
    }

    public void obterRelatorios() throws IOException, JSONException {
        DBController dbController = new DBController();
        SharedPreferences sp = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        String email_resp = sp.getString("email", null);
        JSONArray relatoriosJSON = dbController.selectAllFromRelatorio(this, email_resp);
        for (int i = 0; i < relatoriosJSON.length(); i++) {
            JSONObject jsonObject = relatoriosJSON.getJSONObject(i);
            String dependente = jsonObject.getString("dependente");
            String botao = jsonObject.getString("botao");
            String horario = jsonObject.getString("horario");
            String data = jsonObject.getString("data");
            Acao novaAcao = new Acao();
            novaAcao.setBotao(botao);
            novaAcao.setHorario(horario);
            novaAcao.setData(data);
            int indexRelatorio = buscaRelatorio(dependente);
            if (indexRelatorio == -1) {
                Relatorio novoRelatorio = new Relatorio();
                novoRelatorio.setApelidoDependente(dependente);
                novoRelatorio.getAcoes().add(novaAcao);
                relatorios.add(novoRelatorio);
            } else {
                Relatorio relatorio = relatorios.get(indexRelatorio);
                relatorio.getAcoes().add(novaAcao);
                relatorios.remove(indexRelatorio);
                relatorios.add(relatorio);
            }
        }
    }
}