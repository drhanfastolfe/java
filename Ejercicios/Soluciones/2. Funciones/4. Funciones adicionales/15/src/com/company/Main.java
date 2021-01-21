package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int min, max;

        System.out.println("Introduce un número entero.");
        min = sc.nextInt();

        System.out.println("Introduce otro número entero.");
        max = sc.nextInt();

        listaCuadradosPerfectos(min, max);
    }

    public static boolean cuadrdoPerfecto(int num)
    {
        boolean resultado;
        double raiz, raizFloor;

        raiz = Math.sqrt(num);
        raizFloor = Math.floor(raiz);

        if (raiz / raizFloor == 1)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }

        return resultado;
    }

    public static void listaCuadradosPerfectos(int min, int max)
    {
        int i;

        if (min < max)
        {
            for (i=min; i<=max; i++)
            {
                if (cuadrdoPerfecto(i))
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            for (i=max; i<=min; i++)
            {
                if (cuadrdoPerfecto(i))
                {
                    System.out.println(i);
                }
            }
        }
    }
}
