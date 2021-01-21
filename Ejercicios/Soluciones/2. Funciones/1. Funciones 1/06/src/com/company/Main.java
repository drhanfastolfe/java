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
        System.out.println("El número mayor es: " + max(a, b));
    }

    public static double max(double a, double b)
    {
        double mayor;

        if (a > b)
        {
         mayor = a;
        }
        else
        {
            mayor = b;
        }
        return mayor;
    }
}
