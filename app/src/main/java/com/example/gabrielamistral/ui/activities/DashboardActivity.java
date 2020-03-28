package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gabrielamistral.R;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialCardView cardviewEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        setViewResources();

        cardviewEvento.setOnClickListener(this);

    }

    private void setViewResources(){
        cardviewEvento = findViewById(R.id.cardviewEvento);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardviewEvento:
                changeActivity(EventosActivity.class);
                System.out.println("Click");
        }
    }

    private void changeActivity(Class clase){
        Intent intent = new Intent(this, clase);
        startActivity(intent);
    }
}
