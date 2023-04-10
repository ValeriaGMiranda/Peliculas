package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.peliculas.databinding.ActivityDetalleBinding;
import com.example.peliculas.models.Pelicula;

public class DetalleActivity extends AppCompatActivity {

    ActivityDetalleBinding binding;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        context = getApplicationContext();


        super.onCreate(savedInstanceState);

        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getBundleExtra("pelicula");
        Pelicula pelicula = (Pelicula)bundle.getSerializable("pelicula");
        binding.tvTitulo.setText(pelicula.getTitulo());
        binding.tvDescripcion.setText(pelicula.getDescripcion());
        binding.tvDirector.setText(pelicula.getDirector());
        binding.tvActor.setText(pelicula.getActor());

        Glide.with(context
                )
                .load(pelicula.getPortada())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.ivPortada);



    }
}