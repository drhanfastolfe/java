package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pajaro extends Animal
{
    private EspeciePajaro especie;
    private boolean cantor;

    enum EspeciePajaro
    {
        Canario, Periquito, Agapornis
    }

    public EspeciePajaro getEspecie()
    {
        return especie;
    }

    public boolean isCantor()
    {
        return cantor;
    }

    public Pajaro(String nombre, EspeciePajaro especie, String fechaNacimiento, double peso, boolean cantor)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = convierteEnFecha(fechaNacimiento);
        this.peso = peso;
        this.cantor = cantor;
    }

    public String toString()
    {
        String fecha;
        String peso = sustituyeCaracter(Double.toString(this.peso),'.',',');
        String cantor = "No";

        if (this.cantor)
        {
            cantor = "Si";
        }

        String fechaBonita = fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fecha = "Fecha de Nacimiento: " + fechaBonita;

        String ficha = "Ficha de Pájaro" + System.lineSeparator() +
                "Nombre: " + this.nombre + System.lineSeparator() +
                "Especie: " + this.especie + System.lineSeparator() +
                fecha + System.lineSeparator() +
                "Peso: " + peso + " kg" + System.lineSeparator() +
                "Cantor: " + cantor + System.lineSeparator() +
                "Comentarios: " + this.comentarios;

        return ficha;
    }
}
