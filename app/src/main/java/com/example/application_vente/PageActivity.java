package com.example.application_vente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PageActivity extends AppCompatActivity {

    private static int time=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(PageActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },time);
    }
}