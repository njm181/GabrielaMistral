package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.evento.CrearEventoFragment;

public class CrearEventoDevocionalActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private CrearEventoFragment crearEventoFragment;
    String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_evento_devocional);

        //recibo un intent con un extra que identifica que fragmento agrego a la vista
        tipo = getIntent().getExtras().getString("TIPO");
        openFragment(tipo);
    }

    private void openFragment(String tipo) {
        switch (tipo){
            case "crearEvento": //pasar a Constantes
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                crearEventoFragment = new CrearEventoFragment();
                fragmentTransaction.add(R.id.crear_evento_devocional_container, crearEventoFragment);
                fragmentTransaction.commit();
                break;
            /*case "devocional":
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                devocionalListFragment = new DevocionalListFragment();
                fragmentTransaction.add(R.id.crear_evento_devocional_container, devocionalListFragment);
                fragmentTransaction.commit();
                break;*/
        }
    }
}
