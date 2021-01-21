package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pimp;
        int i;
        System.out.println("Quieres números pares o impares.");
        pimp = sc.nextLine();

        while (!((pimp.equals("pares")) || (pimp.equals("impares"))))
        {
            System.out.println("Vuelve a introducir si quieres 'pares' o 'impares'.");
            pimp = sc.nextLine();
        }

        if (pimp.equals("pares"))
        {
            System.out.println("Los números pares del 1 al 10 son:");
            for (i = 0; i < 11; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.println(i);
                }
            }

        }
        else
        {
            System.out.println("Los números impares del 1 al 10 son:");
            for (i = 0; i < 11; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
