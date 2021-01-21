package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, mayor;
        mayor = -999999999;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Introduce un número.");
            n = sc.nextInt();
            if (n > mayor)
            {
                mayor = n;
            }
        }
        System.out.println("El número mayor es :" + mayor);
    }
}
