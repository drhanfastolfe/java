package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x, y, z;

        System.out.println("Díme un número X.");
        x = sc.nextDouble();
        System.out.println("Díme un número Y.");
        y = sc.nextDouble();
        System.out.println("Díme un número Z.");
        z = sc.nextDouble();

        if (x < y)
        {
            if (y < z)
            {
                System.out.println(x + " < " + y + " < " + z);
            }
        }
        else
        {
            System.out.println("Los números X,Y y Z no están oredenados de menor a mayor.");
        }
    }
}
