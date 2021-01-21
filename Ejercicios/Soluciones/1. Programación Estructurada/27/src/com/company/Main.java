package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, i, soluciones;

        System.out.println("Introduce un número.");
        numero = sc.nextInt();

        for (i = 1; i <= 10; i++)
        {
            soluciones = i * numero;
            System.out.println(numero + " x " + i + " = " + soluciones);
        }
    }
}
