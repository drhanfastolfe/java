package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(calculaNotaFinal());
    }

    public static double calculaNotaFinal()
    {
        Scanner sc = new Scanner(System.in);
        double ex1, ex2, ex3, ex4, ex5, ex6, ex7, media, notaFinal;
        int exSuspenso = 0;

        System.out.println("Introduce la nota del examen 1.");
        ex1 = sc.nextDouble();
        while (ex1<0 || ex1>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
            ex1 = sc.nextDouble();
        }

        if (ex1<5)
        {
            exSuspenso++;
        }

        System.out.println("Introduce la nota del examen 2.");
        ex2 = sc.nextDouble();
        while (ex2<0 || ex2>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
            ex2 = sc.nextDouble();
        }
        if (ex2<5)
        {
            exSuspenso++;
        }

        System.out.println("Introduce la nota del examen 3.");
        ex3 = sc.nextDouble();
        while (ex3<0 || ex3>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
           ex3 = sc.nextDouble();
        }
        if (ex3<5)
        {
            exSuspenso++;
        }

        System.out.println("Introduce la nota del examen 4.");
        ex4 = sc.nextDouble();
        while (ex4<0 || ex4>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
            ex4 = sc.nextDouble();
        }
        if (ex4<5)
        {
            exSuspenso++;
        }

        System.out.println("Introduce la nota del examen 5.");
        ex5 = sc.nextDouble();
        while (ex5<0 || ex5>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
            ex5 = sc.nextDouble();
        }
        if (ex5<5)
        {
            exSuspenso++;
        }

        System.out.println("Introduce la nota del examen 6.");
        ex6 = sc.nextDouble();
        while (ex6<0 || ex6>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
            ex6 = sc.nextDouble();
        }
        if (ex6<5)
        {
            exSuspenso++;
        }

        System.out.println("Introduce la nota del examen 7.");
        ex7 = sc.nextDouble();
        while (ex7<0 || ex7>10)
        {
            System.out.println("ERROR: la nota tiene que estar entre 0 y 10. Vuelve " +
                    "a introducirla.");
            ex7 = sc.nextDouble();
        }
        if (ex7<5)
        {
            exSuspenso++;
        }

        media = (ex1 + ex2 + ex3 + ex4 + ex5 + ex6 + ex7) / 7.0;
        media = media * 100.0;
        media = Math.floor(media) / 100.0;

        if (exSuspenso<2)
        {
            notaFinal = media;
        }
        else
        {
            if (media<4)
            {
                notaFinal = media;
            }
            else
            {
                notaFinal = 4;
            }
        }
        return notaFinal;
    }
}
