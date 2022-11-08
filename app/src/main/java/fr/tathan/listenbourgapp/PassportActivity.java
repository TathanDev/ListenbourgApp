package fr.tathan.listenbourgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class PassportActivity extends AppCompatActivity {

    private ImageView backArrow;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passport);

        this.webview = (WebView) findViewById(R.id.passportWebView);
        webview.setWebViewClient(new MyBrowser());
        webview.loadUrl("https://listenbourg.vincelinise.com/listenpass/passeport.html");
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadsImagesAutomatically(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setAllowFileAccess(true); //Allow file access from file URL

        this.backArrow = findViewById(R.id.backButton);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassportActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        });

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}