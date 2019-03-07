package edu.galileo.gltarea4preparacionexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtRojo,txtVerde, txtAzul, txtNombre;
    private Button btnAgregar, btnConsultar;

    List<Colores> listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRojo = findViewById(R.id.primero);
        txtVerde = findViewById(R.id.segundo);
        txtAzul = findViewById(R.id.tercero);
        txtNombre = findViewById(R.id.nombre);
        btnAgregar = findViewById(R.id.agregar);
        btnConsultar = findViewById(R.id.listar);


        btnAgregar.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Colores temp;
        Intent intent;

        switch (v.getId()){
            case R.id.agregar :
                temp = new Colores();
                temp.setNombre(txtNombre.getText().toString());
                temp.setRojo(txtRojo.getText().toString());
                temp.setVerde(txtVerde.getText().toString());
                temp.setAzul(txtAzul.getText().toString());
                txtNombre.setText("");
                txtAzul.setText("");
                txtVerde.setText("");
                txtRojo.setText("");
                ((ColoresApp)getApplication()).insertaColores(temp);
                break;
            case R.id.listar :
                intent = new Intent(this, ListActivity.class);
                startActivity(intent);

                break;

        }
    }
}
