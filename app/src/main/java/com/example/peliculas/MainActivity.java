package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.peliculas.databinding.ActivityMainBinding;
import com.example.peliculas.models.Pelicula;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    private ActivityMainBinding binding;

    private MainActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = getApplicationContext();

        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        peliculas = mv.getPeliculas();


        RecyclerView rv = binding.rvPeliculas;

        GridLayoutManager grilla = new GridLayoutManager(context,1,GridLayoutManager.VERTICAL,false);
        rv.setLayoutManager(grilla);

        ListaPeliculasAdapter adapter = new ListaPeliculasAdapter(context,peliculas,getLayoutInflater());
        rv.setAdapter(adapter);
    }
}