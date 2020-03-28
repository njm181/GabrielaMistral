package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.DummyContent;
import com.example.gabrielamistral.ui.fragments.EventoFragment;

public class EventosActivity extends AppCompatActivity implements EventoFragment.OnListFragmentInteractionListener, AdapterView.OnItemClickListener  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

         EventoFragment eventoFragment = new EventoFragment();
         fragmentTransaction.add(R.id.fragment_container, eventoFragment);
         fragmentTransaction.commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "CLICK SOBRE EL ITEM", Toast.LENGTH_SHORT).show();
    }
}
