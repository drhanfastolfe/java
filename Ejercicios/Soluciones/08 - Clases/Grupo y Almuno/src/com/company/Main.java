package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Grupo g = new Grupo();
        Alumno a = new Alumno("Hamza",24,8.5);
        g.insertaAlumnoLista(a);
        g.insertaAlumnoLista("Ale", 21, 8.75);
        g.insertaAlumnoLista("Cintia", 20, 9.5);
        g.insertaAlumnoLista("Dani", 24, 9.25);
        System.out.println(g.toString());
        System.out.println();

        g.escribeFicheroBinario("grupo.bin");
        g.leeFicheroBinario("grupo.bin");
        System.out.println(g.toString());
        System.out.println();

        g.escribeFicheroTexto("grupo.txt");
        g.leeFicheroTexto("grupo.txt");
        System.out.println(g.toString());
        System.out.println();

        g.escribeFicheroCSV("grupo.csv");
        g.leeFicheroCSV("grupo.csv");
        System.out.println(g.toString());
    }
}
