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
        System.out.println("Díme otro número que sea mayor que el anterior.");
        n2 = sc.nextInt();

        while (!(n2 > n1 || n2 == n1))
        {
            System.out.println("El segundo número tiene que ser mayor que el primero.");
            n2 = sc.nextInt();
        }

        i = n1 - 1;

        while (i < n2)
        {
            i++;
            System.out.println(i);
        }


    }
}
