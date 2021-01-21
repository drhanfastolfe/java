package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(parOimpar(5));;
    }
    public static boolean parOimpar(int n)
    {
        boolean resultado;
        if (n % 2 == 0)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }
}
