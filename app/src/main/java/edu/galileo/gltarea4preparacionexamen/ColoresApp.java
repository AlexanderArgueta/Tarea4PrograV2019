package edu.galileo.gltarea4preparacionexamen;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class ColoresApp extends Application {

    private List<Colores> listColores;

    @Override
    public void onCreate() {
        super.onCreate();

        listColores = new ArrayList<Colores>();

    }

    public void insertaColores(Colores colores){
        listColores.add(colores);
    }

    public List<Colores> getColores (){
        return listColores;
    }
}
