package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String decide;

        System.out.println("¿Pares o impares?");
        decide = sc.next();

        while (!((decide.equals("pares")) || (decide.equals("impares"))))
        {
            System.out.println("Vuelve a introducir 'pares' o 'impares'.");
            decide = sc.next();
        }

        if (decide.equals("pares"))
        {
            while (i < 10)
            {
                i++;
                if ((i % 2) == 0)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            while (i < 10)
            {
                i++;
                if (!((i % 2) == 0))
                {
                    System.out.println(i);
                }
            }
        }
    }
}