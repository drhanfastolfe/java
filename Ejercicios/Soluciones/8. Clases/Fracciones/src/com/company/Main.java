package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);



        int numerador, denominador, opcion;
        opcion = -1;

        System.out.println("En este menú podrás hacer diferentes operaciones con fracciones.");
        System.out.println("Introduce el numerador de tu fracción:");
        numerador = sc.nextInt();

        System.out.println("Introduce el denominador de tu fracción:");
        denominador = sc.nextInt();

        Fraccion f = new Fraccion(numerador,denominador);

        System.out.println("Elige una operación:");
        System.out.println(
                "1. Negar   2. Sumar   3. Restar   4. Multiplicar" + System.lineSeparator() +
                "5. Dividir 6. Comparar 0. Salir");

        opcion = sc.nextInt();

        while (opcion!=0)
            {
            switch (opcion)
            {
                case 1:
                {
                    f = f.negate();

                    System.out.println("Resultado = " + f.toString());
                }
                break;
                case 2:
                {
                    int numerador2, denominador2;

                    System.out.println("Introduce el numerador de la fracción a sumar:");
                    numerador2 = sc.nextInt();

                    System.out.println("Introduce el denominador de la fracción a sumar:");
                    denominador2 = sc.nextInt();

                    Fraccion f2 = new Fraccion(numerador2,denominador2);

                    System.out.print(f.toString() + " + " + f2.toString() + " = ");

                    f = f.add(f2);
                    f.simplificar();

                    System.out.println(f.toString());
                }
                break;
                case 3:
                {
                    int numerador3, denominador3;

                    System.out.println("Introduce el numerador de la fracción a restar:");
                    numerador3 = sc.nextInt();

                    System.out.println("Introduce el denominador de la fracción a restar:");
                    denominador3 = sc.nextInt();

                    Fraccion f3 = new Fraccion(numerador3, denominador3);

                    System.out.print(f.toString() + " - " + f3.toString() + " = ");

                    f = f.substract(f3);
                    f.simplificar();

                    System.out.println(f.toString());
                }
                break;
                case 4:
                {
                    int numerador4, denominador4;

                    System.out.println("Introduce el numerador de la fracción a multiplicar:");
                    numerador4 = sc.nextInt();

                    System.out.println("Introduce el denominador de la fracción a multiplicar:");
                    denominador4 = sc.nextInt();

                    Fraccion f4 = new Fraccion(numerador4, denominador4);

                    System.out.print(f.toString() + " x " + f4.toString() + " = ");

                    f = f.multiply(f4);
                    f.simplificar();

                    System.out.println(f.toString());
                }
                break;
                case 5:
                {
                    int numerador5, denominador5;

                    System.out.println("Introduce el numerador de la fracción a dividir:");
                    numerador5 = sc.nextInt();

                    System.out.println("Introduce el denominador de la fracción a dividir:");
                    denominador5 = sc.nextInt();

                    Fraccion f5 = new Fraccion(numerador5, denominador5);

                    System.out.print(f.toString() + " : " + f5.toString() + " = ");

                    f = f.divide(f5);
                    f.simplificar();

                    System.out.println(f.toString());
                }
                break;
                case 6:
                {
                    int numerador6, denominador6, comparador;

                    System.out.println("Introduce el numerador de la fracción a comparar:");
                    numerador6 = sc.nextInt();

                    System.out.println("Introduce el denominador de la fracción a comparar:");
                    denominador6 = sc.nextInt();

                    Fraccion f6 = new Fraccion(numerador6, denominador6);

                    System.out.println(f.toString() + " comparado con " + f6.toString());

                    comparador = f.compareTo(f6);

                    if (comparador == -1)
                    {
                        System.out.println("Resultado => " + f.toString() + " < " + f6.toString());
                    }
                    else
                    {
                        if (comparador == 1)
                        {
                            System.out.println("Resultado => " + f.toString() + " > " + f6.toString());
                        }
                        else
                        {
                            System.out.println("Resultado => " + f.toString() + " = " + f6.toString());
                        }
                    }
                }
                break;
            }

            System.out.println("Elige una operación:");
            System.out.println(
                    "1. Negar   2. Sumar   3. Restar   4. Multiplicar" + System.lineSeparator() +
                            "5. Dividir 6. Comparar 0. Salir");

            opcion = sc.nextInt();
        }
    }
}
