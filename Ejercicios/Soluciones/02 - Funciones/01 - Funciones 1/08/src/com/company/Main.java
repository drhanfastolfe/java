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

        System.out.println("El mcd de " + a + " y " + b + " es: " + mcd(a, b));
    }

    public static int mcd(int a, int b)
    {
        int i, max;
        max = 1;
        i = b;

        if (a < b)
        {
            i = a;
        }

        while (i >= 1)
        {
            if (a % i == 0 && b % i == 0)
            {
                max = i;
                i = -1;
            }
            i--;
        }
        return max;
    }
}
