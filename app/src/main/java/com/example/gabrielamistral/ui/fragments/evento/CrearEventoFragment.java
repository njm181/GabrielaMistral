package com.example.gabrielamistral.ui.fragments.evento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.example.gabrielamistral.R;
//import com.example.gabrielamistral.services.RetrofitClientApi;
import com.example.gabrielamistral.services.WebService;
import com.example.gabrielamistral.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class CrearEventoFragment extends Fragment implements View.OnClickListener {
    private TextInputEditText tilAutor, tilTitulo, tilDetalle, tilFechaHora,tilLocalidadBarrio, tilCalle, tillAltura;
    private Spinner spinnerSeccion;
    private MaterialButton btnCrearEvento;
    private View view;
    private WebService webService;
    private Utils utils;
    //private RetrofitClientApi retrofitClientApi;


    public CrearEventoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_crear_evento, container, false);

        setElementsResources(view);
        //retrofitInit();
        btnCrearEvento.setOnClickListener(this);

        return view;
    }

    private void setElementsResources(View view){
        tilAutor = view.findViewById(R.id.tvInputUsernameEvento);
        tilTitulo = view.findViewById(R.id.tvInputTituloEvento);
        tilFechaHora = view.findViewById(R.id.tvInputFechaHoraEvento);
        tilDetalle = view.findViewById(R.id.tvInputDetalleEvento);
        tilLocalidadBarrio = view.findViewById(R.id.tvInputLocalidadBarrioEvento);
        tillAltura = view.findViewById(R.id.tvInputAlturaEvento);
        tilCalle = view.findViewById(R.id.tvInputCalleEvento);
        spinnerSeccion = view.findViewById(R.id.spinnerSeccion);
        btnCrearEvento = view.findViewById(R.id.btnCrearEvento);
    }

    /*private void retrofitInit() {
        retrofitClientApi = RetrofitClientApi.getInstance();
        webService = retrofitClientApi.getWebService();
    }*/


    @Override
    public void onClick(View v) {
        //String autor = tilAutor.getText().toString();
        //fechahora y seleccion de spinner - hardocodeo ambos para probar si funciona el servicio desde la app
        createEvent();
    }
    private void createEvent() {
        String autor = "autor test";//tilAutor.getEditText().toString();
        String titulo = "titulo test";//tilTitulo.getEditText().toString();
        String detalle = "detalle test";//tilDetalle.getEditText().toString();
        String localidadBarrio = "localidad test";//tilLocalidadBarrio.getEditText().toString();
        int altura = 123;//Integer.parseInt(tillAltura.getEditText().toString());
        String calle = "calle test";//tilCalle.getEditText().toString();
        //fechahora y seleccion de spinner - hardocodeo ambos para probar si funciona el servicio desde la app
        String fecha = "2020-11-04 18:00:00";
        String seccion = "Nuevo Joven";
        utils = new Utils();

    }
}