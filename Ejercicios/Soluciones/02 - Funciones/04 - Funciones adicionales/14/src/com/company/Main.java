package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Introduce el día.");
        dia = sc.nextInt();
        System.out.println("Introduce el mes.");
        mes = sc.nextInt();
        System.out.println("Introduce el año.");
        anio = sc.nextInt();

        escribeFechaBonita(dia,mes,anio);
    }

    public static String mesEnTexto(int mes)
    {
        String mesEnTexto;
        mesEnTexto="valorDefecto";

        switch (mes)
        {
            case 1: mesEnTexto="Enero"; break;
            case 2: mesEnTexto="Febrero"; break;
            case 3: mesEnTexto="Marzo"; break;
            case 4: mesEnTexto="Abril"; break;
            case 5: mesEnTexto="Mayo"; break;
            case 6: mesEnTexto="Junio"; break;
            case 7: mesEnTexto="Julio"; break;
            case 8: mesEnTexto="Agosto"; break;
            case 9: mesEnTexto="Septiembre"; break;
            case 10: mesEnTexto="Octubre"; break;
            case 11: mesEnTexto="Noviembre"; break;
            case 12: mesEnTexto="Diciembre"; break;
        }
        return mesEnTexto;
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

    public static void escribeFechaBonita(int dia, int mes, int anio)
    {
        if (dia > diasMes2(mes, anio) || dia < 1 || mes < 1 || mes > 12)
        {
            System.out.println("Fecha no válida.");
        }
        else
        {
            System.out.print(dia + " de " + mesEnTexto(mes) + " de " + anio);
        }
    }
}
