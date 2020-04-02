package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.utils.Utils;
import com.google.android.material.card.MaterialCardView;

public class DashboardAdminActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialCardView cardviewCrearEvento;
    private MaterialCardView cardviewCrearDevocional;

    //pasar a dagger
    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);

        setViewResources();

        cardviewCrearEvento.setOnClickListener(this);
        cardviewCrearDevocional.setOnClickListener(this);


    }

    private void setViewResources(){
        cardviewCrearEvento = findViewById(R.id.cardviewCrearEvento);
        cardviewCrearDevocional = findViewById(R.id.cardviewCrearDevocionales);
    }

    @Override
    public void onClick(View v) {
        utils = new Utils();
        String tipo;
        switch (v.getId()){
            case R.id.cardviewCrearEvento:
                tipo = "crearEvento";
                System.out.println("Click");
                utils.changeActivity(CrearEventoDevocionalActivity.class, tipo, this);
                break;
            case R.id.cardviewCrearDevocionales:
                tipo = "crearDevocional";
                System.out.println("Click");
                utils.changeActivity(CrearEventoDevocionalActivity.class, tipo, this);
                break;
        }
    }

}
