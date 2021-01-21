package com.company;

import java.security.InvalidParameterException;

public class Moneda
{
    private TipoMoneda tMoneda;
    private int decimales;
    private String simbolo;
    private double cambioEuro;
    private String codigo;

    public Moneda(TipoMoneda tMoneda, int decimales, String simbolo, double cambioEuro, String codigo)
    {
        this.tMoneda = tMoneda;

        if (decimales>=0 && decimales<=4)
        {
            this.decimales = decimales;
        }
        else
        {
            throw new InvalidParameterException("Decimales no válidos.");
        }

        if (!simbolo.equals(""))
        {
            this.simbolo = simbolo;
        }
        else
        {
            throw new InvalidParameterException("Símbolo no válido.");
        }

        setCambioEuro(cambioEuro);

        this.codigo = codigo;
    }

    public TipoMoneda gettMoneda()
    {
        return tMoneda;
    }

    public int getDecimales()
    {
        return decimales;
    }

    public String getSimbolo()
    {
        return simbolo;
    }

    public double getCambioEuro()
    {
        return cambioEuro;
    }

    public void setCambioEuro(double cambioEuro)
    {
        if (cambioEuro>=0)
        {
            this.cambioEuro = cambioEuro;
        }
        else
        {
            throw new InvalidParameterException("Cambio no válido.");
        }
    }

    enum TipoMoneda
    {
        euro, libra, dolar, yen
    }



}

