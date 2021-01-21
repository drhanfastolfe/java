package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Introduce un número entero a.");
        a = sc.nextInt();

        System.out.println("Introduce un número entero b.");
        b = sc.nextInt();

        System.out.println("Introduce un número entero c.");
        c = sc.nextInt();

        System.out.println("El máximo es " + maximo(a, b, c));
        System.out.println("El medio es " + medio(a, b, c));
        System.out.println("El menor es " + minimo(a, b, c));
    }

    public static int maximo(int a, int b, int c)
    {
        int maximo;

        maximo = a;

        if (a < b)
        {
            maximo = b;

            if (b < c)
            {
                maximo = c;
            }
        }
        else
        {
            if (a < c)
            {
                maximo = c;
            }
        }

        return maximo;
    }

    public static int minimo(int a, int b, int c)
    {
        int minimo;

        minimo = a;

        if (a > b)
        {
            minimo = b;

            if (b > c)
            {
                minimo = c;
            }
        }
        else
        {
            if (a > c)
            {
                minimo = c;
            }
        }

        return minimo;
    }

    public static int medio(int a, int b, int c)
    {
        int medio;


        if ((a > b) && (b > c))
        {
            medio = b;
        }
        else
        {
            if ((a > c) && (c > b))
            {
                medio = c;
            }
            else
            {
                if ((b > a) && (a > c))
                {
                    medio = a;
                }
                else
                {
                    if (b > c)
                    {
                        medio = c;
                    }
                    else
                    {
                        if (a > b)
                        {
                            medio = a;
                        }
                        else
                        {
                            medio = b;
                        }
                    }
                }
            }
        }

        return medio;
    }
}