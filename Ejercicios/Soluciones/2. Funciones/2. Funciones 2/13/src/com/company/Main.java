package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Introduce la nota del alumno.");
        nota = sc.nextDouble();
        while (nota < 0 || nota > 10)
        {
            System.out.println("ERROR: la nota mínima es 0 y la nota máxima es 10.");
            System.out.println("Introduce la nota del alumno.");
            nota = sc.nextDouble();
        }

        notaEnTexto(nota);

    }
    public static void notaEnTexto(double nota)
    {
        if (nota < 5)
        {
            System.out.println("Suspenso.");
        }
        else
        {
            if (nota < 6)
            {
                System.out.println("Suficiente.");
            }
            else
            {
                if (nota < 7)
                {
                    System.out.println("Bien.");
                }
                else
                {
                    if (nota < 9)
                    {
                        System.out.println("Notable.");
                    }
                    else
                    {
                        System.out.println("Sobresaliente.");
                    }
                }
            }
        }
    }
}
