package com.company;

public class Main
{

    public static void main(String[] args)
    {
        tablaMultiplicar(-5);
    }
    public static void tablaMultiplicar(int n)
    {
        int i, resultado;
        for (i = 1; i <= 10; i++)
        {
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
