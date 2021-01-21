package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

public class Dinero
{
    static List<Moneda> listaMonedas;
    private double cantidad;
    private Moneda.TipoMoneda tMoneda;

    static
    {
        listaMonedas = new LinkedList<>();
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.euro, 2, "€", 1, "EUR"));
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.dolar, 2, "$", 1.12, "USD"));
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.libra, 2, "£", 0.86,"GBP"));
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.yen, 0, "¥", 119.31,"JPY"));

    }

    public Dinero(double cantidad, Moneda.TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public Dinero(int cantidad, Moneda.TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public static void actualizaCambio(Moneda.TipoMoneda t, double cambio)
    {
        listaMonedas.get(buscaMoneda(t)).setCambioEuro(cambio);
    }

    private static int buscaMoneda(Moneda.TipoMoneda t)
    {
        int i, tipo;
        tipo=0;

        for (i=0;i<listaMonedas.size();i++)
        {
            if (listaMonedas.get(i).gettMoneda()==t)
            {
                tipo = i;
                i=listaMonedas.size();
            }
        }

        return tipo;
    }

    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public Moneda.TipoMoneda gettMoneda()
    {
        return tMoneda;
    }

    public void settMoneda(Moneda.TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
    }

    public String toString()
    {
        double cantidad, redondeador;
        String simbolo, sCantidad, dinero;

        if (listaMonedas.get(buscaMoneda(this.tMoneda)).getDecimales()==0)
        {
            redondeador = 1.0;
        }
        else
        {
            if (listaMonedas.get(buscaMoneda(this.tMoneda)).getDecimales()==1)
            {
                redondeador = 10.0;
            }
            else
            {
                if (listaMonedas.get(buscaMoneda(this.tMoneda)).getDecimales()==2)
                {
                    redondeador = 100.0;
                }
                else
                {
                    if (listaMonedas.get(buscaMoneda(this.tMoneda)).getDecimales()==3)
                    {
                        redondeador = 1000.0;
                    }
                    else
                    {
                        redondeador = 10000.0;
                    }
                }
            }
        }

        cantidad = Math.floor(Math.round(getCantidad() * redondeador)) / redondeador;
        sCantidad = Double.toString(cantidad);

        dinero = sCantidad + listaMonedas.get(buscaMoneda(this.tMoneda)).getSimbolo();

        return dinero;
    }

    public double valorEn(Moneda.TipoMoneda t)
    {
        double valorEnEuro, valor;

        valorEnEuro = this.cantidad  / listaMonedas.get(buscaMoneda(this.tMoneda)).getCambioEuro();
        valor = valorEnEuro * listaMonedas.get(buscaMoneda(t)).getCambioEuro();

        return valor;
    }

    public Dinero convierteEn(Moneda.TipoMoneda t)
    {
        Dinero d = new Dinero(valorEn(t),t);

        return d;
    }

    public String toString(Moneda.TipoMoneda t)
    {
        String dinero = convierteEn(t).toString();

        return dinero;
    }

    public Dinero add(Dinero d)
    {
        double valor1, valor2, suma;

        valor1 = this.cantidad;
        valor2 = d.cantidad;

        if (this.tMoneda != d.tMoneda)
        {
           valor2 = valorEn(this.tMoneda);
        }

        suma = valor1 + valor2;

        Dinero dSumado = new Dinero(suma, this.tMoneda);

        return dSumado;
    }

    public Dinero substract(Dinero d)
    {
        double valor1, valor2, resta;

        valor1 = this.cantidad;
        valor2 = d.cantidad;

        if (this.tMoneda != d.tMoneda)
        {
            valor2 = valorEn(this.tMoneda);
        }

        resta = valor1 - valor2;

        Dinero dResta = new Dinero(resta, this.tMoneda);

        return dResta;
    }

    public Dinero multiply(double n)
    {
        double multiplicacion;

        multiplicacion = this.cantidad * n;

        Dinero dMultiplicacion = new Dinero(multiplicacion, this.tMoneda);

        return dMultiplicacion;
    }

    public Dinero divide(double n)
    {
        double division;

        division = this.cantidad / n;

        Dinero dDivision = new Dinero(division, this.tMoneda);

        return dDivision;
    }

    public Dinero negate()
    {
        Dinero dNegate = new Dinero((this.cantidad * (-1)), this.tMoneda);
        return dNegate;
    }

    public boolean equals(Dinero d)
    {
        double valor1, valor2;
        boolean igules = false;

        valor1 = this.cantidad;
        valor2 = d.cantidad;

        if (this.tMoneda != d.tMoneda)
        {
            valor2 = valorEn(this.tMoneda);
        }

        if (valor1 == valor2)
        {
            igules = true;
        }

        return igules;
    }

    public int comparteTo(Dinero d)
    {
        double valor1, valor2;
        int resultado;

        valor1 = this.cantidad;
        valor2 = d.cantidad;

        if (this.tMoneda != d.tMoneda)
        {
            valor2 = valorEn(this.tMoneda);
        }

        if (valor1 < valor2)
        {
            resultado = -1;
        }
        else
        {
            if (valor1 > valor2)
            {
                resultado = 1;
            }
            else
            {
                resultado = 0;
            }
        }

        return resultado;
    }

    public static void actualizaListaInternet() // esta to mal hecho, me dio pereza
    {
        try
        {
            URL url = new URL("https://api.exchangeratesapi.io/latest?symbols=USD,GBP,JPY");
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String page = br.readLine();
            br.close();
            is.close();
            String yen, dolar, libra;

            yen = page.substring(16,22);
            dolar = page.substring(29,35);
            libra = page.substring(42,47);

            listaMonedas.get(3).setCambioEuro(Double.parseDouble(yen));
            listaMonedas.get(1).setCambioEuro(Double.parseDouble(dolar));
            listaMonedas.get(2).setCambioEuro(Double.parseDouble(libra));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }




}
