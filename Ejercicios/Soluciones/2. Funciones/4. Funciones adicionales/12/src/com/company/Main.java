package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int altura, longuitud;

        System.out.println("Introduce la altura del romboide.");
        altura = sc.nextInt();

        System.out.println("Introduce la longuitud del romboide.");
        longuitud = sc.nextInt();

        romboide(altura,longuitud);
    }

    public static void romboide(int altura, int longuitud)
    {
        int i, j;

        for (i=altura; i>=1; i--)
        {
            for (j=1; j<=longuitud + i -1; j++)
            {
                if (j<i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
