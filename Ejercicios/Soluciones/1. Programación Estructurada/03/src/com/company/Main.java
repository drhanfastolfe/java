package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cantidad, cantidadeuros , cantidadpesetas;
        String moneda;

        System.out.println("Dime una cantidad de dinero.");
        cantidad = sc.nextDouble();
        sc.nextLine(); // para borrar el salto de línea que había detrás del número
        System.out.println("¿Es en euros o pesetas?");
        moneda = sc.nextLine();

        while (!((moneda.equals("euros") || moneda.equals("pesetas"))))
        {

            System.out.println("Vuelve a introducir la moneda correctamente: 'euros' o 'pesetas'.");
            moneda = sc.next();
            sc.nextLine();
        }

        if (moneda.equals("euros"))
        {
            cantidadpesetas = cantidad * 166.386;
            System.out.println("Son " + Math.round(cantidadpesetas * 1000) / 1000.0 + " pts");
        }
        else
        {
            cantidadeuros = cantidad / 166.386;
            System.out.println("Son " + Math.round(cantidadeuros * 100) / 100.0 + " €");
        }
    }
}
