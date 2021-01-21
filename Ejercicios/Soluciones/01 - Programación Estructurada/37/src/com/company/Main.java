package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String opcion;
        System.out.println("Elige una opción: a, b o c.");
        opcion = sc.next();

        while (!(opcion.equals("a") || opcion.equals("b") || opcion.equals("c")))
        {
            System.out.println("ERROR: opción iválida. Vuelve a elegir una opción" +
                    "a, b o c");
            opcion = sc.next();
        }

        for(i = 1; i <= 100; i++)
        {
            if (opcion.equals("a") && i % 11 == 0)
            {
                System.out.println(i);
            }
            else
            {
                if (opcion.equals("b") && i % 17 == 0)
                {
                    System.out.println(i);
                }
                else
                {
                    if (opcion.equals("c") && i % 23 == 0)
                    {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
