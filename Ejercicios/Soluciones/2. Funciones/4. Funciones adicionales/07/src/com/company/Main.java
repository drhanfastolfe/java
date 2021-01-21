package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mes, anio;

        System.out.println("Introduce el número del mes.");
        mes = sc.nextInt();
        System.out.println("Introduce el año.");
        anio = sc.nextInt();

        calendarioGrafico(mes, anio);
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

    public static void calendarioGrafico(int mes, int anio)
    {
        int diasDelMes, diaDeInicio, i, j;

        diasDelMes = diasMes2(mes,anio);
        diaDeInicio = diaSemanaFecha(1,mes,anio);

        System.out.println("   L  M  X  J  V  S  D");

        for (i=1; i<=diaDeInicio;i++)
        {
            System.out.print("   ");
        }
        for (i=1; i<=diasDelMes; i++)
        {
            System.out.print(i);
            if (i>=9)
            {
                System.out.print(" ");
            }
            if (i < 9)
            {
                System.out.print("  ");
            }

            if (diaDeInicio == 7 || diaDeInicio==14 || diaDeInicio==21 || diaDeInicio==28 || diaDeInicio==35)
            {
                System.out.println();
                if (i>=9)
                {
                    System.out.print("  ");
                }
                if (i<9)
                {
                    System.out.print("   ");
                }
            }
            diaDeInicio++;
        }
    }
}
