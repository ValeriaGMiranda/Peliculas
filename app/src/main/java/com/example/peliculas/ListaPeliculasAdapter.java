package com.example.peliculas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.peliculas.models.Pelicula;

import java.util.List;

public class ListaPeliculasAdapter extends RecyclerView.Adapter<ListaPeliculasAdapter.ViewHolder>{
private Context context;
private List<Pelicula> peliculas;
private LayoutInflater inflater;

    public ListaPeliculasAdapter(Context context, List<Pelicula> peliculas, LayoutInflater inflater) {
        this.context = context;
        this.peliculas = peliculas;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = inflater.inflate(R.layout.item_view,parent,false);

        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(peliculas.get(position).getTitulo());
        holder.descripcion.setText(peliculas.get(position).getDescripcion());

        Glide.with(context)
                        .load(peliculas.get(position).getPortada())
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                        .into(holder.portada);

        holder.btnDetalles.setOnClickListener(
        new View.OnClickListener()
        {
              @Override
              public void onClick(View v) {
                  Bundle bundle = new Bundle();
                  bundle.putSerializable("pelicula",peliculas.get(position));
                  Intent intent = new Intent(context,DetalleActivity.class);
                  intent.putExtra("pelicula",bundle);
                  intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                  context.startActivity(intent);

              }
          }
        );

    }

    @Override
    public int getItemCount() {

        return peliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView descripcion;
        ImageView portada;

        Button btnDetalles;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tvTitulo);
            descripcion = itemView.findViewById(R.id.tvDescripcion);
            portada = itemView.findViewById(R.id.ivPortada);
            btnDetalles = itemView.findViewById(R.id.btVerMas);

        }
    }

}
