package com.finddoctor.surya.findmedoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class doc5 extends AppCompatActivity {
    private WebView webView;
    public void map5(View v) {

        webView = (WebView) findViewById(R.id.webView2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://goo.gl/maps/jqFNUJQNonz");
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc5);
    }
}
