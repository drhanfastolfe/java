package com.company;

import java.security.InvalidParameterException;

public class Fraccion
{
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador)
    {
        this.numerador = numerador;
        setDenominador(denominador);
    }

    public Fraccion(int num)
    {
        this.numerador = num;
        this.denominador = 1;
    }

    public Fraccion(double num)
    {
        double denominador;
        int n, numerador;
        numerador = 1;
        denominador = num;
        n = (int) Math.floor(denominador);
        while (denominador / n != 1)
        {
            denominador = denominador * 10;
            numerador = numerador * 10;
            n = (int) Math.floor(denominador);
        }
        this.denominador = (int)denominador;
        this.numerador = numerador;
    }

    public int getNumerador()
    {
        return numerador;
    }

    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setDenominador(int denominador)
    {
        if (denominador!=0)
        {
            this.denominador = denominador;
        }
        else
        {
            throw new InvalidParameterException("Denominador ni válido.");
        }
    }

    private int mcd(int a, int b)
    {
        int i, max;
        max = 1;
        i = b;

        if (a < b)
        {
            i = a;
        }

        while (i >= 1)
        {
            if (a % i == 0 && b % i == 0)
            {
                max = i;
                i = -1;
            }
            i--;
        }
        return max;
    }

    private int mcm(int a, int b)
    {
        int mayor, i, min, multiplo;
        mayor = b;

        if (a > b)
        {
            mayor = a;
        }
        multiplo = mayor;
        i=2;
        while (multiplo % a != 0 || multiplo % b != 0)
        {
            multiplo = mayor * i;
            i++;
        }
        min = multiplo;
        return min;
    }

    public void simplificar()
    {
        int mcd;

        mcd = mcd(this.numerador, this.denominador);

        while (this.numerador / mcd != this.numerador && this.denominador / mcd != this.denominador)
        {
            this.numerador = this.numerador / mcd;
            this.denominador = this.denominador / mcd;
            mcd = mcd(this.numerador, this.denominador);
        }
    }

    public String toString()
    {
        String numerador, denominador, fraccion;

        numerador = Integer.toString(this.numerador);
        denominador = Integer.toString(this.denominador);
        fraccion = numerador + "/" + denominador;

        return fraccion;
    }

    public Fraccion negate()
    {
        int numerador = this.numerador * (-1);
        Fraccion f = new Fraccion(numerador, this.denominador);
        return f;
    }

    public Fraccion add(Fraccion f)
    {
        int mcm, numerador, denominador;

        mcm = mcm(this.denominador,f.getDenominador());

        denominador = mcm;
        numerador = ((mcm / this.denominador) * this.numerador) +
                    ((mcm / f.getDenominador()) * f.getNumerador());

        Fraccion f2 = new Fraccion(numerador,denominador);

        return f2;

    }

    public Fraccion substract(Fraccion f)
    {
        int mcm, numerador, denominador;

        mcm = mcm(this.denominador,f.getDenominador());

        denominador = mcm;
        numerador = ((mcm / this.denominador) * this.numerador) -
                ((mcm / f.getDenominador()) * f.getNumerador());

        Fraccion f2 = new Fraccion(numerador,denominador);

        return f2;
    }

    public Fraccion multiply(Fraccion f)
    {
        int numerador, denominador;

        numerador = this.numerador * f.getNumerador();
        denominador = this.denominador * f.getDenominador();

        Fraccion f2 = new Fraccion(numerador, denominador);

        return f2;
    }

    public Fraccion divide(Fraccion f)
    {
        int numerador, denominador;

        numerador = this.numerador * f.getDenominador();
        denominador = this.denominador * f.getNumerador();

        Fraccion f2 = new Fraccion(numerador,denominador);

        return f2;
    }

    public boolean equals(Fraccion f)
    {
        boolean igual = false;

        if (this.numerador * f.getDenominador() == this.denominador * f.getNumerador())
        {
            igual = true;
        }

        return igual;
    }

    public int compareTo(Fraccion f)
    {
        double numerador, denominador, valor;
        int comparador;

        numerador = this.numerador * f.getDenominador();
        denominador = this.denominador * f.getNumerador();
        valor = numerador / denominador;
        if (valor > 1)
        {
            comparador = 1;
        }
        else
        {
            if (valor < 1)
            {
                comparador = -1;
            }
            else
            {
                comparador = 0;
            }
        }

        return comparador;
    }

}
