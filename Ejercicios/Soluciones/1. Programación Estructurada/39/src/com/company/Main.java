package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i;

        System.out.println("Introduce un número.");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número.");
        n2 = sc.nextInt();

        for (i = 1; i <= n1*n2; i++)
        {
            if (i % n1 == 0 && i % n2 == 0)
            {
                System.out.println("El mcm de " + n1 + " y " + n2 + " es: " + i);
                i = n1*n2;
            }
        }
    }
}
