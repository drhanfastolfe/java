package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Díme un número entero de menos de 6 cifras.");
        num = sc.nextInt();

        // n = Math.abs (n)

        if (num == 0)
        {
            System.out.println("El número tiene 0 cifras.");
        }
        else
        {
            if (num > -10 && num < 10)
            {
                System.out.println("El número tiene 1 cifra.");
            }
            else
            {
                if (num > -100 && num < 100)
                {
                    System.out.println("El número tiene 2 cifras.");
                }
                else
                {
                    if (num > -1000 && num < 1000)
                    {
                        System.out.println("El número tiene 3 cifras");
                    }
                    else
                    {
                        if (num > -10000 && num < 10000)
                        {
                            System.out.println("El número tiene 4 cifras");
                        }
                        else
                        {
                            if (num > -100000 && num < 100000)
                            {
                                System.out.println("El número tiene 5 cifras");
                            }
                            else
                            {
                                System.out.println("El número tiene mas de 5 cifras.");
                            }
                        }
                    }
                }
            }
        }
    }
}
