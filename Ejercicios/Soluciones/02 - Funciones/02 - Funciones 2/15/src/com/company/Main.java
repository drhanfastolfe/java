package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double numero, a, b;

        System.out.println("Introduce un el parámetro a.");
        a = sc.nextDouble();
        System.out.println("Introduce un el parámetro b.");
        b = sc.nextDouble();

        numero = leeNumero(a, b);

        System.out.println(numero);

    }
    public static double leeNumero(double a, double b)
    {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("Introduce un número.");
        numero = sc.nextDouble();

        if (a > b)
        {
            while (numero < b || numero > a)
            {
                System.out.println("Vuelve a introducir un número.");
                numero = sc.nextDouble();
            }
        }
        else
        {
            while (numero < a || numero > b)
            {
                System.out.println("Vuelve a introducir un número.");
                numero = sc.nextDouble();
            }

        }

        return numero;
    }
}
