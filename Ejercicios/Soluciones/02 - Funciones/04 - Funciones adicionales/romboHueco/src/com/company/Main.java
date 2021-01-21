package com.company;

public class Main
{

    public static void main(String[] args)
    {
        romboHueco(7);
    }

    public static void romboHueco(int n)
    {
        int i, j;
        if (n % 2!= 0 && n>=3)
        {
            /*for (i=n;i>=1;i=i-2)
            {
                for (j=1;j<=n;j++)
                {
                    if (j==i/2.0 +0.5)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }*/
            for (i=n/2 + 1/2; i<=n/2 +1/2;i--)
            {
                if (i==n/2 +1/2)
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.println(" ");
                }
            }
        }
        else
        {
            System.out.println("ERROR: n tiene que ser impar y mayor o igual que 3.");
        }
    }
}
