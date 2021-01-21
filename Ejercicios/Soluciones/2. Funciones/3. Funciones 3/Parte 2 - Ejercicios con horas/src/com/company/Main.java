package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, hora, minutos, segundos;
        System.out.println(segundosTranscurridos1980(24,10,2019,12,32,0));
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

    public static int horaASegundos(int hora, int minutos, int segundos)
    {
        int s;

        s = hora * 3600 + minutos * 60 + segundos;

        return s;
    }

    public static void escribeHoraBonita(int hora, int minutos, int segundos)
    {
        int hh, mm, ss;

        ss = horaASegundos(hora, minutos, segundos) % 60;
        mm = (horaASegundos(hora, minutos, segundos) / 60) % 60;
        hh = (horaASegundos(hora, minutos, segundos) / 60) / 60;

        System.out.println(hh + ":" + mm + ":" + ss);
    }

    public static void escribeSegundosBonitos(int segundos)
    {
        escribeHoraBonita(0, 0, segundos);
    }

    public static int segundosTranscurridos(int hora1, int minutos1, int segundos1, int hora2, int minutos2, int segundos2)
    {
        int segundosTranscurridos;

        segundosTranscurridos = Math.abs(horaASegundos(hora1, minutos1, segundos1) - horaASegundos(hora2, minutos2, segundos2));

        return segundosTranscurridos;
    }

    public static int segundosTranscurridos1980(int dia, int mes, int anio, int hora, int minutos, int segundos)
    {
        int segundosTranscurridos1980;

        segundosTranscurridos1980 = ((diasTranscurridos1980(dia, mes, anio) - 1) * 24 * 3600) + horaASegundos(hora, minutos, segundos);

        return segundosTranscurridos1980;
    }



}
