package com.company;

import java.util.LinkedList;
import java.util.List;

public class Coleccion
{
    private List<Videojuego> listaVideojuegos;

    public Coleccion()
    {
        this.listaVideojuegos = new LinkedList<>();
    }

    public void insertaVideojuego(Videojuego v)
    {
        this.listaVideojuegos.add(v);
    }

    public void eliminaVideojuego(int posicion)
    {
        this.listaVideojuegos.remove(posicion-1);
    }

    public Videojuego getVideojuego(int posicion)
    {
        Videojuego v = this.listaVideojuegos.get(posicion-1);

        return v;
    }

    public String toString()
    {
        String tabla;
        int i, j;

        tabla = "Videojuego                    Año   Plataforma      Tipo de juego   Val." + System.lineSeparator() +
                "------------------------------------------------------------------------" + System.lineSeparator();

        for (i=0;i<this.listaVideojuegos.size();i++)
        {
            tabla = tabla + this.listaVideojuegos.get(i).getNombre();

            for (j=0;j<30-this.listaVideojuegos.get(i).getNombre().length();j++)
            {
                tabla = tabla + " ";
            }

            tabla = tabla + this.listaVideojuegos.get(i).getAnno() + "   " + this.listaVideojuegos.get(i).getPlataforma();

            for (j=0;j<16-this.listaVideojuegos.get(i).getPlataforma().toString().length();j++)
            {
                tabla = tabla + " ";
            }

            tabla = tabla + this.listaVideojuegos.get(i).getTipoJuego();

            for (j=0;j<16-this.listaVideojuegos.get(i).getTipoJuego().toString().length();j++)
            {
                tabla = tabla + " ";
            }

            tabla = tabla + this.listaVideojuegos.get(i).getValoracion() + "  " + System.lineSeparator();
        }

        return tabla;
    }

    public String toStringNum()
    {
        int i;
        String lista = "";

        for (i=0;i<this.listaVideojuegos.size();i++)
        {
            lista = lista + (i+1) + "- " + this.listaVideojuegos.get(i).getNombre() + System.lineSeparator();
        }

        return lista;
    }
}
