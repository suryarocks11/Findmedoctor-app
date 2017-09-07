package com.finddoctor.surya.findmedoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class doc3 extends AppCompatActivity {



    private WebView webView;

    public void map3(View v) {

        webView = (WebView) findViewById(R.id.webView5);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://goo.gl/maps/NvnSjk7Tsxz");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc3);
    }
}
