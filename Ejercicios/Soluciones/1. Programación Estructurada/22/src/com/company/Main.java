package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, i, factorial;

        System.out.println("Introduce un número.");
        numero = sc.nextInt();
        i = numero;
        factorial = 1;

        while (i > 0)
        {
            factorial = factorial * i;
            i--;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
