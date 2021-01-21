package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i;
        System.out.println("Díme un número.");
        n1 = sc.nextInt();
        System.out.println("Díme otro número.");
        n2 = sc.nextInt();

        while (n1 == n2)
        {
            System.out.println("Los números no pueden ser iguales.");
            System.out.println("Díme un número.");
            n1 = sc.nextInt();
            System.out.println("Díme otro número.");
            n2 = sc.nextInt();
        }

        if (n1 < n2)
        {
            i = n1;
            while (i < (n2 - 1))
            {
                i++;
                System.out.println(i);
            }
        }
        else
        {
            i = n1;
            while (i > (n2 +1))
            {
                i--;
                System.out.println(i);
            }

        }
    }
}
