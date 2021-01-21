package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i;
        System.out.println("Introduce un número A.");
        a = sc.nextInt();
        System.out.println("Introduce un número B.");
        b = sc.nextInt();

        while (a == b)
        {
            System.out.println("Los números a y b no pueden ser iguales.");
            System.out.println("Introduce un número A.");
            a = sc.nextInt();
            System.out.println("Introduce un número B.");
            b = sc.nextInt();
        }

        if (a > b)
        {
            for (i = b + 1; i < a; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println("Los números impares entre A y B son:");
                    System.out.println(i);
                }
            }
        }
        else
        {
            for (i = a + 1; i < b; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println("Los números impares entre A y B son:");
                    System.out.println(i);
                }
            }
        }
    }
}
