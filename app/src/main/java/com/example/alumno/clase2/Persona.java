package com.example.alumno.clase2;

import android.text.Editable;

/**
 * Created by alumno on 12/04/2018.
 */
//Modelo
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String sexo;

    public Persona()
    {

    }

    public void setNombre(String nom)
    {
        this.nombre = nom;
    }

    public String getNombre()
    {
        return this.nombre;
    }
}
