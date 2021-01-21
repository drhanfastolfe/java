package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int exponente;
        System.out.println("Introduce un exponente para la potencia de 2.");
        exponente = sc.nextInt();

        System.out.println("Dos elevado a " + exponente + " es " + potencia2(exponente));

    }

    public static int potencia2(int exponente)
    {
        int i, potencia;
        potencia= 2;
        for (i = 2; i <= exponente; i++)
        {
            potencia = potencia * 2;
        }
        if (exponente == 0)
        {
            potencia = 1;
        }
        if (exponente < 0)
        {
            potencia = -1;
        }

        return potencia;
    }
}
