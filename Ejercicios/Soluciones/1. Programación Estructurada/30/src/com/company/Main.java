package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int  suma, i;
        suma = 0;

        for (i = 1; i < 1001; i++)
        {
            if (i % 2 == 0)
            {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
