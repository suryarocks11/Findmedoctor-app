package com.finddoctor.surya.findmedoctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class doc2 extends AppCompatActivity {
    private WebView webView;



    public void mapp(View v) {

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.co.in/maps/dir//Poorva+Eye+Care,+P-168,+C+I+T+Road,+Subhas+Sarobar+Park,+Phool+Bagan,+Beleghata,+Kolkata,+West+Bengal+700010/@22.5684684,88.364035,13z/data=!4m16!1m7!3m6!1s0x3a02766e139fa56f:0x6de2474eab3124b7!2sPoorva+Eye+Care!3b1!8m2!3d22.5681665!4d88.3918467!4m7!1m0!1m5!1m1!1s0x3a02766e139fa56f:0x6de2474eab3124b7!2m2!1d88.3918467!2d22.5681665\n");

        // String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
        //webView.loadData(customHtml, "text/html", "UTF-8");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc2);
        // String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
        //webView.loadData(customHtml, "text/html", "UTF-8");

    // String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
        //webView.loadData(customHtml, "text/html", "UTF-8");
}





    }

