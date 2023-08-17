package com.example.less3_1part_homewerl;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    private ArrayList<String> gun;
    private RecyclerView gunnnn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gunnnn = view.findViewById(R.id.recycler_view);
        loadData();
        gunAdapter gunAdapter = new gunAdapter(gun);
        gunnnn.setAdapter(gunAdapter);
    }

    private void loadData() {
        gun = new ArrayList<>();

        gun.add("Pilimet");
        gun.add("GLOCK-17");
        gun.add("ARBALET");
        gun.add("DILNAZ-448");
        gun.add("BAYAS-5743");
        gun.add("BBAXA");
        gun.add("VSPYSHKA");
        gun.add("AK-SOVENTKIY");
        gun.add("TOMSON");
        gun.add("AVM");
        gun.add("DROBOVIK");
        gun.add("GRANATA");
        gun.add("AK-47");
        gun.add("DIGLE");

    }
}