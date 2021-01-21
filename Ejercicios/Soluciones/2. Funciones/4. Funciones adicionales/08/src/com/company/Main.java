package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tamaño;

        System.out.println("Introduce un valor para el tamaño del cuadrado. Valores " +
                "permitidos: del 1 al 20.");
        tamaño = sc.nextInt();

        cuadradoEstrellitas(tamaño);
    }

    public static void cuadradoEstrellitas(int tamaño)
    {
        int i, j;

        if (tamaño<1 || tamaño>20)
        {
            System.out.println("ERROR");
        }
        else
        {
            for (i=1; i<=tamaño; i++)
            {
                if (i==1 || i==tamaño)
                {
                    for (j=1; j<=tamaño; j++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    for (j=1; j<=tamaño; j++)
                    {
                        if (j==1 || j==tamaño)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
