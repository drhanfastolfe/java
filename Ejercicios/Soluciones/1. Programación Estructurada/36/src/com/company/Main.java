package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, n;
        n = 1;

        for (i = 1; n <= 10; i++)
        {
            if (!(i % 2 == 0 && i % 3 == 0))
            {
                System.out.println(i);
                n++;
            }
        }
    }
}
