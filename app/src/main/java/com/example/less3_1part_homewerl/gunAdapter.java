package com.example.less3_1part_homewerl;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class gunAdapter extends RecyclerView.Adapter<GunViewHolder> {
    private ArrayList<String> gun;

    public gunAdapter(ArrayList<String> gun) {
        this.gun = gun;
    }

    @NonNull
    @Override
    public GunViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GunViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gun, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull GunViewHolder holder, int position) {
        holder.bind(gun.get(position));
    }

    @Override
    public int getItemCount() {
        return gun.size();
    }
}