package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gato extends Animal
{
    private RazaGato raza;
    private String microchip;

    enum RazaGato
    {
        Comun, Siames, Persa, Angora, ScottishFold
    }

    public RazaGato getRaza()
    {
        return raza;
    }

    public String getMicrochip()
    {
        return microchip;
    }

    public Gato(String nombre, Gato.RazaGato raza, String fechaNacimiento, double peso, String microchip)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = convierteEnFecha(fechaNacimiento);
        this.peso = peso;
        this.microchip = microchip;
    }

    public String toString()
    {
        String raza;
        String fecha;
        String peso = sustituyeCaracter(Double.toString(this.peso),'.',',');

        if (this.raza == RazaGato.ScottishFold)
        {
            raza = "Raza: Scottish fold";
        }
        else
        {
            raza = "Raza: " + this.raza;
        }

        String fechaBonita = fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fecha = "Fecha de Nacimiento: " + fechaBonita;

        String ficha = "Ficha de Gato" + System.lineSeparator() +
                "Nombre: " + this.nombre + System.lineSeparator() +
                raza + System.lineSeparator() +
                fecha + System.lineSeparator() +
                "Peso: " + peso + " kg" + System.lineSeparator() +
                "Microchip: " + this.microchip + System.lineSeparator() +
                "Comentarios: " + this.comentarios;

        return ficha;
    }
}
