package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lineas;
        System.out.println("Introduce el número de líneas.");
        lineas = sc.nextInt();

        trianguloEstrellitas(lineas);
    }

    public static void trianguloEstrellitas(int lineas)
    {
        int i, j;

        if (lineas<3 || lineas>20)
        {
            System.out.println("ERROR.");
        }
        else
        {
            for (i=1; i<=lineas; i++)
            {
                for (j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
