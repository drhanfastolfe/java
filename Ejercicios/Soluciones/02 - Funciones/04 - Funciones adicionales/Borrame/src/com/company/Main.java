package com.company;

public class Main
{

    public static void main(String[] args)
    {
        trapecioAsteriscos(5,10);
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
}
