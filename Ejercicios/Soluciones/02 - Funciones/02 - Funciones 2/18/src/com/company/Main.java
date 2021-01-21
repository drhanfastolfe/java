package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double megapixels;

        System.out.println("Introduce el número de Megapixels de la cámara.");
        megapixels = sc.nextDouble();

        resolucionCamara(megapixels);
    }
    public static void resolucionCamara(double megapixels)
    {
        double pixels, x, y;

        pixels = megapixels * 1000000.0;

        x = Math.sqrt(pixels * (16.0 / 9.0));
        y = Math.sqrt(pixels * (9.0 / 16.0));
        x = Math.round(x);
        y = Math.round(y);

        System.out.println("La resolución e la cámara es " + x + " x " + y);
    }
}
