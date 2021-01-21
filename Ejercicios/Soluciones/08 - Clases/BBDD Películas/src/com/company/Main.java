package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String connString = "jdbc:sqlite:cine.db";
        CineDB c = new CineDB(connString);

        int opcion = -1;

        System.out.println(
                "Esta es la base de datos del cine. Elige una opción" + System.lineSeparator() +
                "1. Insertar una película   2. Listado de películas     3. Listado de actores" + System.lineSeparator() +
                "4. Peliculas por actor     5. Información de película  6. Salir");

        opcion = sc.nextInt();
        sc.nextLine();
        while (opcion!=6)
        {
            switch (opcion)
            {
                case 1:
                {
                    int anno, i, eligeActor, idPelicula;
                    String titulo, sTieneOscar;
                    double valoracion;
                    boolean tieneOscar = false;

                    System.out.println("Introduce el título de la película:");
                    titulo = sc.nextLine();

                    System.out.println("Introduce el año:");
                    anno = sc.nextInt();

                    System.out.println("¿Tiene algún oscar? Introduce 'si' o 'no'.");
                    sTieneOscar = sc.next();

                    if (sTieneOscar.equals("si"))
                    {
                        tieneOscar = true;
                    }
                    else
                    {
                        if (sTieneOscar.equals("no"))
                        {
                            tieneOscar = false;
                        }
                        else
                        {
                            System.out.println("ERROR");
                        }
                    }

                    System.out.println("Introduce la valoración:");
                    valoracion = sc.nextDouble();

                    idPelicula = c.insertaPelicula(titulo,anno,tieneOscar,valoracion);

                    System.out.println("Para añadir los actores de la película elige uno " +
                            "de la base de datos o introduce uno nuevo.");


                    eligeActor = -1;
                    while (eligeActor != 0)
                    {
                        List<Actor> listaActores = c.listadoActores();
                        System.out.println("0. Terminar");
                        if (listaActores.size() != 0)
                        {
                            for (i=0;i<listaActores.size();i++)
                            {
                                System.out.println(i+1 + ". " + listaActores.get(i).nombre);
                            }
                        }

                        System.out.println(listaActores.size()+1 + ". Insertar uno nuevo");


                        eligeActor = sc.nextInt();
                        sc.nextLine();

                        if (eligeActor == listaActores.size() + 1)
                        {
                            String nombre, fechaNacimiento, sPrincipal;
                            int idActor;
                            boolean principal = false;

                            System.out.println("Introduce el nombre del actor: ");
                            nombre = sc.nextLine();

                            System.out.println("Introduce su fecha de nacimiento (dd/mm/aaaa): ");
                            fechaNacimiento = sc.next();

                            System.out.println("¿Es un actor principal? Introduce 'si' o " +
                                    "'no'.");
                            sPrincipal = sc.next();

                            if (sPrincipal.equals("si"))
                            {
                                principal = true;
                            }
                            else
                            {
                                if (sPrincipal.equals("no"))
                                {
                                    principal = false;
                                }
                                else
                                {
                                    System.out.println("ERROR");
                                }
                            }

                            idActor = c.insertaActor(nombre, LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                            c.asociaActorPelicula(idActor, idPelicula, principal);
                        }
                        else
                        {
                            if (eligeActor >= 1 && eligeActor <= listaActores.size())
                            {
                                String sPrincipal;
                                boolean principal = false;

                                System.out.println("¿Es un actor principal? Introduce 'si' o " +
                                        "'no'.");
                                sPrincipal = sc.next();

                                if (sPrincipal.equals("si"))
                                {
                                    principal = true;
                                }
                                else
                                {
                                    if (sPrincipal.equals("no"))
                                    {
                                        principal = false;
                                    }
                                    else
                                    {
                                        System.out.println("ERROR");
                                    }
                                }

                                c.asociaActorPelicula(listaActores.get(eligeActor-1).id,idPelicula,principal);
                            }
                        }
                    }
                }
                break;
                case 2:
                {
                    List<Pelicula> listaPeliculas = c.listadoPeliculas();

                    int i;

                    for (i=0;i<listaPeliculas.size();i++)
                    {
                        System.out.println(i+1 + ". " + listaPeliculas.get(i).titulo);
                    }
                }
                break;
                case 3:
                {
                    List<Actor> listaActores = c.listadoActores();

                    int i;

                    for (i=0;i<listaActores.size();i++)
                    {
                        System.out.println(i+1 + ". " + listaActores.get(i).nombre);
                    }
                }
                break;
                case 4:
                {
                    int idActor, i;
                    String nombre;

                    System.out.println("Introduce el nombre del actor: ");
                    nombre = sc.nextLine();

                    idActor = c.buscaActor(nombre);

                    List<Pelicula> listaPeliculasActor = c.listadoPeliculasPorActor(idActor);

                    for (i=0;i<listaPeliculasActor.size();i++)
                    {
                        System.out.println(i+1 + ". " + listaPeliculasActor.get(i).titulo);
                    }
                }
                break;
                case 5:
                {
                    String titulo;

                    System.out.println("Introduce el título de la película: ");
                    titulo = sc.nextLine();

                    Pelicula p = c.datosPelicula(c.buscaPelicula(titulo));

                    System.out.println("Datos de la película: " + titulo);
                    System.out.println(
                            "Título: " + p.titulo + System.lineSeparator() +
                            "Año: " + p.anno + System.lineSeparator() +
                            "Tiene oscar: " + p.tieneOscar + System.lineSeparator() +
                            "Valoración: " + p.valoracion);

                    int idPelicula, i;

                    idPelicula = c.buscaPelicula(titulo);
                    List<ActorPelicula> listaActoresPelicula = c.listadoActoresPorPelicula(idPelicula);

                    System.out.println("Actores principales: ");
                    for (i=0;i<listaActoresPelicula.size();i++)
                    {
                        if (listaActoresPelicula.get(i).principal)
                        {
                            System.out.println("- " + listaActoresPelicula.get(i).nombre);
                        }
                    }

                    System.out.println("Actores secundarios: ");
                    for (i=0;i<listaActoresPelicula.size();i++)
                    {
                        if (!listaActoresPelicula.get(i).principal)
                        {
                            System.out.println("- " + listaActoresPelicula.get(i).nombre);
                        }
                    }
                }
                break;
            }

            System.out.println(
                    "Elige una opción" + System.lineSeparator() +
                    "1. Insertar una película   2. Listado de películas     3. Listado de actores" + System.lineSeparator() +
                    "4. Peliculas por actor     5. Información de película  6. Salir");

            opcion = sc.nextInt();
            sc.nextLine();
        }
    }
}
