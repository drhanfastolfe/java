package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Introduce la nota del alumno.");
        nota = sc.nextDouble();

        while (nota < 0 || 10 < nota)
        {
            System.out.println("ERROR: nota inválida.");
            System.out.println("Vuelve a introducir la nota.");
            nota = sc.nextDouble();
        }
        if (0 <= nota && nota < 5)
        {
            System.out.println("Suspenso.");
        }
        else
        {
            if (5 <= nota && nota < 6)
            {
                System.out.println("Sufieciente.");
            }
            else
            {
                if (6 <= nota && nota < 7)
                {
                    System.out.println("Bien.");
                }
                else
                {
                    if (7 <= nota && nota < 9)
                    {
                        System.out.println("Notable.");
                    }
                    else
                    {
                        System.out.println("Sobresaliente.");
                    }
                }
            }
        }
    }
}
