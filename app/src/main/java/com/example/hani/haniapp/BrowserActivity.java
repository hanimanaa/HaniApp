package com.example.hani.haniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);


    }

    public void buGo(View view) {
      Button bugo = (Button) findViewById(R.id.buGo);
      final  EditText edurl = (EditText) findViewById(R.id.edUrl);
      final  WebView webView = (WebView) findViewById(R.id.WebView);
      webView.setWebViewClient(new WebViewClient());

      webView.loadUrl(edurl.getText().toString());

    }
}
