package com.finddoctor.surya.findmedoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class doc1 extends AppCompatActivity {

    private WebView webView;

    public void map1(View v) {

        webView = (WebView) findViewById(R.id.webView4);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://goo.gl/maps/X1iiHivwKML2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc1);
    }
}
