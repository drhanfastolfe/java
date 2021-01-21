package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pulgadas, centimetros;

        System.out.println("Introduce el valor de pulgadas.");
        pulgadas = sc.nextDouble();
        System.out.println("Son " + pulgadasACentimetros(pulgadas) + " cm");

        System.out.println("Introduce el valor de centrímetros.");
        centimetros = sc.nextDouble();
        System.out.println("Son " + centimetrosAPulgadas(centimetros) + " pulgadas");

    }
    public static double pulgadasACentimetros(double pulgadas)
    {
        double centimetros;

        centimetros = pulgadas * 2.54;

        return centimetros;
    }
    public static double centimetrosAPulgadas(double centimetros)
    {
        double pulgadas;


        pulgadas = centimetros * 0.393701;

        return pulgadas;
    }
}
