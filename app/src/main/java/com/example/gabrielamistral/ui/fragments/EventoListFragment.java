package com.example.gabrielamistral.ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.model.IComunicaFragments;
import com.example.gabrielamistral.ui.fragments.DummyContent.DummyItem;
import com.example.gabrielamistral.utils.Helper;

public class EventoListFragment extends Fragment{


    private EventoRecyclerViewAdapter eventoRecyclerViewAdapter;
    private RecyclerView recyclerView;

    private OnListFragmentInteractionListener mListener;

    private Context context;

    private DetalleEventoFragment detalleEventoFragment;

    public EventoListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_evento_list, container, false);

        recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        eventoRecyclerViewAdapter = new EventoRecyclerViewAdapter(getContext(), DummyContent.ITEMS);

        recyclerView.setAdapter(eventoRecyclerViewAdapter);

        eventoRecyclerViewAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "CLIIIICKKKK", Toast.LENGTH_SHORT).show();
                detalleEventoFragment = new DetalleEventoFragment();
                //Bundle para enviar la data
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
                fragmentTransaction.replace(R.id.fragment_container, detalleEventoFragment).addToBackStack(null).commit();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //obteniendo el contexto, para hacer la comunicacion entre la vista y el Detalle
        if(context != null){
            this.context = context;
        }

        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(DummyItem item);
    }
}
