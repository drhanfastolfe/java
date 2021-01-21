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

        while (a == b)
        {
            System.out.println("ERROR: los número a y b no pueden ser iguales.");
            System.out.println("Introduce un número a.");
            a = sc.nextInt();
            System.out.println("Introduce un número b.");
            b = sc.nextInt();
        }

        imprimeSerie(a, b);
    }

    public static void imprimeSerie(int a, int b)
    {
        int i;
        if (a < b)
        {
            for (i = a; i <= b; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for (i = a; i >= b;i--)
            {
                System.out.println(i);
            }
        }
    }
}
