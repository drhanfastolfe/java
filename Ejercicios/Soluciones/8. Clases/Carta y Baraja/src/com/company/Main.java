package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Baraja b = new Baraja(1,true);
        b.barajar();
        boolean bPlantarse;
        bPlantarse = false;
        String cortar, sCarta;
        int numeroCartas, robos, robosMax;
        robos = 0;
        double puntosUsuario, puntosIA, limite;
        puntosUsuario = 0;
        puntosIA = 0;

        System.out.println("¿Quieres cortar? Introduce 's' para cortar o 'n' para seguir.");
        cortar = sc.next();
        if (cortar.equals("s"))
        {
            System.out.println("¿Por qué número de carta quieres cortar?");
            numeroCartas = sc.nextInt();
            b.cortar(numeroCartas);
        }

        while (puntosUsuario < 7.5 && !bPlantarse)
        {
            Carta c = b.roba();
            sCarta = c.nombreCarta();
            puntosUsuario = puntosUsuario + c.valor7ymedia();
            System.out.println("Has sacado el " + sCarta + " y tu puntuación actual es de "
                    + puntosUsuario);
            if (puntosUsuario > 7.5)
            {
                System.out.println("Te has pasado.");
            }
            else
            {
                if (puntosUsuario == 7.5)
                {
                    System.out.println("Has conseguido la máxima puntuación.");
                }
                else
                {
                    bPlantarse = plantarse();
                }
            }
        }
        if (puntosUsuario==7.5)
        {
            limite = 7.5;
            robosMax = 999;
        }
        else
        {
            if (puntosUsuario>7.5)
            {
                limite = 7.5;
                robosMax = 1;
            }
            else
            {
                if (puntosUsuario>6.5)
                {
                    limite = puntosUsuario;
                    robosMax = 999;
                }
                else
                {
                    limite = puntosUsuario + 0.5;
                    robosMax= 999;
                }


            }
        }
        while (puntosIA < limite && robos < robosMax)
        {
            Carta c = b.roba();
            sCarta = c.nombreCarta();
            puntosIA = puntosIA + c.valor7ymedia();
            System.out.println("Java ha sacado el " + sCarta + " y su puntuación actual es de "
                    + puntosIA);
            robos++;
        }

        if (puntosIA < puntosUsuario && puntosUsuario <= 7.5 || puntosIA > 7.5 && puntosUsuario <= 7.5)
        {
            System.out.println("Has ganado.");
            System.out.println(puntosIA + " vs " + puntosUsuario);
        }
        else
        {
            if (puntosIA == puntosUsuario)
            {
                System.out.println("Empate.");
                System.out.println(puntosIA + " vs " + puntosUsuario);
            }
            else
            {
                System.out.println("Ha ganado Java. Has perdido.");
                System.out.println(puntosIA + " vs " + puntosUsuario);
            }
        }
    }

    public static boolean plantarse()
    {
        Scanner sc = new Scanner(System.in);
        boolean plantarse = false;
        String sPlantarse;
        System.out.println("¿Quieres plantarte? Introduce 's' para plantarte o 'n' para" +
                "seguir.");
        sPlantarse = sc.next();
        if (sPlantarse.equals("s"))
        {
            plantarse = true;
        }
        return plantarse;
    }

}
