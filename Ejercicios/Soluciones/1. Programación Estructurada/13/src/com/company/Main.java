package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero, i, multiplos;
        i = 1;

        System.out.println("Díme un número.");
        numero = sc.nextInt();

        while ((i < 11) && (!(numero == numero * 10)))
        {
            multiplos = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplos);
            i++;
        }
    }
}
