package com.company;

import java.security.InvalidParameterException;

public class Alumno
{
    private String nombre;
    private int edad;
    private  double calificacion;

    public Alumno()
    {
    }

    public Alumno(String nombre, int edad, double calificacion)
    {
        setNombre(nombre);
        setEdad(edad);
        setCalificacion(calificacion);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        if (!nombre.equals(""))
        {
            this.nombre = nombre;
        }
        else
        {
            throw new InvalidParameterException("El campo nombre no puede estar vacío.");
        }
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if (edad>=17 && edad<=100)
        {
            this.edad = edad;
        }
        else
        {
            throw new InvalidParameterException("Edad tiene que estar ente 17 y 100");
        }
    }

    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(double calificacion)
    {
        if (calificacion>=0 && calificacion<=10)
        {
            this.calificacion = calificacion;
        }
        else
        {
            throw new InvalidParameterException("Calificación tiene que estar entre 0 y 10");
        }
    }

    public String toString()
    {
        String nombre = this.nombre;
        String edad = Integer.toString(this.edad);
        String calificacion = Double.toString(this.calificacion);
        String fichaAlumno = nombre + ", " + edad + ", " + calificacion;

        return fichaAlumno;
    }
}
