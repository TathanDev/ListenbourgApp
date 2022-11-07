package fr.tathan.listenbourgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class IdentityActivity extends AppCompatActivity {

    private ImageView backArrow;
    private WebView webview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);

        webview = (WebView) findViewById(R.id.translateWebView);
        webview.setWebViewClient(new MyBrowser());
        webview.loadUrl("https://listenbourg.vincelinise.com/listenpass/cni.html");
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadsImagesAutomatically(true);



        this.backArrow = findViewById(R.id.backButton);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IdentityActivity.this, MainActivity.class);
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