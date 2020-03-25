package com.example.gabrielamistral;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnUserOk, btnNoUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setResources();

        btnUserOk.setOnClickListener(this);
        btnNoUser.setOnClickListener(this);

    }

    private void setResources(){
        btnUserOk = findViewById(R.id.btnUserOk);
        btnNoUser = findViewById(R.id.btnNoUser);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnUserOk:
                Intent intentUser = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intentUser);
                break;
            case R.id.btnNoUser:
                Intent intentNoUser = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intentNoUser);
                break;
        }
    }

}
