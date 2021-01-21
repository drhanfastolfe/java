package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i, max;
        i = 1;
        System.out.println("Introduce un número.");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número.");
        n2 = sc.nextInt();
        max = i;
        for (i = 1; i <= n1*n2; i++)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                if (i > max)
                {
                    max = i;
                }
            }
        }
        System.out.println("El máximo común divisor de " + n1 + " y " + n2 + " es: " + max);
    }
}