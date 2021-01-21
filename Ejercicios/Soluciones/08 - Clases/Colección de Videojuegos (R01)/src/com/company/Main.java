package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Videojuego v1 = new Videojuego("Red Dead Redemption 2", 2018, Videojuego.Plataforma.PlayStation4, Videojuego.TipoJuego.Aventura, 96);
        Videojuego v2 = new Videojuego("Half-Life 2", 2004, Videojuego.Plataforma.PC, Videojuego.TipoJuego.Accion, 95);
        Videojuego v3 = new Videojuego("Super Smash Bros. Ultimate", 2018, Videojuego.Plataforma.Switch, Videojuego.TipoJuego.Accion,92);
        Videojuego v4 = new Videojuego("Fallout 4", 2015, Videojuego.Plataforma.XboxOne, Videojuego.TipoJuego.Rol, 89);

        Coleccion c = new Coleccion();

        c.insertaVideojuego(v1);
        c.insertaVideojuego(v2);
        c.insertaVideojuego(v3);
        c.insertaVideojuego(v4);

        System.out.println(c.toStringNum());
        System.out.println();
        System.out.println(c.toString());
    }
}
