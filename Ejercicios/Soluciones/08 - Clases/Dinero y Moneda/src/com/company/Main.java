package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Dinero.actualizaListaInternet();
        Scanner sc = new Scanner(System.in);
        int opcion;

        double cantidad = 0;
        int selecciona;
        Moneda.TipoMoneda tipo = Moneda.TipoMoneda.euro;
        Dinero d = new Dinero(cantidad, tipo);


        System.out.println("Introduce el valor de tu dinero:");
        cantidad = sc.nextDouble();
        d.setCantidad(cantidad);

        System.out.println("Selecciona la divisa: 1.EUR 2.USD 3.GBP 4.JPY");
        selecciona = sc.nextInt();
        switch (selecciona)
        {
            case 1: tipo = Moneda.TipoMoneda.euro; break;
            case 2: tipo = Moneda.TipoMoneda.dolar; break;
            case 3: tipo = Moneda.TipoMoneda.libra; break;
            case 4: tipo = Moneda.TipoMoneda.yen; break;
        }
        d.settMoneda(tipo);

        System.out.println("Elige una de las opciones o pulsa 0 para terminar.");
        System.out.println("1. Convertir  2. Sumar  3.Restar  4. Multiplicar  5. Dividir  6. Negar  7.Comparar");

        opcion = sc.nextInt();

        while (opcion != 0)
        {
            switch (opcion)
            {
                case 1:
                {
                    int selecciona1;
                    Moneda.TipoMoneda tipo1 = Moneda.TipoMoneda.euro;

                    System.out.println("A qué moneda lo quieres convertir: 1.EUR 2.USD 3.GBP 4.JPY");
                    selecciona1 = sc.nextInt();
                    switch (selecciona1)
                    {
                        case 1: tipo1 = Moneda.TipoMoneda.euro; break;
                        case 2: tipo1 = Moneda.TipoMoneda.dolar; break;
                        case 3: tipo1 = Moneda.TipoMoneda.libra; break;
                        case 4: tipo1 = Moneda.TipoMoneda.yen; break;
                    }
                    d = d.convierteEn(tipo1);
                    System.out.println(d.toString());
                }
                break;
                case 2:
                {
                    double cantidad2;
                    int selecciona2;
                    Moneda.TipoMoneda tipo2 = Moneda.TipoMoneda.euro;


                    System.out.println("Selecciona la moneda que quieres sumar: 1.EUR 2.USD 3.GBP 4.JPY");
                    selecciona2 = sc.nextInt();
                    switch (selecciona2)
                    {
                        case 1: tipo2 = Moneda.TipoMoneda.euro; break;
                        case 2: tipo2 = Moneda.TipoMoneda.dolar; break;
                        case 3: tipo2 = Moneda.TipoMoneda.libra; break;
                        case 4: tipo2 = Moneda.TipoMoneda.yen; break;
                    }
                    System.out.println("Introduce la cantidad de dinero a sumar:");
                    cantidad2 = sc.nextDouble();

                    Dinero d2 = new Dinero(cantidad2,tipo2);

                    d = d.add(d2);
                    System.out.println(d.toString());
                }
                break;
                case 3:
                {
                    double cantidad3;
                    int selecciona3;
                    Moneda.TipoMoneda tipo3 = Moneda.TipoMoneda.euro;


                    System.out.println("Selecciona la moneda que quieres restar: 1.EUR 2.USD 3.GBP 4.JPY");
                    selecciona3 = sc.nextInt();
                    switch (selecciona3)
                    {
                        case 1: tipo3 = Moneda.TipoMoneda.euro; break;
                        case 2: tipo3 = Moneda.TipoMoneda.dolar; break;
                        case 3: tipo3 = Moneda.TipoMoneda.libra; break;
                        case 4: tipo3 = Moneda.TipoMoneda.yen; break;
                    }
                    System.out.println("Introduce la cantidad de dinero a restar:");
                    cantidad3 = sc.nextDouble();

                    Dinero d3 = new Dinero(cantidad3,tipo3);

                    d = d.substract(d3);
                    System.out.println(d.toString());
                }
                break;
                case 4:
                {
                    double cantidad4;

                    System.out.println("Introduce la cantidad por la que multiplicar:");
                    cantidad4 = sc.nextDouble();

                    d = d.multiply(cantidad4);
                    System.out.println(d.toString());
                }
                break;
                case 5:
                {
                    double cantidad5;

                    System.out.println("Introduce la cantidad por la que dividir:");
                    cantidad5 = sc.nextDouble();

                    d = d.divide(cantidad5);
                    System.out.println(d.toString());
                }
                break;
                case 6:
                {
                    d = d.negate();

                    System.out.println(d.toString());
                }

                case 7:
                {
                    double cantidad7;
                    int selecciona7, comparador;
                    Moneda.TipoMoneda tipo7 = Moneda.TipoMoneda.euro;

                    System.out.println("Con qué moneda lo quieres comparar: 1.EUR 2.USD 3.GBP 4.JPY");
                    selecciona7 = sc.nextInt();
                    switch (selecciona7)
                    {
                        case 1: tipo7 = Moneda.TipoMoneda.euro; break;
                        case 2: tipo7 = Moneda.TipoMoneda.dolar; break;
                        case 3: tipo7 = Moneda.TipoMoneda.libra; break;
                        case 4: tipo7 = Moneda.TipoMoneda.yen; break;
                    }

                    System.out.println("Introduce la cantidad de dinero a comparar:");
                    cantidad7 = sc.nextDouble();
                    Dinero d7 = new Dinero(cantidad7,tipo7);

                    comparador = d.comparteTo(d7);

                    if (comparador==-1)
                    {
                        System.out.println(d.toString() + " < " + d7.toString());
                    }
                    else
                    {
                        if (comparador==1)
                        {
                            System.out.println(d.toString() + " > " + d7.toString());
                        }
                        else
                        {
                            System.out.println(d.toString() + " = " + d7.toString());
                        }
                    }
                }
                break;
            }

            System.out.println("Elige una de las opciones o pulsa 0 para terminar.");
            System.out.println("1. Convertir  2. Sumar  3.Restar  4. Multiplicar  5. Dividir  6. Negar  7.Comparar");

            opcion = sc.nextInt();
        }


    }
}
