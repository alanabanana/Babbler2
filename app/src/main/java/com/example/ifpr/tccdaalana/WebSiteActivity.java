package com.example.ifpr.tccdaalana;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSiteActivity extends Activity {
    WebView telaWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_icones);

        WebView telaWebView = findViewById(R.id.telaWebView);

        WebSiteActivity.WebViewClientImpl webViewClient = new WebSiteActivity.WebViewClientImpl(this);
        telaWebView.setWebViewClient(webViewClient);

        telaWebView.loadUrl("https://tipay.app"); //arrumar a url do site <3

        WebSettings webSettings = telaWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    public static class WebViewClientImpl extends WebViewClient {
        private Activity activity = null;

            public WebViewClientImpl(Activity activity) {
                this.activity = activity;
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String url) {
                if (url.contains("androidpro.com.br")) return false;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                activity.startActivity(intent);
                return true;
            }
        }
    public void onBackPressed() {
        if (this.telaWebView.canGoBack()) {
            this.telaWebView.goBack();
        } else {
            finish();
        }
    }
}







