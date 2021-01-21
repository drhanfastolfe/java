package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int n, i;
        i = 2;
        n = 2;

        while (n < 1001)
        {
            i = 2;
            while (i <= n)
            {
                if ((n % i == 0) && (1 < i && i < n))
                {
                    i = n + 1;
                }
                if (i == n)
                {
                    System.out.println(n);
                }
                i++;
            }
            n++;
        }
    }
}
