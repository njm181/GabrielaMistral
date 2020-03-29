package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.DetalleEventoFragment;
import com.example.gabrielamistral.ui.fragments.DummyContent;
import com.example.gabrielamistral.ui.fragments.EventoListFragment;

public class EventosActivity extends AppCompatActivity implements EventoListFragment.OnListFragmentInteractionListener{

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private EventoListFragment eventoListFragment;
    private DetalleEventoFragment detalleEventoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

         eventoListFragment = new EventoListFragment();
         fragmentTransaction.add(R.id.fragment_container, eventoListFragment);
         fragmentTransaction.commit();


    }


    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
