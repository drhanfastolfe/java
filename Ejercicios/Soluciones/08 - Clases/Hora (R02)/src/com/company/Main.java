package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Hora h = new Hora(4654);
        System.out.println("1. La hora inicial: " + h.toString());

        h.sumaHoras(2);
        System.out.println("2. Probando sumaHoras: " + h.toString());

        h.sumaMinutos(67);
        System.out.println("3. Probando sumaMinutos: " + h.toString());

        h.sumaSegundos(75);
        System.out.println("4. Probando sumaSegundos: " + h.toString());

        Hora h2 = new Hora(9000);
        System.out.println("5. La hora2: " + h2.toString());

        h.add(h2);
        System.out.println("6. Probando add: " + h.toString());

        h.substract(h2);
        System.out.println("7. Probando substract: " + h.toString());
    }
}
