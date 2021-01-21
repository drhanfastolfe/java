package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Introduce un número.");
        n = sc.nextInt();

        while (n <= 0)
        {
            System.out.println("ERROR: introduce un número entero mayor que cero.");
            n = sc.nextInt();
        }

        for (i = 1; i <= n; i++)
        {
            if ((n % i == 0) && (1 < i && i < n) || n == 1)
            {
                System.out.println("No es un número primo.");
                n = i;
            }
            if (i == n -1)
            {
                System.out.println("Es un número primo.");
            }
        }
    }
}
