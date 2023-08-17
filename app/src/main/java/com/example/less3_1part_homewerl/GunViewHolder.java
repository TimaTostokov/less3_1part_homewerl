package com.example.less3_1part_homewerl;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.PluralsRes;
import androidx.recyclerview.widget.RecyclerView;

public class GunViewHolder extends RecyclerView.ViewHolder {
    private TextView gun_text;
    public GunViewHolder(@NonNull View itemView) {
        super(itemView);
        gun_text = itemView.findViewById(R.id.tv_gun);


    }
    public void bind(String gun){
        gun_text.setText(gun);
//setImageResource(R.drawable. )
    }
}
