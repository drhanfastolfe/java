package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int valor, media, suma, nvalores;
        suma = 0;
        nvalores = 0;

        System.out.println("Introduce un valor.");
        valor = sc.nextInt();

        while (valor >= 0)
        {
            ++nvalores;
            suma = suma + valor;
            System.out.println("Introduce otro valor.");
            valor = sc.nextInt();
        }
        media = suma / nvalores;
        System.out.println("La media de valores es: " + media);
    }
}
