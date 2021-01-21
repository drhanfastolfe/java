package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n, intento, i;
        n = r.nextInt(100) + 1;

        System.out.println("Intenta adivinar el numero que tengo en mente. Del 1 al 100.");
        intento = sc.nextInt();

        while (intento < 1 || intento > 100)
        {
            System.out.println("ERROR: el número es del 1 al 100. Vuelve a intentarlo.");
            intento = sc.nextInt();
        }
        while (intento != n)
        {
            if (intento < n)
            {
                System.out.println("Mi número es mayor.");
                intento = sc.nextInt();
            }
            if (intento > n)
            {
                System.out.println("Mi número es menor.");
                intento = sc.nextInt();
            }
        }
        if (intento == n)
        {
            System.out.println("¡Has acertado!");
        }
    }
}
