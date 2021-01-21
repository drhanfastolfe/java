package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un número.");
        n = sc.nextInt();

        System.out.println(primo(n));
    }

    public static boolean primo(int n)
    {
        int i;
        boolean resultado;
        resultado = false;
        for (i = 1; i < n; i++)
        {
            if (n % i == 0 && i != 1)
            {
                resultado = false;
                i = n;
            }
            else
            {
                resultado = true;
            }
        }
        return resultado;
    }
}
