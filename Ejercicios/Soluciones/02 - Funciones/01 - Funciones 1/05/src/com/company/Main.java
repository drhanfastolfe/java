package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n;

        System.out.println("Introduce un número real.");
        n = sc.nextDouble();

        System.out.println(signo(n));
    }

    public static int signo(double n)
    {
        int signo;
        if (n > 0)
        {
            signo = 1;
        }
        else
        {
            if (n < 0)
            {
                signo = - 1;
            }
            else
            {
                signo = 0;
            }
        }
        return signo;
    }
}
