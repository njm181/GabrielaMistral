package com.example.gabrielamistral.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.gabrielamistral.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static final Long splashTime = 1000L;
    private Handler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        myHandler = new Handler();

        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                goToMainActivity();
            }
        },splashTime);
    }

    private void goToMainActivity(){
        Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
