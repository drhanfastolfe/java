package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i = 0;

        while (i < 11)
        {
            i++;
            if (!((i % 2) == 0))
            {
                System.out.println(i);
            }
        }
    }
}
