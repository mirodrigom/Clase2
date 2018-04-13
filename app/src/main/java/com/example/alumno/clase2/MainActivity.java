package com.example.alumno.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    /*
    Modelo : es donde tengo un pojo, que se manda a la vista y al controlador.
    Vista: activity lo q se ve
    Controlador: logica, sin get o set de la vista!!!
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vista v = new Vista(this);
        Controlador c = new Controlador(v);
        v.setControlador(c);


/*
        btn.setOnClickListener(new MyListener(txt,edt));
*/


    }
}
