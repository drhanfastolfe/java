package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, i;

        System.out.println("Introduce un número.");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número.");
        num2 = sc.nextInt();

        while (num1 == num2)
        {
            System.out.println("Los números no pueden ser iguales.");
            System.out.println("Introduce un número.");
            num1 = sc.nextInt();
            System.out.println("Introduce otro número.");
            num2 = sc.nextInt();
        }

        if (num1 < num2)
        {
            for (i = num1 + 1; i < num2; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for (i = num1 -1; i > num2; i--)
            {
                System.out.println(i);
            }
        }
    }
}
