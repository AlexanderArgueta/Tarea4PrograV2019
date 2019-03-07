package edu.galileo.gltarea4preparacionexamen;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

public class ColoresAdapter extends ArrayAdapter <Colores> {

    private List<Colores> lista;
    private Context context;
    private int layout;

    public ColoresAdapter(@NonNull Context context, @NonNull List<Colores> objects) {
        super(context, R.layout.item_list_colores_layout, objects);
        this.lista = objects;
        this.context = context;
        this.layout = R.layout.item_list_colores_layout;

    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null ){
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.item_list_colores_layout, null);

        }
        if (lista.get(position) != null) {
            int fistColor, secondColor, threeColor, color;
            LinearLayout lytfondo;
            TextView txNombre;
            lytfondo = v.findViewById(R.id.ColorIngresado);
            txNombre = v.findViewById(R.id.tx_nombre);
            txNombre.setText(lista.get(position).getNombre());

            fistColor = Integer.parseInt(lista.get(position).getRojo().toString());
            secondColor = Integer.parseInt(lista.get(position).getVerde().toString());
            threeColor = Integer.parseInt(lista.get(position).getAzul().toString());

            color = Color.rgb(fistColor,secondColor,threeColor);
            lytfondo.setBackgroundColor(color);

        }
        return v;
    }

}
