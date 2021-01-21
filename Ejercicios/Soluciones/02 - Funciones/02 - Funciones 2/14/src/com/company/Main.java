package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int numero = leeNatural();

        System.out.println(numero);
    }

    public static int leeNatural()
    {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número.");
        numero = sc.nextInt();

        while (numero <= 0)
        {
            System.out.println("Introduce un número.");
            numero = sc.nextInt();
        }

        return numero;
    }
}
