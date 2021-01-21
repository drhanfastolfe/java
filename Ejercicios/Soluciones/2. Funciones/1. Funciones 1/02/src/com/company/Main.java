package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(bisiesto(2100));
    }
    public static boolean bisiesto(int año)
    {
        boolean resultado;
        if (año % 4 == 0 && (!(año % 100 == 0) || (año % 400 == 0)))
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
