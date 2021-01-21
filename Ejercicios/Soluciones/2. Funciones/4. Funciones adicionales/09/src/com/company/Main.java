package com.company;

public class Main
{

    public static void main(String[] args)
    {
        bisiestosXXI();
    }

    public static void bisiestosXXI()
    {
        int i;

        for (i=2001; i<=2101; i++)
        {
            if (i % 4==0 && i % 100!=0)
            {
                System.out.println(i);
            }
        }
    }
}
