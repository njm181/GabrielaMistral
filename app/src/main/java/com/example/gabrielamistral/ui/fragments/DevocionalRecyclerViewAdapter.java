package com.example.gabrielamistral.ui.fragments;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.ui.fragments.DevocionalListFragment.OnListFragmentInteractionListener;
import com.example.gabrielamistral.ui.fragments.dummy.DummyContent.DummyItem;

import java.util.List;

public class DevocionalRecyclerViewAdapter extends RecyclerView.Adapter<DevocionalViewHolder> implements View.OnClickListener {

    private final List<DummyItem> mValues;

    View.OnClickListener listener;

    public DevocionalRecyclerViewAdapter(List<DummyItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
    }

    @Override
    public DevocionalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_devocional, parent, false);

        view.setOnClickListener(this);

        return new DevocionalViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final DevocionalViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }
}
