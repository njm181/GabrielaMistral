package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.devocional.DevocionalListFragment;
import com.example.gabrielamistral.ui.fragments.DummyContent;
import com.example.gabrielamistral.ui.fragments.evento.EventoListFragment;

public class EventosActivity extends AppCompatActivity implements EventoListFragment.OnListFragmentInteractionListener, DevocionalListFragment.OnListFragmentInteractionListener {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private EventoListFragment eventoListFragment;
    private DevocionalListFragment devocionalListFragment;
    String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        tipo = getIntent().getExtras().getString("TIPO");
        openFragment(tipo);


    }

    private void openFragment(String tipo){
        switch (tipo){
            case "evento":
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                eventoListFragment = new EventoListFragment();
                fragmentTransaction.add(R.id.fragment_container, eventoListFragment);
                fragmentTransaction.commit();
                break;
            case "devocional":
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                devocionalListFragment = new DevocionalListFragment();
                fragmentTransaction.add(R.id.fragment_container, devocionalListFragment);
                fragmentTransaction.commit();
                break;
        }
    }


    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }

    @Override
    public void onListFragmentInteraction(com.example.gabrielamistral.ui.fragments.dummy.DummyContent.DummyItem item) {

    }
}
