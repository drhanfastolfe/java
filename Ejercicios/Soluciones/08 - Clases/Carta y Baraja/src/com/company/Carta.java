package com.company;

import java.security.InvalidParameterException;

public class Carta
{
    private int numero;
    private int palo;

    public Carta(int numero, int palo)
    {
        if (numero>=1 && numero<=10)
        {
            this.numero = numero;
        }
        else
        {
            throw new InvalidParameterException("Número no válido");
        }
        if (palo>=0 && palo<=3)
        {
            this.palo = palo;
        }
        else
        {
            throw new InvalidParameterException("Palo no válido");
        }
    }

    public Carta(int id)
    {
        if(id>=1 && id<=40)
        {
            if (id % 10 == 0)
            {
                this.numero = 10;
            }
            else
            {
                this.numero = id % 10;
            }
            if (id / 10 == 0)
            {
                this.palo = 0;
            }
            else
            {
                this.palo = id/10 -1;
            }
        }
        else
        {
            throw new InvalidParameterException("Id no válido");
        }
    }

    public int getNumero()
    {
        return numero;
    }

    public int getPalo()
    {
        return palo;
    }

    public String nombreNumero()
    {
        String[] aNombres = {"as", "dos","tres","cuatro","cinco","seis","siete","sota",
        "caballo","rey"};
        String nombre = aNombres[this.numero - 1];
        return nombre;
    }

    public String nombrePalo()
    {
        String[] aNombres = {"oros", "copas", "espadas", "bastos"};
        String nombre = aNombres[this.palo];
        return nombre;
    }

    public String nombreCarta()
    {
        String nombre = nombreNumero() + " de " + nombrePalo();
        return nombre;
    }

    public int valorTute()
    {
        int[] aValor = {11,0,10,0,0,0,0,2,3,4};
        int valor = aValor[this.numero-1];
        return valor;
    }

    public int valorMus()
    {
        int[] aValor = {1,1,10,4,5,6,7,10,10,10};
        int valor = aValor[this.numero-1];
        return valor;
    }

    public double valor7ymedia()
    {
        double valor;

        if (this.numero<8)
        {
            valor = this.numero;
        }
        else
        {
            valor = 0.5;
        }
        return valor;
    }







}
