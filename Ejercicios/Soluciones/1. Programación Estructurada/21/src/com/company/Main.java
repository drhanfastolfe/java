package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n, mayor, menor, i, suma, media;
        mayor = -999999999;
        menor = 999999999;
        i = 0;
        suma = 0;
        while (i < 10)
        {
            System.out.println("Introduce un número.");
            n = sc.nextDouble();
            if (n > mayor)
            {
                mayor = n;
            }
            if (n < menor)
            {
                menor = n;
            }
            suma = n + suma;
            i++;
        }
        media = suma / 10;
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La media aritmética es: " + media);
    }
}
