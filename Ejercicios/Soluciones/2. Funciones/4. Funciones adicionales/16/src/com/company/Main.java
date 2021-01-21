package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número entero.");
        num = sc.nextInt();

        descomponerFactoresPrimos(num);
    }

    public static boolean primo(int num)
    {
        boolean resultado;
        int i;

        resultado = true;

        for (i=2; i<=num/2; i++)
        {
            if (num % i == 0)
            {
                resultado = false;
                i = num;
            }
            else
            {
                if (i==num/2)
                {
                    resultado = true;
                }
            }
        }

        return resultado;


    }

    public static void descomponerFactoresPrimos(int num)
    {
        int i;

        System.out.print(num + " = ");
        if (num==1)
        {
            System.out.print("1");
        }
        if (num == 0)
        {
            System.out.print("0");
        }

        for (i=2; i<=num; i++)
        {
            if (primo(i))
            {
                if (num % i == 0)
                {
                    System.out.print(i);
                    if (!(primo(num)))
                    {
                        System.out.print(" x ");
                    }
                    num = num / i;
                    i=1;
                }
            }
        }
    }

    public static void descomponerFactoresPrimos2(int num)
    {
        int resto, factor;

        resto = num;
        factor = 2;

        while (resto > 1)
        {
            while (resto % factor == 0)
            {
                resto= resto / factor;
                System.out.println(factor);
            }

            factor++;
        }

    }
}