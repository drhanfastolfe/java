package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double dinero;

        System.out.println("Introduce una cantidad de dinero menor que 5€.");
        dinero = sc.nextDouble();

        while (dinero < 0 || dinero >= 5)
        {
            System.out.println("ERROR: la cantidad de dinero debe estar entre 0€ y 5€.");
            dinero = sc.nextDouble();
        }

        calderilla(dinero);
    }

    public static void calderilla(double dinero)
    {
        double mdoseuros, muneuro, mcincuentacent, mveintecent, mdiezcent, mcincocent, mdoscent, muncent;


        mdoseuros = Math.floor(dinero / 2);

        dinero = dinero - (mdoseuros * 2);
        dinero = dinero * 100;
        dinero = Math.round(dinero) / 100.0;
        muneuro = Math.floor(dinero / 1);

        dinero = (dinero - muneuro) * 100;
        mcincuentacent = Math.floor(dinero / 50);

        dinero = dinero - (mcincuentacent * 50);
        dinero = Math.round(dinero);
        mveintecent = Math.floor(dinero / 20);

        dinero = dinero - (mveintecent * 20);
        mdiezcent = Math.floor(dinero / 10);

        dinero = dinero - (mdiezcent * 10);
        mcincocent = Math.floor(dinero / 5);

        dinero = dinero - (mcincocent * 5);
        mdoscent = Math.floor(dinero / 2);

        dinero = dinero - (mdoscent * 2);
        muncent = Math.round(dinero);

        System.out.println(mdoseuros + " monedad de 2€ " + muneuro + " monedas de 1€ " + mcincuentacent + " monedas" +
                " de 50 cent " + mveintecent + " monedas de 20 cent " + mdiezcent + " monedas de 10 cent "
                + mcincocent + " monedas de 5 cent " + mdoscent + " monedas de 2 cent " + muncent + " monedas de 1 cent");
    }

    public static void calderilla2(double dinero)
    {
        int centimos, monedas;

        centimos = (int) Math.round(dinero * 100);

        monedas = centimos / 200;
        System.out.println(monedas +);

    }
}
