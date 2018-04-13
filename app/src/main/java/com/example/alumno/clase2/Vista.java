package com.example.alumno.clase2;

import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

/**
 * Created by alumno on 12/04/2018.
 */


/*
van los get y los set de la pantalla
*/
public class Vista {

    private EditText txtNombre;
    private EditText txtApellido;
    private EditText txtDni;
    private RadioGroup rgSexo;
    private Button btnGuardar;
    private Controlador miControlador;

    public Vista(Activity miActividad)
    {
        txtNombre = (EditText) (miActividad.findViewById(R.id.edtNombre));
        txtApellido = (EditText) (miActividad.findViewById(R.id.edtApellido));
        txtDni = (EditText) (miActividad.findViewById(R.id.edtDni));
        rgSexo = (RadioGroup) (miActividad.findViewById(R.id.radioGroupSex));
        btnGuardar = (Button) (miActividad.findViewById(R.id.btnGuardar));

    }

    public void setControlador(Controlador c)
    {
        this.miControlador = c;
        btnGuardar.setOnClickListener(c.li);
    }

    public Persona getPersona()
    {
        Persona p = new Persona();
        p.setNombre(this.txtNombre.getText().toString());
        /*
        Log.d("Nombre:", this.nombre.getText().toString());

        if(rgsexo.getCheckedRadioButtonId() == R.id.rbtHombre)
        {
            elsexo = "Hombre";
        }else if(sexo.getCheckedRadioButtonId() == R.id.rbtMujer)
        {
            elsexo = "Mujer";
        }
            /*
            if(bnt.get("Guardar"))
            {

            }*/

        Log.d("Click","Se hizo click");
        return p;
    }
}
