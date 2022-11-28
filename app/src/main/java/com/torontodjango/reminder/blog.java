package com.torontodjango.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class blog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        WebView webView = (WebView) findViewById(R.id.Webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);//so  that navbar hamburger works
        webView.loadUrl("http://shreyasapale17.pythonanywhere.com/");

    }
}