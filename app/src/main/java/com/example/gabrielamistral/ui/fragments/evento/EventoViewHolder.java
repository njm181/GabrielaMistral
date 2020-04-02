package com.example.gabrielamistral.ui.fragments.evento;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.DummyContent;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

public class EventoViewHolder extends RecyclerView.ViewHolder{


    public View mView;
    public MaterialCardView materialCardView;
    public MaterialTextView autor;
    public MaterialTextView titulo;
    public MaterialTextView fechaHora;
    public MaterialTextView detalle;
    public MaterialTextView calle;
    public MaterialTextView localidadBarrio;
    public MaterialTextView seccion;
    public MaterialTextView altura;


    //Evento
    public DummyContent.DummyItem mItem;

    public EventoViewHolder(View view) {
        super(view);
        mView = view;
        autor = view.findViewById(R.id.tvEventoAutor);
        titulo = view.findViewById(R.id.tvEventoTitulo);
        fechaHora = view.findViewById(R.id.tvEventoFechaHora);
        detalle = view.findViewById(R.id.tvEventoDetalle);
        calle = view.findViewById(R.id.tvEventoCalle);
        localidadBarrio = view.findViewById(R.id.tvEventoLocalidadBarrio);
        seccion = view.findViewById(R.id.tvEventoSeccion);
        altura = view.findViewById(R.id.tvEventoAltura);
        materialCardView = view.findViewById(R.id.cardviewEvento);
    }

    @Override
    public String toString() {
        return super.toString() + " '" + titulo.getText() + "'";
    }

    }


