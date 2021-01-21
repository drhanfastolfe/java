package com.company;

import java.security.InvalidParameterException;

public class Hora
{
    private int segundos;

    public Hora(int segundos)
    {
        if (segundos>=0)
        {
            this.segundos = segundos;
        }
        else
        {
            throw new InvalidParameterException("Segundos no válidos.");
        }
    }

    public Hora(int hora, int minutos, int segundos)
    {
        if (hora>=0 && minutos>=0 && minutos<60 && segundos>=0 && segundos<60)
        {
            this.segundos = (hora*3600) + (minutos*60) + segundos;
        }
        else
        {
            throw new InvalidParameterException("Parámetro inválido.");
        }
    }

    public int getSegundosTotales()
    {
        return this.segundos;
    }

    public void setSegundosTotales(int segundosTotales)
    {
        this.segundos = segundosTotales;
    }

    public int getSegundos()
    {
        int segundos;

        segundos = (this.segundos % 3600) % 60;

        return segundos;
    }

    public int getMinutos()
    {
        int minutos;

        minutos = (this.segundos % 3600) / 60;

        return minutos;
    }

    public int getHoras()
    {
        int horas;

        horas = this.segundos / 3600;

        return horas;
    }

    public void setSegundos(int segundos)
    {
        if (segundos>=0 && segundos<60)
        {
            int minutos, horas;

            minutos = (this.segundos % 3600) / 60;
            horas = this.segundos / 3600;

            this.segundos = segundos + (minutos * 60) + (horas * 3600);
        }
        else
        {
            throw new InvalidParameterException("Parámetro inválido.");
        }
    }

    public void setMinutos(int minutos)
    {
        if (minutos>=0 && minutos<60)
        {
            int segundos, horas;

            segundos = (this.segundos % 3600) % 60;
            horas = this.segundos / 3600;

            this.segundos = segundos + (minutos * 60) + (horas * 3600);
        }
        else
        {
            throw new InvalidParameterException("Parámetro inválido.");
        }
    }

    public void setHoras(int horas)
    {
        int segundos, minutos;

        segundos = (this.segundos % 3600) % 60;
        minutos = (this.segundos % 3600) / 60;

        this.segundos = segundos + (minutos * 60) + (horas * 3600);
    }

    public void sumaHoras(int horas)
    {
        this.segundos = this.segundos + (horas * 3600);
    }

    public void sumaMinutos(int minutos)
    {
        this.segundos = this.segundos + (minutos * 60);
    }

    public void sumaSegundos(int segundos)
    {
        this.segundos = this.segundos + segundos;
    }

    public void add(Hora h)
    {
        this.segundos = this.segundos + h.segundos;
    }

    public void substract(Hora h)
    {
        this.segundos = this.segundos - h.segundos;
    }

    public String toString()
    {
        String sHora, sHoras, sMinutos, sSegundos;
        int horas, minutos, segundos;

        horas = this.segundos / 3600;
        minutos = (this.segundos % 3600) / 60;
        segundos = (this.segundos % 3600) % 60;

        sHoras = String.valueOf(horas);
        sMinutos = String.valueOf(minutos);
        sSegundos = String.valueOf(segundos);

        if (sHoras.length()<2)
        {
            sHoras = "0" + sHoras;
        }

        if (sMinutos.length()<2)
        {
            sMinutos = "0" + sMinutos;
        }

        if (sSegundos.length()<2)
        {
            sSegundos = "0" + sSegundos;
        }

        sHora = sHoras + ":" + sMinutos + ":" + sSegundos;

        return sHora;
    }


}
