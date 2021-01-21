package com.company;

public class Main
{

    public static void main(String[] args)
    {
        BuscaTexto bt = new BuscaTexto();

        bt.cargaFichero("fichero.txt");

        System.out.println(bt.getTexto());

        System.out.println(bt.busca("humanos"));

        System.out.println(bt.buscaSiguiente("humanos"));

        System.out.println(bt.extraeCadenaConDelim("¿","?"));
    }
}
