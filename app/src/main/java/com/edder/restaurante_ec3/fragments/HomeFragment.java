package com.edder.restaurante_ec3.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edder.restaurante_ec3.databinding.FragmentHomeBinding;
import com.edder.restaurante_ec3.model.Platos;
import com.edder.restaurante_ec3.model.Shows;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rvMoviesResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rvMoviesResume.setLayoutManager(layoutManager);
    }





    private List<Shows> getData(){
        List<Shows> shows = new ArrayList<>();
        shows.add(new Platos("Ceviche","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-006_0.jpg","P"));
        shows.add(new Platos("Pollo a la brasa","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-003.jpg",""));
        shows.add(new Platos("Arroz Chaufa","https://www.paulinacocina.net/wp-content/uploads/2021/12/arroz-chaufa-peruano-receta.jpg",""));
        shows.add(new Platos("Lomo Saltado","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-004_0.jpg",""));
        shows.add(new Platos("Aji de Galina","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-005_0.jpg",""));
        shows.add(new Platos("Causa limeña","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-008.jpg",""));
        shows.add(new Platos("Pachamanca","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-010.jpg",""));
        shows.add(new Platos("Arroz con Pollo","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-001.jpg",""));
        shows.add(new Platos("Aguadito","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-007.jpg",""));
        shows.add(new Platos("Tacu Tacu","https://www.lima2019.pe/sites/default/files/inline-images/preview-gallery-002.jpg",""));


        return shows;
    }
}