package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, mayor,i;
        mayor = -999999999;
        i = 0;
        while (i < 10)
        {
            System.out.println("Introduce un número.");
            n = sc.nextInt();
            if (n > mayor)
            {
                mayor = n;
            }
            i++;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
