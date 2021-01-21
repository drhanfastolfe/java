package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int naprobados, nsuspensos, nnotas;
        double nota;
        naprobados = 0;
        nsuspensos = 0;
        nnotas = 0;

        System.out.println("Introduce una nota.");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 10)
        {
            System.out.println("Vuelve a introducir la nota correctamente.");
            nota = sc.nextDouble();
        }

        while (nnotas < 30)
        {
            ++nnotas;
            if (nota < 5)
            {
                ++nsuspensos;
            }
            else
            {
                ++naprobados;
            }
            if (nnotas < 30)
            {
                System.out.println("Introduce otra nota.");
                nota = sc.nextDouble();
            }
        }
        System.out.println("El número total de suspensos es: " + nsuspensos);
        System.out.println("El número total de aprobados es: " + naprobados);
    }
}
