package com.company;

import java.util.LinkedList;
import java.util.List;

public class ClinicaVeterinaria
{
    private List<Animal> listaAnimales;

    public ClinicaVeterinaria()
    {
        this.listaAnimales = new LinkedList<>();
    }

    public void insertaAnimal(Animal a)
    {
        this.listaAnimales.add(a);
    }

    public Animal buscaAnimal(String nombre)
    {
        int i;
        Animal a = null;

        for (i=0; i<this.listaAnimales.size();i++)
        {
            if (this.listaAnimales.get(i).nombre.equals(nombre))
            {
                a = this.listaAnimales.get(i);
                i = this.listaAnimales.size();
            }
        }

        return a;
    }

    public void modificaComentarioAnimal(String nombre, String comentario)
    {
        Animal a = buscaAnimal(nombre);
        a.setComentarios(comentario);
    }

    public String toString()
    {
        int i;
        String fichas = "";

        for (i=0;i<this.listaAnimales.size();i++)
        {
            if (i==0)
            {
                fichas = fichas + this.listaAnimales.get(i).toString();
            }
            else
            {
                fichas = fichas + System.lineSeparator() + System.lineSeparator() + this.listaAnimales.get(i).toString();
            }
        }

        return fichas;
    }

}
