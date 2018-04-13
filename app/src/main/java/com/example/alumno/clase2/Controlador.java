package com.example.alumno.clase2;

import android.view.View;

/**
 * Created by alumno on 12/04/2018.
 */
/*
LOGICA y no muestro nada, paso info a la vista.
 */
public class Controlador
{
    private Vista miVista;
    
    public View.OnClickListener li;

    public Controlador(Vista v)
    {
        this.miVista = v;
        this.li = new MyListener(this);
    }

    public Vista getVista()
    {
        return this.miVista;
    }


}
