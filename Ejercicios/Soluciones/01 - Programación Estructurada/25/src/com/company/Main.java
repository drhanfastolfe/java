package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, n;
        n = 1;

        for (i = 0; i < 100; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
                if (n == 10)
                {
                    break;
                }
                n++;
            }
        }
    }
}
