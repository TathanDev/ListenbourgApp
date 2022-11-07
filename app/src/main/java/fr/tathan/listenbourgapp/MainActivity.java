package fr.tathan.listenbourgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button translateButton;
    private Button identityButton;
    private Button passportButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.translateButton = findViewById(R.id.translateButton);
        this.identityButton = findViewById(R.id.identityButton);
        this.passportButton = findViewById(R.id.passportButton);

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TranslateActivity.class);
                startActivity(intent);
                finish();
            }
        });

        identityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IdentityActivity.class);
                startActivity(intent);
                finish();
            }
        });

        passportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PassportActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}