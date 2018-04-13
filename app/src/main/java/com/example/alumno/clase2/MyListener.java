package com.example.alumno.clase2;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by alumno on 05/04/2018.
 */
/*
Implemento una interfaz de view on click listener y el metodo de la lamparita.
 */

    public class MyListener implements View.OnClickListener{


        Controlador con;
        public MyListener(Controlador c)
        {
            this.con = c;
        }

        //Este metodo va a escuchar el boton onclick.
        @Override
        public void onClick(View v)
        {
            //v.findViewById(R)
            Persona p = this.con.getVista().getPersona();
            Log.d("algo",p.getNombre());

        }

}

