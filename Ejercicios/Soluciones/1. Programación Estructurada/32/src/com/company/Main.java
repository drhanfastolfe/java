package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        double numero, mayor;
        mayor = -999999999;
        System.out.println("Indtroduce un número.");
        numero = sc.nextDouble();

        for (i = 0; i < 10; i++)
        {
            if (numero > mayor)
            {
                mayor = numero;
            }
            if (i == 9)
            {
                break;
            }
            System.out.println("Introduce otro número.");
            numero = sc.nextDouble();
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
