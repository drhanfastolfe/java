package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;
        int alumno, nnsuspensos, naprobados;
        nnsuspensos = 0;
        naprobados = 0;
        System.out.println("Introduce una nota.");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 10)
        {
            System.out.println("La nota tiene que ser del 0 al 10.");
            System.out.println("Introduce una nota.");
            nota = sc.nextDouble();
        }

        for (alumno = 1; alumno < 31; alumno++)
        {
            if (nota < 5)
            {
                nnsuspensos++;
            }
            else
            {
                naprobados++;
            }
            if (alumno == 30)
            {
                break;
            }
            System.out.println("Introduce otra nota.");
            nota = sc.nextDouble();
        }
        System.out.println("El número de suspensos es: " + nnsuspensos);
        System.out.println("El número de aprobados es: " + naprobados);
    }
}
