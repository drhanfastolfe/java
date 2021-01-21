package com.company;

import java.time.LocalDate;

public abstract class Animal
{
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected  double peso;
    protected String comentarios;

    public String getNombre()
    {
        return nombre;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public String getComentarios()
    {
        return comentarios;
    }

    public void setComentarios(String comentarios)
    {
        this.comentarios = comentarios;
    }

    @Override
    public abstract String toString();

    protected String sustituyeCaracter(String s, char c1, char c2)
    {
        String s1="";
        int i;

        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)==c1)
            {
                s1 = s1 + c2;
            }
            else
            {
                s1= s1 + s.charAt(i);
            }
        }
        return s1;
    }

    protected LocalDate convierteEnFecha(String fecha)
    {
        int dia, mes, anio;

        String[] aFecha = fecha.split("/");

        dia = Integer.parseInt(aFecha[0]);
        mes = Integer.parseInt(aFecha[1]);
        anio = Integer.parseInt(aFecha[2]);

        LocalDate d = LocalDate.of(anio,mes,dia);

        return d;
    }
}
