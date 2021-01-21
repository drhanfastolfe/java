package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("LAS TRES EN RAYA");
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Jugador VS Jugador    | 2. Jugardor VS IA");
        System.out.println("3. Ordenador VS Jugador | 4. Ordenador VS Ordenador");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1: jugadorVsJugador(); break;
            case 2: jugadorVsIA(); break;
            case 3: IAvsJugador(); break;
            case 4: ordenadorVsOrdenador();break;
        }
    }

    public static void jugadorVsJugador()
    {
        Scanner sc = new Scanner(System.in);
        Tablero t = new Tablero();
        int pos1,pos2;
        String jugador1, jugador2;

        System.out.println("Has elegido Jugador(X) VS Jugador(O).");
        System.out.println();
        System.out.println("Jugador 1, introduce tu seudónimo:");
        jugador1 = sc.next();
        System.out.println("Jugador 2, introduce tu seudónimo:");
        jugador2 = sc.next();

        while (!t.ganaJugador1() && !t.ganaJugador2() && !t.empate())
        {
            System.out.println("Turno de " + jugador1 + ".");
            t.dibujaTablero();
            pos1 = sc.nextInt();
            t.mueveJugador1(pos1);
            t.dibujaTablero();

            if (!t.ganaJugador1() && !t.empate())
            {
                System.out.println("Turno de " + jugador2 + ".");
                t.dibujaTablero();
                pos2 = sc.nextInt();
                t.mueveJugador2(pos2);
                t.dibujaTablero();
            }
        }
        if (t.ganaJugador1())
        {
            System.out.println("¡HA GANADO " + jugador1 + "!");
        }
        else
        {
            if (t.ganaJugador2())
            {
                System.out.println("¡HA GANADO " + jugador2 + "!");
            }
            else
            {
                System.out.println("La partida ha acabado en empate.");
            }
        }

    }

    public static void jugadorVsIA()
    {
        Scanner sc = new Scanner(System.in);
        Tablero t = new Tablero();
        int pos1;
        String jugador1;

        System.out.println("Has elegido Jugador(X) VS IA(O).");
        System.out.println();
        System.out.println("Jugador, introduce tu seudónimo:");
        jugador1 = sc.next();

        while (!t.ganaJugador1() && !t.ganaJugador2() && !t.empate())
        {
            System.out.println("Turno de " + jugador1 + ".");
            t.dibujaTablero();
            pos1 = sc.nextInt();
            t.mueveJugador1(pos1);
            t.dibujaTablero();

            if (!t.ganaJugador1() && !t.empate())
            {
                System.out.println("Turno de IA.");
                t.mueveIA2();
                t.dibujaTablero();
            }
        }
        if (t.ganaJugador1())
        {
            System.out.println("¡HA GANADO " + jugador1 + "!");
        }
        else
        {
            if (t.ganaJugador2())
            {
                System.out.println("¡HA GANADO LA IA!");
            }
            else
            {
                System.out.println("La partida ha acabado en empate.");
            }
        }
    }

    public static void IAvsJugador()
    {
        Scanner sc = new Scanner(System.in);
        Tablero t = new Tablero();
        int pos1;
        String jugador1;

        System.out.println("Has elegido IA(X) VS Jugador(O).");
        System.out.println();
        System.out.println("Jugador, introduce tu seudónimo:");
        jugador1 = sc.next();

        while (!t.ganaJugador1() && !t.ganaJugador2() && !t.empate())
        {
            System.out.println("Turno de IA.");
            t.mueveIA1();
            t.dibujaTablero();

            if (!t.ganaJugador1() && !t.empate())
            {
                System.out.println("Turno de " + jugador1 + ".");
                t.dibujaTablero();
                pos1 = sc.nextInt();
                t.mueveJugador2(pos1);
                t.dibujaTablero();
            }
        }
        if (t.ganaJugador1())
        {
            System.out.println("¡HA GANADO LA IA!");
        }
        else
        {
            if (t.ganaJugador2())
            {
                System.out.println("¡HA GANADO " + jugador1 + "!");
            }
            else
            {
                System.out.println("La partida ha acabado en empate.");
            }
        }
    }

    public static void ordenadorVsOrdenador()
    {

    }

}
