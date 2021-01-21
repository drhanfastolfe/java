package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Introduce el número del día.");
        dia = sc.nextInt();

        while (dia < 1 || dia > 31)
        {
            System.out.println("ERROR: los dias son del 1 al 31.");
            System.out.println("Indroduce número del día.");
            dia = sc.nextInt();
        }

        System.out.println("Indroduce el número del mes.");
        mes = sc.nextInt();

        while (mes < 1 || mes > 12)
        {
            System.out.println("ERROR: los meses son del 1 al 12.");
            System.out.println("Indroduce el número del mes.");
            mes = sc.nextInt();
        }

        System.out.println("Indroduce el año.");
        anio = sc.nextInt();

        System.out.println("Es el día de la semana número " + diaSemanaFecha(dia, mes, anio));
    }

    public static int diasMes(int mes)
    {
        int diasMes;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            diasMes = 30;
        }
        else
        {
            if (mes == 2)
            {
                diasMes = 28;
            }
            else
            {
                diasMes = 31;
            }
        }
        return diasMes;
    }

    public static boolean bisiesto(int anio)
    {
        boolean resultado;
        if (anio % 4 == 0 && (!(anio % 100 == 0) || (anio % 400 == 0)))
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    public static int diasMes2(int mes, int anio)
    {
        if (bisiesto(anio) && mes == 2)
        {
            return 29;
        }
        else
        {
            return diasMes(mes);
        }
    }

    public static int diasTranscurridos(int dia, int mes, int anio)
    {
        int diasTranscurridos, sumatorio, imes;
        sumatorio = 0;

        for (imes = 1; imes < mes; imes++)
        {
            sumatorio = diasMes2(imes, anio) + sumatorio;
        }

        diasTranscurridos = sumatorio + dia;

        return diasTranscurridos;
    }

    public static int diasTranscurridos1980(int dia, int mes, int anio)
    {
        int diasTranscurridos1980, sumatorio, ianio;
        sumatorio = 0;

        for (ianio = 1980; ianio < anio; ianio++)
        {
            sumatorio = diasTranscurridos(31, 12, ianio) + sumatorio;
        }

        diasTranscurridos1980 = sumatorio + diasTranscurridos(dia, mes, anio);

        return diasTranscurridos1980;
    }

    public static int diasEntreFechas(int dia1, int mes1, int anio1, int dia2, int mes2, int anio2)
    {
        int diasEntreFechas, diasTranscurridosAnio1, diasTranscurridosAnio2, sumatorio, ianio;
        sumatorio = 0;

        for (ianio = anio1; ianio + 1 < anio2; ianio++)
        {
            sumatorio = diasTranscurridos(31, 12, ianio) + sumatorio;
        }

        diasTranscurridosAnio1 = diasTranscurridos(31,12, anio1) - diasTranscurridos(dia1, mes1, anio1);
        diasEntreFechas = diasTranscurridosAnio1 + sumatorio + diasTranscurridos(dia2, mes2, anio2);

        return diasEntreFechas;
    }

    public static int diaSemanaFecha(int dia, int mes, int anio)
    {
        int diaSemana;

        diaSemana = (diasTranscurridos1980(dia, mes, anio) + 1) % 7;

        if ((diasTranscurridos1980(dia, mes, anio) + 1) % 7 == 0)
        {
            diaSemana = 7;
        }

        return diaSemana;
    }

}
