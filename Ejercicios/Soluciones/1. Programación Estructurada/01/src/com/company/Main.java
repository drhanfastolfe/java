package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, z;

        System.out.println("Díme un número.");
        x = sc.nextInt();
        System.out.println("Díme otro número.");
        y = sc.nextInt();

        if (x > y)
        {
            z = x - y;
            System.out.println("El resultado es: " + z);
        }
        else
        {
            if (y > x)
            {
                z = y - x;
                System.out.println("El resultado es: " + z);
            }
            else
            {
                System.out.println("Los números son iguales.");
            }
        }
    }
}
