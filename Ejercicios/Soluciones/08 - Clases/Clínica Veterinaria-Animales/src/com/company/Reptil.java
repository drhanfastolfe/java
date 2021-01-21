package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reptil extends Animal
{
    private EspecieReptil especie;
    private boolean venenoso;

    enum EspecieReptil
    {
        Tortuga, Iguana, DragonDeComodo
    }

    public EspecieReptil getEspecie()
    {
        return especie;
    }

    public boolean isVenenoso()
    {
        return venenoso;
    }

    public Reptil(String nombre, EspecieReptil especie, String fechaNacimiento, double peso, boolean venenoso)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = convierteEnFecha(fechaNacimiento);
        this.peso = peso;
        this.venenoso = venenoso;
    }

    public String toString()
    {
        String especie;
        String fecha;
        String peso = sustituyeCaracter(Double.toString(this.peso),'.',',');
        String venenoso = "No";

        if (this.venenoso)
        {
            venenoso = "Si";
        }

        if (this.especie == EspecieReptil.DragonDeComodo)
        {
            especie = "Especie: Dragón de comodo";
        }
        else
        {
            especie = "Especie: " + this.especie;
        }

        String fechaBonita = fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fecha = "Fecha de Nacimiento: " + fechaBonita;

        String ficha = "Ficha de Reptil" + System.lineSeparator() +
                "Nombre: " + this.nombre + System.lineSeparator() +
                especie + System.lineSeparator() +
                fecha + System.lineSeparator() +
                "Peso: " + peso + " kg" + System.lineSeparator() +
                "Venenoso: " + venenoso + System.lineSeparator() +
                "Comentarios: " + this.comentarios;

        return ficha;
    }
}
