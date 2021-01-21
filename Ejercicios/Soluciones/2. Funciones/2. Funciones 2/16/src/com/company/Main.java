package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce un número.");
        a = sc.nextInt();
        System.out.println("Introduce un exponente.");
        b = sc.nextInt();

        System.out.println(elevado(a, b));

    }

    public static double elevado(int a, int b)
    {
        double solucion, i;

        if (b > 0)
        {
            solucion = a;
            for (i = b; i > 1; i--)
            {
                solucion = solucion * a;
            }
        }
        else
        {
            if (b < 0)
            {
                solucion = 1.0 / elevado(a, -b);
            }
            else
            {
                solucion = 1;
            }
        }

        return solucion;

    }
}
