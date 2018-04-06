package com.example.alumno.clase2;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by alumno on 05/04/2018.
 */
/*
Implemento una interfaz de view on click listener y el metodo de la lamparita.
 */

    public class MyListener implements View.OnClickListener{

        private EditText nombre;
        private EditText apellido;
        private EditText dni;
        private RadioButton sexo;
        public MyListener(EditText nom, EditText ape, EditText docu, RadioButton sex)
        {
            this.nombre = nom;
            this.apellido = ape;
            this.dni = docu;
            this.sexo = sex;
        }

        //Este metodo va a escuchar el boton onclick.
        @Override
        public void onClick(View v) {

            Button bnt = (Button)(v.findViewById(R.id.btnGuardar));
            /*
            if(bnt.get("Guardar"))
            {

            }*/

            Log.d("Click","Se hizo click");
        }

}

