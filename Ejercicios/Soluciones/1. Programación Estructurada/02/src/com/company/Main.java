package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int año, resto;

        System.out.println("Díme un año.");
        año = sc.nextInt();

        resto = año % 4;

        if (resto == 0)
        {
            System.out.println("El año es bisiesto.");
        }
        else
        {
            System.out.println("El año no es bisiesto.");
        }
    }
}
