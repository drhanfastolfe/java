package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un número.");
        n = sc.nextInt();

        System.out.println("El factorial de " + n + " es " + factorial(n));

    }
    public static int factorial(int n)
    {
        int i, solucion;
        solucion = n;

        for (i = n - 1; i > 1; i--)
        {
            solucion = solucion * i;
        }

        return solucion;
    }
}
