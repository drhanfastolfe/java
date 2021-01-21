package com.company;


public class Main
{

    public static void main(String[] args)
    {
        Perro p = new Perro("Luna", Perro.RazaPerro.PastorAleman, "12/2/2003", 12.4, "P8479382749DF39");
        p.setComentarios("Está pachucho.");

        Gato g = new Gato("Arwen", Gato.RazaGato.Comun, "2/7/2010", 3.14, "G8479382749DF39");
        g.setComentarios("Es arisco.");

        Pajaro pa = new Pajaro("Fénix", Pajaro.EspeciePajaro.Canario, "17/9/2019", 0.25, false);
        pa.setComentarios("Va volando.");

        Reptil r = new Reptil("Smaug",Reptil.EspecieReptil.DragonDeComodo, "5/4/2015", 70.0, true);
        r.setComentarios("Cuidado que muerde.");

        ClinicaVeterinaria c = new ClinicaVeterinaria();

        c.insertaAnimal(p);
        c.insertaAnimal(g);
        c.insertaAnimal(pa);
        c.insertaAnimal(r);

        c.modificaComentarioAnimal("Luna","Es un buen perro.");

        System.out.println(c.toString());
    }
}
