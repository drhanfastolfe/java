package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce un número a.");
        a = sc.nextInt();
        System.out.println("Introduce un número b.");
        b = sc.nextInt();

        System.out.println("El mcm de " + a + " y " + b + " es: " + mcm(a, b));
    }

    public static int mcm(int a, int b)
    {
        int mayor, i, min, multiplo;
        mayor = b;

        if (a > b)
        {
            mayor = a;
        }
        multiplo = mayor;
        i=2;
        while (multiplo % a != 0 || multiplo % b != 0)
        {
            multiplo = mayor * i;
            i++;
        }
        min = multiplo;
        return min;
    }
}
