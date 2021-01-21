package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Perro extends Animal
{
    private RazaPerro raza;
    private String microchip;

    enum RazaPerro
    {
        PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
    }

    public RazaPerro getRaza()
    {
        return raza;
    }

    public String getMicrochip()
    {
        return microchip;
    }

    public Perro(String nombre, RazaPerro raza, String fechaNacimiento, double peso, String microchip)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = convierteEnFecha(fechaNacimiento);
        this.peso = peso;
        this.microchip = microchip;
    }

    @Override
    public String toString()
    {
        String raza;
        String fecha;
        String peso = sustituyeCaracter(Double.toString(this.peso),'.',',');

        if (this.raza == RazaPerro.PastorAleman)
        {
            raza = "Raza: Pastor alemán";
        }
        else
        {
            if (this.raza == RazaPerro.FoxTerrier)
            {
                raza = "Raza = Fox terrier";
            }
            else
            {
                if (this.raza == RazaPerro.SanBernardo)
                {
                    raza = "Raza : San bernardo";
                }
                else
                {
                    raza = "Raza: " + this.raza;
                }
            }
        }

        String fechaBonita = fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fecha = "Fecha de Nacimiento: " + fechaBonita;

        String ficha = "Ficha de Perro" + System.lineSeparator() +
                "Nombre: " + this.nombre + System.lineSeparator() +
                raza + System.lineSeparator() +
                fecha + System.lineSeparator() +
                "Peso: " + peso + " kg" + System.lineSeparator() +
                "Microchip: " + this.microchip + System.lineSeparator() +
                "Comentarios: " + this.comentarios;

        return ficha;
    }
}
