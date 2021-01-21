package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base, altura;

        System.out.println("Introduce la base del triángulo.");
        base = sc.nextDouble();
        System.out.println("Introduce la altura del triángulo.");
        altura = sc.nextDouble();

        System.out.println(areaTriangulo(base, altura));
    }
    public static double areaTriangulo(double base, double altura)
    {
        double area;

        area = (base * altura) / 2.0;

        return area;
    }
}
