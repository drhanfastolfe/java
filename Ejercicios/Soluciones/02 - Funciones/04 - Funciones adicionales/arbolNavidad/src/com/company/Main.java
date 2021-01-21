package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int anchoMaximo;

        System.out.println("Introduce el valor del ancho del arbol de navidad. " +
                "Anchura mínima es 5.");
        anchoMaximo = sc.nextInt();

        while (anchoMaximo<5)
        {
            System.out.println("ERROR: anchura mínima es 5. Vuelve a introducir el valor");
            anchoMaximo = sc.nextInt();
        }

        arbolNavidad(anchoMaximo);
    }

    public static void trapecioAsteriscos(int baseArriba, int baseAbajo)
    {
        int i, j;

        for (i=baseArriba; i<=baseAbajo; i=i+2)
        {
            for (j=1; j<=(baseAbajo-i)/2; j++)
            {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void arbolNavidad(int anchoMaximo)
    {
        int i, j, k;

        if (anchoMaximo % 2 ==0)
        {
            trapecioAsteriscos(2,anchoMaximo);
        }
        else
        {
            trapecioAsteriscos(1,anchoMaximo);
        }

        if (anchoMaximo<=5)
        {
            trapecioAsteriscos(anchoMaximo-2, anchoMaximo);
            trapecioAsteriscos(anchoMaximo-2, anchoMaximo);
        }
        else
        {
            trapecioAsteriscos(anchoMaximo-4, anchoMaximo);
            trapecioAsteriscos(anchoMaximo-4, anchoMaximo);
        }

        if (anchoMaximo==5)
        {
            for (i=1; i<=3; i++)
            {
                System.out.println("  *");
            }
        }
        else
        {
            if (anchoMaximo==6)
            {
                for (i=1; i<=3; i++)
                {
                    System.out.println("  **");
                }
            }
            else
            {
                if (anchoMaximo % 2==0)
                {
                    for (i=1; i<=3; i++)
                    {
                        for (j = 1; j <= (anchoMaximo - 4) / 2; j++)
                        {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= 4; j++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                else
                {
                    for (i=1; i<=3; i++)
                    {
                        for (j = 1; j <= (anchoMaximo - 3) / 2; j++)
                        {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= 3; j++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
