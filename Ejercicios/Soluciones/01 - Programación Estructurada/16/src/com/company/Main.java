package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i;
        System.out.println("Díme un número A.");
        a = sc.nextInt();
        System.out.println("Díme otro número B.");
        b = sc.nextInt();

        while (a == b)
        {
            System.out.println("Los números no pueden ser iguales. Díme un número A.");
            a = sc.nextInt();
            System.out.println("Díme otro número B.");
            b = sc.nextInt();
        }

        if (a > b)
        {
            i = b;
            while (i < a)
            {
                i++;
                if (!(i % 2 == 0))
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            i = a;
            while (i < b)
            {
                i++;
                if (!(i % 2 == 0))
                {
                    System.out.println(i);
                }
            }
        }
    }
}
