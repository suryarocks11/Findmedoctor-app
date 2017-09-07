package com.finddoctor.surya.findmedoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class doc7 extends AppCompatActivity {



    private WebView webView;

    public void map7(View v) {

        webView = (WebView) findViewById(R.id.webView6);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.co.in/maps/dir/''/''/@22.502036,88.2857436,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a0270da59fa162b:0x6992d7751db6a68c!2m2!1d88.355784!2d22.5020511");
        // String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
        //webView.loadData(customHtml, "text/html", "UTF-8");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc7);
    }
}
