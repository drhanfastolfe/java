package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Introduce un valor para el rombo.");
        valor = sc.nextInt();

        rombo(valor);
    }

    public static void rombo(int valor)
    {
        int i, j;

        for (i=valor; i>1; i--)
        {
            System.out.print("   ");
        }
        System.out.println("  *");

        for (i=valor; i>=1; i--)
        {
            for (j=1; j<i; j++)
            {
                System.out.print("   ");
            }
            for (j=valor; j>=i;j--)
            {
                System.out.print("* * * ");
            }
            System.out.println();
        }
        for (i=valor-1; i>=1; i--)
        {
            for (j=valor; j>i; j--)
            {
                System.out.print("   ");
            }
            for (j=1; j<=i; j++)
            {
                System.out.print("* * * ");
            }
            System.out.println();
        }
        for (i=valor; i>1; i--)
        {
            System.out.print("   ");
        }
        System.out.println("  *");
    }
}
