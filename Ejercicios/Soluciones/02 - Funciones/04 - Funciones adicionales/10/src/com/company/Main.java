package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        escribeSerieNumeros3();
    }

    public static void escribeSerieNumeros3()
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, i;

        System.out.println("Introduce un número entre 1 y 100.");
        num1 = sc.nextInt();

        while (num1<1 || num1>100)
        {
            System.out.println("ERROR: el número tiene que estar entre 1 y 100. Vuelve a " +
                    "introducirlo.");
            num1 = sc.nextInt();
        }

        System.out.println("Introduce otro número entre 1 y 100 pero mayor que el " +
                "primero.");
        num2 = sc.nextInt();

        while ((num2<1 || num2>100) || !(num2>num1))
        {
            System.out.println("ERROR: el número tiene que estar entre 1 y 100 y ser " +
                    "mayor que el primero. Vuelve a introducirlo.");
            num2 = sc.nextInt();
        }

        System.out.println("Introduce otro número entre 1 y 100 pero que sea mayor que " +
                "el primero y menor que el segundo.");
        num3 = sc.nextInt();

        while ((num3<1 || num3>100) || !(num3>num1 && num3<num2))
        {
            System.out.println("ERROR: el número tiene que estar entre 1 y 100 y ser " +
                    "mayor que el primero y menor que el segundo. Vuelve a introducirlo.");
            num3 = sc.nextInt();
        }

        for (i=num1; i<=num3; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (i=num3; i<=num2; i++)
        {
            System.out.print(i + " ");
        }

    }
}
