package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Pokedex
{
    private List<Pokemon> listaPokemon;

    public Pokedex()
    {
        this.listaPokemon = new LinkedList<>();
    }

    public Pokedex(String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            this.listaPokemon.clear();
            String linea = br.readLine();

            while (linea!=null)
            {
                String[] aPokemon = linea.split(";");
                Pokemon pTemp = new Pokemon
                    (
                        Integer.parseInt(aPokemon[0]),
                        aPokemon[1],
                        aPokemon[2],
                        Integer.parseInt(aPokemon[3]),
                        Integer.parseInt(aPokemon[4]),
                        Integer.parseInt(aPokemon[5]),
                        Integer.parseInt(aPokemon[6]),
                        Integer.parseInt(aPokemon[7]),
                        Integer.parseInt(aPokemon[8]),
                        aPokemon[9],
                        Boolean.parseBoolean(aPokemon[10])
                    );
                this.listaPokemon.add(pTemp);
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void leeCSV(String fichero)
    {

    }
}
