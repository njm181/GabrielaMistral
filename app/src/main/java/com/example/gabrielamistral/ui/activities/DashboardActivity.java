package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gabrielamistral.R;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialCardView cardviewEvento;
    private MaterialCardView cardviewDevocional;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        setViewResources();

        cardviewEvento.setOnClickListener(this);
        cardviewDevocional.setOnClickListener(this);


    }

    private void setViewResources(){
        cardviewEvento = findViewById(R.id.cardviewEvento);
        cardviewDevocional = findViewById(R.id.cardviewDevocionales);
    }

    @Override
    public void onClick(View v) {
        String tipo;
        switch (v.getId()){
            case R.id.cardviewEvento:
                tipo = "evento";
                System.out.println("Click");
                changeActivity(EventosActivity.class, tipo);
                break;
            case R.id.cardviewDevocionales:
                tipo = "devocional";
                System.out.println("Click");
                changeActivity(EventosActivity.class, tipo);
                break;
        }
    }

    private void changeActivity(Class clase, String tipo){
        Intent intent = new Intent(this, clase);
        intent.putExtra("TIPO", tipo);
        startActivity(intent);
    }
}
