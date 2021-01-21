package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(primosRelativos(13, 5));

    }

    public static boolean primosRelativos(int a, int b)
    {
        boolean resultado;
        int i, menor;
        resultado = false;
        menor = a;
        if (a > b)
        {
            menor = b;
        }


        for (i = 2; i <= menor; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                resultado = false;
                i = menor + 1;
            }
            if (i == menor)
            {
                resultado = true;
            }
        }

        return resultado;
    }
}
