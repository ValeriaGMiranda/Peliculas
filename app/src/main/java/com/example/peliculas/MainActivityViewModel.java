package com.example.peliculas;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.peliculas.models.Pelicula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private Intent intent;
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        peliculas.add(new Pelicula("Volver al Futuro","El adolescente Marty McFly es amigo de Doc, un científico que ha construido una máquina del tiempo. Cuando los dos prueban el artefacto, un error fortuito hace que Marty llegue a 1955, año en el que sus padres iban al instituto y todavía no se habían conocido. Después de impedir su primer encuentro, Marty deberá conseguir que se conozcan y se enamoren, de lo contrario su existencia no sería posible.","https://pics.filmaffinity.com/Regreso_al_futuro-100822308-large.jpg","Robert Zemeckis", "Michael J. Fox, Christopher Lloyd"));
        peliculas.add(new Pelicula("Star Trek II: La ira de Khan","Kirk, Spock y la tripulación del Enterprise tienen que enfrentarse contra un viejo enemigo que culpa a Kirk por la muerte de su esposa.","https://pics.filmaffinity.com/Star_Trek_II_La_ira_de_Khan-109537374-large.jpg","Nicholas Meyer", "William Shatner, Leonard Nimoy, Ricardo Montalbán, DeForest Kelley, James Doohan, Walter Koenig, Nichelle Nichols"));
        peliculas.add(new Pelicula("Mentiras Verdaderas","El agente especial Harry Tasker mantiene una doble vida. Harry trabaja como espía internacional para Omega, una agencia gubernamental ultrasecreta encargada de la neutralización del terrorismo nuclear, mientras su familia cree que es un vendedor. Sin embargo, sus dos vidas están a punto de converger.","https://pics.filmaffinity.com/true_lies-799065099-mmed.jpg","James Cameron","Arnold Schwarzenegger, Jamie Lee Curtis"));
    }

    public ArrayList<Pelicula> getPeliculas(){
        return peliculas;
    }
}
