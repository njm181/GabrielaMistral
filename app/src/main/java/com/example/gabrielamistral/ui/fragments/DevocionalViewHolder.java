package com.example.gabrielamistral.ui.fragments;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.dummy.DummyContent;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

public class DevocionalViewHolder extends RecyclerView.ViewHolder {

    public  View mView;
    public MaterialCardView materialCardView;
    public MaterialTextView autor;
    public MaterialTextView titulo;
    public MaterialTextView subtitulo;
    public MaterialTextView descripcion;
    public MaterialTextView links;

    public DummyContent.DummyItem mItem;

    public DevocionalViewHolder(View view) {
        super(view);
        mView = view;
        autor = view.findViewById(R.id.tvDevocionalAutor);
        titulo = view.findViewById(R.id.tvDevocionalTitulo);
        subtitulo = view.findViewById(R.id.tvDevocionalSubtitulo);
        descripcion = view.findViewById(R.id.tvDeovicionalDetalleDescripcion);
        links = view.findViewById(R.id.tvDevocionalDetalleLinks);

    }

    @Override
    public String toString() {
        return super.toString() + " '" + titulo.getText() + "'";
    }
}