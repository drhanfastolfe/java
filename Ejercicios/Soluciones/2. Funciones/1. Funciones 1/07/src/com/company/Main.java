package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.println("Introduce un número a.");
        a = sc.nextDouble();
        System.out.println("Introduce un número b.");
        b = sc.nextDouble();

        while (a == b)
        {
            System.out.println("ERROR: los númeror no pueden ser iguales.");
            System.out.println("Introduce un número a.");
            a = sc.nextDouble();
            System.out.println("Introduce un número b.");
            b = sc.nextDouble();
        }
        System.out.println("El número menor es: " + min(a, b));
    }

    public static double min(double a, double b)
    {
        double menor;

        if (a > b)
        {
            menor = b;
        }
        else
        {
            menor = a;
        }
        return menor;
    }
}