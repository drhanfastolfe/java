package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, numero, factorial;
        System.out.println("Introduce un número.");
        numero = sc.nextInt();
        factorial = 1;

        for(i = numero ; i > 0; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
