package com.company;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baraja
{
    private List<Carta> listaCartas;

    public Baraja()
    {
        this.listaCartas = new LinkedList<>();
    }

    public Baraja(int tipobaraja)
    {
        if (tipobaraja == 1 || tipobaraja == 2)
        {
            this.listaCartas = new LinkedList<>();
            int i;
            if (tipobaraja == 1)
            {
                for (i=1;i<=40;i++)
                {
                    Carta cartaTemp = new Carta(i);
                    this.listaCartas.add(cartaTemp);
                }
            }
            else
            {
                for (i=1;i<=40;i++)
                {
                    Carta cartaTemp = new Carta(i);
                    this.listaCartas.add(cartaTemp);
                    if (i==40)
                    {
                        i=0;
                    }
                }
            }
        }
        else
        {
            throw  new InvalidParameterException("Tipo no válido");
        }
    }

    public Baraja(int tipobaraja, boolean barajar)
    {
        this(tipobaraja);

        if (barajar || barajar == false)
        {
            if (barajar)
            {
                Collections.shuffle(listaCartas);
            }
        }
        else
        {
            throw new InvalidParameterException("Boolean barajar no válido");
        }
    }

    public void barajar()
    {
        Collections.shuffle(listaCartas);
    }

    public void cortar(int numeroCartas)
    {
        int i;
        List<Carta> listaCartasTemp = new LinkedList<>();
        for (i=0;i<numeroCartas;i++)
        {
            listaCartasTemp.add(this.listaCartas.get(0));
            this.listaCartas.remove(0);
        }
        this.listaCartas.addAll(listaCartasTemp);
    }

    public Carta roba()
    {
        Carta c = this.listaCartas.get(0);
        this.listaCartas.remove(0);
        return c;
    }

    public void insertaCartaFinal(int idCarta)
    {
        Carta c = new Carta(idCarta);
        this.listaCartas.add(c);
    }

    public void insertaCartaPrincipio(int idCarta)
    {
        Carta c = new Carta(idCarta);
        this.listaCartas.add(0,c);
    }

    public void insertaCartaFinal(Carta c)
    {
        this.listaCartas.add(c);
    }

    public void insertaCartaPrincipio(Carta c)
    {
        this.listaCartas.add(0,c);
    }

    public int numeroCartas()
    {
        int nCartas = this.listaCartas.size();
        return nCartas;
    }

    public boolean vacia()
    {
        boolean vacia = true;

        if (this.listaCartas.size()>0)
        {
            vacia = false;
        }

        return vacia;
    }
}
