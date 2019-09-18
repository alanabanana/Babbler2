package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
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
            String nomeDep = "Dependente: "+ relatorio.getApelidoDependente() + "\n";
            TextView textViewNomeDep = new TextView(RelatorioActivity.this);
            textViewNomeDep.setText(nomeDep);
            textViewNomeDep.setTextSize(18);
            textViewNomeDep.setGravity(Gravity.CENTER_HORIZONTAL);
            textViewNomeDep.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(textViewNomeDep);
            TextView textViewAcoes = new TextView(RelatorioActivity.this);
            String acoesDep = "";
            for (Acao acao : relatorio.getAcoes()) {
                String data = acao.getData();
                acoesDep = acoesDep + "Data: " + data + "\n";
                String horario = acao.getHorario();
                acoesDep = acoesDep + "Horário: " + horario + "\n";
                String botao = acao.getBotao();
                acoesDep = acoesDep + "Botão Apertado: " + botao + "\n\n";
            }
            textViewAcoes.setText(acoesDep);
            textViewAcoes.setTextSize(18);
            textViewAcoes.setTextColor(Color.parseColor("#a9a9a9"));
            linearLayout.addView(textViewAcoes);
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
        String email_resp = sp.getString("email_resp", null);
        JSONArray relatoriosJSON = dbController.selectAllFromRelatorio(this, email_resp);
        for (int i = 0; i < relatoriosJSON.length(); i++) {
            JSONObject jsonObject = relatoriosJSON.getJSONObject(i);
            String dependente = jsonObject.getString("Dependente_apelido");
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
                novoRelatorio.setAcoes(new ArrayList<Acao>());
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
    public void backPerfilResp (View view){
        Intent intent = new Intent(this, PerfilPaiActivity.class);
        startActivity(intent);
    }
}