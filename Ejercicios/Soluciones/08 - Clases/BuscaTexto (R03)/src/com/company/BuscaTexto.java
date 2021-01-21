package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscaTexto
{
    private String texto;
    private int puntero;


    public BuscaTexto()
    {
        this.texto = "";
        this.puntero = 0;
    }

    public BuscaTexto(String texto)
    {
        this.texto = texto;
        this.puntero = 0;
    }

    public void cargaFichero(String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            linea = br.readLine();

            while (linea!=null)
            {
                this.texto = this.texto + linea + System.lineSeparator();
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

    public void reinicia()
    {
        this.puntero = 0;
    }

    public boolean busca(String cadena)
    {
        boolean resultado;

        resultado = this.texto.contains(cadena);

        if (resultado)
        {
            this.puntero = this.texto.indexOf(cadena) + cadena.length();
        }

        return resultado;
    }

    public boolean buscaSiguiente(String cadena)
    {
        String subTexto;
        boolean resultado;

        subTexto = this.texto.substring(this.puntero);
        resultado = subTexto.contains(cadena);

        if (resultado)
        {
            this.puntero = this.puntero + subTexto.indexOf(cadena) + cadena.length();
        }

        return resultado;
    }

    public String extraeCadena(String delimitador1, String delimitador2)
    {
        String subTexto, resultado;
        int pos1, pos2;

        subTexto = this.texto.substring(this.puntero);

        if (subTexto.contains(delimitador1) && subTexto.contains(delimitador2))
        {
            pos1 = subTexto.indexOf(delimitador1) + delimitador1.length();
            pos2 = subTexto.indexOf(delimitador2);

            while (pos1>pos2)
            {
                subTexto = subTexto.substring(pos2);
                pos1 = subTexto.indexOf(delimitador1) + delimitador1.length();
                pos2 = subTexto.indexOf(delimitador2);
            }

            resultado = subTexto.substring(pos1,pos2);
        }
        else
        {
            resultado = null;
        }


        return resultado;
    }

    public String extraeCadenaConDelim(String delimitador1, String delimitador2)
    {
        String subTexto, resultado;
        int pos1, pos2;

        subTexto = this.texto.substring(this.puntero);

        if (subTexto.contains(delimitador1) && subTexto.contains(delimitador2))
        {
            pos1 = subTexto.indexOf(delimitador1);
            pos2 = subTexto.indexOf(delimitador2) + delimitador2.length();

            while (pos1>pos2)
            {
                subTexto = subTexto.substring(pos2);
                pos1 = subTexto.indexOf(delimitador1);
                pos2 = subTexto.indexOf(delimitador2) + delimitador2.length();
            }
            resultado = subTexto.substring(pos1,pos2);
        }
        else
        {
            resultado = null;
        }


        return resultado;
    }

    public int getPuntero()
    {
        return puntero;
    }

    public void setPuntero(int puntero)
    {
        if (puntero<0)
        {
            this.puntero = 0;
        }
        else
        {
            if (puntero < this.texto.length())
            {
                this.puntero = puntero;
            }
            else
            {
                this.puntero = this.texto.length();
            }
        }
    }

    public String getTexto()
    {
        return texto;
    }
}
