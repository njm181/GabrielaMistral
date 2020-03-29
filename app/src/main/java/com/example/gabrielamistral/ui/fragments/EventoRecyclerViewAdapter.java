package com.example.gabrielamistral.ui.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.DummyContent.DummyItem;

import java.util.List;


public class EventoRecyclerViewAdapter extends RecyclerView.Adapter<EventoViewHolder> implements View.OnClickListener{

    private final List<DummyItem> mValues;

    View.OnClickListener listener;


    public EventoRecyclerViewAdapter(Context context, List<DummyItem> items) {
        mValues = items;
    }

    @Override
    public EventoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_evento, parent, false);

        view.setOnClickListener(this);

        return new EventoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final EventoViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }
}


