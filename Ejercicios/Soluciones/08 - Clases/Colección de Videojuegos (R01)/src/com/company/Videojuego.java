package com.company;

import java.security.InvalidParameterException;

public class Videojuego
{
    private String nombre;
    private int anno;
    private Plataforma plataforma;
    private TipoJuego tipoJuego;
    private int valoracion;

    public Videojuego(String nombre, int anno, Plataforma plataforma, TipoJuego tipoJuego, int valoracion)
    {
        this.nombre = nombre;
        this.anno = anno;
        this.plataforma = plataforma;
        this.tipoJuego = tipoJuego;
        this.valoracion = valoracion;
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
            throw new InvalidParameterException("Nombre no válido.");
        }
    }

    public int getAnno()
    {
        return anno;
    }

    public void setAnno(int anno)
    {
        if (anno>=1970 && anno<=2100)
        {
            this.anno = anno;
        }
        else
        {
            throw new InvalidParameterException("Año no váldo.");
        }
    }

    public Plataforma getPlataforma()
    {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma)
    {
        this.plataforma = plataforma;
    }

    public TipoJuego getTipoJuego()
    {
        return tipoJuego;
    }

    public void setTipoJuego(TipoJuego tipoJuego)
    {
        this.tipoJuego = tipoJuego;
    }

    public int getValoracion()
    {
        return valoracion;
    }

    public void setValoracion(int valoracion)
    {
        if (valoracion>=0 && valoracion<=100)
        {
            this.valoracion = valoracion;
        }
        else
        {
            throw new InvalidParameterException("Valoración no válida.");
        }
    }

    @Override
    public String toString()
    {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", anno=" + anno +
                ", plataforma=" + plataforma +
                ", tipoJuego=" + tipoJuego +
                ", valoracion=" + valoracion +
                '}';
    }

    enum TipoJuego
    {
        Aventura, Accion, Rol, Estrategia, Conduccion, Deportes
    }

    enum Plataforma
    {
        PC, PlayStation4, XboxOne, Switch
    }




}
