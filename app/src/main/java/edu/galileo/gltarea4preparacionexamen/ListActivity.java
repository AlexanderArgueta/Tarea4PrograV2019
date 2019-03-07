package edu.galileo.gltarea4preparacionexamen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lista = findViewById(R.id.list_colores);
        lista.setAdapter(new ColoresAdapter(this, ((ColoresApp)getApplication()).getColores()));
    }
}
