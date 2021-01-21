package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c, solucionmas, soluionmenos, discriminante;

        System.out.println("Díme el coeficiente a.");
        a = sc.nextDouble();
        System.out.println("Díme el coeficiente b.");
        b = sc.nextDouble();
        System.out.println("Díme el coeficiente c.");
        c = sc.nextDouble();

        discriminante = (b * b) - (4 * a * c);

        if (discriminante < 0)
        {
            System.out.println("No existe raíz cuadrada de un número negativo.");
        }
        else
        {
            if (a == 0)
            {
                System.out.println("No se puede dividir por 0.");
            }
            else
            {
                solucionmas = ((- b) + Math.sqrt(discriminante)) / (2 * a);
                soluionmenos = ((- b) - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La solución es " + solucionmas + " y " + soluionmenos);
            }
        }
    }
}
