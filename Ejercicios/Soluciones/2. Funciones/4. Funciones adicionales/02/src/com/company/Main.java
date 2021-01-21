package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double centigrados, fahrenheit;

        System.out.println("Introduce los grados centígrados.");
        centigrados = sc.nextDouble();
        System.out.println("Son " + centigradosAFahrenheit(centigrados) + " grados fahrenheit.");

        System.out.println("Introduce los grados fahrenheit.");
        fahrenheit = sc.nextDouble();
        System.out.println("Son " + fahrenheitACentigrados(fahrenheit) + " grados centígrados.");
    }

    public static double centigradosAFahrenheit(double centigrados)
    {
        double fahrenheit;

        fahrenheit = (1.8 * centigrados) + 32;

        return fahrenheit;
    }

    public static double fahrenheitACentigrados(double fahrenheit)
    {
        double centigrados;

        centigrados = (fahrenheit -32) / 1.8;

        return centigrados;
    }
}
