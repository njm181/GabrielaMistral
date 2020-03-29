package com.example.gabrielamistral.ui.fragments;

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
import android.widget.Toast;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.dummy.DummyContent;
import com.example.gabrielamistral.ui.fragments.dummy.DummyContent.DummyItem;

public class DevocionalListFragment extends Fragment {

    private Context context;
    private OnListFragmentInteractionListener mListener;
    private RecyclerView recyclerView;
    private DevocionalRecyclerViewAdapter devocionalRecyclerViewAdapter;
    private DetalleDevocionalFragment detalleDevocionalFragment;

    public DevocionalListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_devocional_list, container, false);

        Context context = view.getContext();
        recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        devocionalRecyclerViewAdapter = new DevocionalRecyclerViewAdapter(DummyContent.ITEMS, mListener);
        recyclerView.setAdapter(devocionalRecyclerViewAdapter);

        devocionalRecyclerViewAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detalleDevocionalFragment = new DetalleDevocionalFragment();
                //Bundle para enviar la data
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
                fragmentTransaction.replace(R.id.fragment_container, detalleDevocionalFragment).addToBackStack(null).commit();
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

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
