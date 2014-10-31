package com.ejemplo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Ejemplo1 extends Activity implements View.OnClickListener
{
    EditText etNombre;
    Button btDespedir, btPreguntar;
    ToggleButton btSaludar;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Asociacion de la parte grafica con la operativa
        etNombre = (EditText)this.findViewById(R.id.etNombre);
        btSaludar = (ToggleButton)this.findViewById(R.id.btSaludar);
        btDespedir = (Button)this.findViewById(R.id.btDespedir);
        btPreguntar = (Button)this.findViewById(R.id.btPreguntar);
        
        //Evento de click
        btDespedir.setOnClickListener(this);
        
        //Evento de click dinamico
        btPreguntar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                Toast.makeText(v.getContext(), "¿Que quieres "+nombre+"?", Toast.LENGTH_LONG).show();
            }
        });
    }
    
    public void saludar(View panchito)
    {
        String nombre = etNombre.getText().toString();
        Toast.makeText(this, "Hola "+nombre, Toast.LENGTH_LONG).show();
    }

    public void onClick(View v) {
        String nombre = etNombre.getText().toString();
        Toast.makeText(this, "Adios "+nombre, Toast.LENGTH_LONG).show();
    }
    
}
