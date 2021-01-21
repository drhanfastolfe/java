package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, z;

        System.out.println("Díme un número X.");
        x = sc.nextInt();
        System.out.println("Díme un número Y.");
        y = sc.nextInt();
        System.out.println("Díme un número Z.");
        z = sc.nextInt();

        if (y == 1 + x)
        {
            if (z == 1 + y)
            {
                System.out.println("Los número X, Y y Z son consecutivos.");
            }
        }
        else
        {
            System.out.println("Los número X, Y y Z no son consecutivos.");
        }
    }
}
