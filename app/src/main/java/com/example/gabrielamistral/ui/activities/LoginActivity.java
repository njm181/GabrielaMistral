package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.utils.Utils;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton btnLogin;

    //pasar a dagger
    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setVisualResources();

        btnLogin.setOnClickListener(this);

    }


    private void setVisualResources(){
        btnLogin = findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View v) {
        utils = new Utils();
        switch (v.getId()){
            case R.id.btnLogin:
                System.out.println("Click");
                utils.changeActivitySimple(DashboardAdminActivity.class, this);
        }
    }


}
