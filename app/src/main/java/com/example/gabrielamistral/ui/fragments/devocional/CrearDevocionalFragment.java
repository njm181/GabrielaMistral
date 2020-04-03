package com.example.gabrielamistral.ui.fragments.devocional;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gabrielamistral.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CrearDevocionalFragment extends Fragment {

    public CrearDevocionalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crear_devocional, container, false);
    }
}
