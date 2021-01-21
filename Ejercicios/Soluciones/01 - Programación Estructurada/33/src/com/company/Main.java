package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double mayor, menor, numero, suma, media;
        int i;
        suma = 0;
        System.out.println("Introduce un número.");
        numero = sc.nextDouble();
        mayor = numero;
        menor = numero;

        for (i = 1; i < 11; i++)
        {
            if (numero > mayor)
            {
                mayor = numero;
            }
            if (numero < menor)
            {
                menor = numero;
            }
            suma = suma + numero;
            if (i == 10)
            {
                break;
            }
            System.out.println("Introduce otro número.");
            numero = sc.nextDouble();
        }
        media = suma / 3;
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La media es: " + media);
    }
}
