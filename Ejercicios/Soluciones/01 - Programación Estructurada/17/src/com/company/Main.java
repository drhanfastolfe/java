package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i, suma;
        suma = 0;
        i = 1;

        while (i < 1000)
        {
            ++i;
            if (i % 2 == 0)
            {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
