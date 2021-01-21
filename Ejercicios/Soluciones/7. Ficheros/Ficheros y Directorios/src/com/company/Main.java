package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println();
        System.out.println("Elige del 1 al 7.");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String ext = "txt";
                System.out.println(cuantosFicheros(ext));
            }
            break;
            case 2:
            {
                String ext = "txt";
                String dir = "directorio";
                System.out.println(cuantosFicherosPro(ext,dir));
            }
            break;
            case 3:
            {
                String f = "fichero.txt";
                creaBackup(f);
            }
            break;
            case 4:
            {
                String ext1 = "texto";
                String ext2 = "txt";
                renombraMasivo(ext1,ext2);
            }
            break;
            case 5:
            {
                String ext = "txt";
                System.out.println(cuentaLineasFicheros(ext));
            }
            break;
            case 6:
            {
                System.out.println(ficheroMasGrande());
            }
            break;
            case 7:
            {
                clasificaFichero();
            }
            break;
        }
    }

    public static int cuantosFicheros(String ext)
    {
        int i, cont;
        cont = 0;
        File f = new File(".");
        File[] aF = f.listFiles();
        for (i=0; i<aF.length;i++)
        {
            if (aF[i].isFile())
            {
                if (aF[i].getName().endsWith("." + ext))
                {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int cuantosFicherosPro(String ext, String dir)
    {
        int i, cont;

        cont = 0;
        File f = new File(dir);
        File[] aF = f.listFiles();
        for (i=0; i<aF.length;i++)
        {
            if (aF[i].isFile())
            {
                if (aF[i].getName().endsWith("." + ext))
                {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void creaBackup(String f)
    {
        try
        {
            String fBak;
            fBak = f + ".bak";
            while (Files.exists(Path.of(fBak)))
            {
                fBak = fBak + ".bak";
            }
            Files.copy(Path.of(f), Path.of(fBak));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void renombraMasivo(String ext1, String ext2)
    {
        try
        {
            int i;
            File f = new File(".");
            File[] aF = f.listFiles();
            for (i=0;i<aF.length;i++)
            {
                if (aF[i].getName().endsWith("." + ext1))
                {
                    Files.move(Path.of(aF[i].getName()),Path.of(aF[i].getName().substring(0, aF[i].getName().length() - ext1.length() ) + ext2));
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int cuentaLineasFicheros(String ext)
    {
        int lineas;
        lineas = 0;

        try
        {
            int i;
            File f = new File(".");
            File[] af = f.listFiles();
            for (i=0; i<af.length; i++)
            {
                if (af[i].getName().endsWith("." + ext))
                {
                    if (af[i].isFile())
                    {
                        FileReader fr = new FileReader(af[i]);
                        BufferedReader br = new BufferedReader(fr);

                        String linea = br.readLine();

                        while (linea!=null)
                        {
                            lineas++;
                            linea = br.readLine();
                        }

                        br.close();
                        fr.close();
                    }
                }

            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return lineas;
    }

    public static String ficheroMasGrande()
    {
        String nombreF = "";

        int i, mayor;
        mayor = 0;
        File f = new File(".");
        File[] aF = f.listFiles();
        for (i=0;i<aF.length;i++)
        {
            if (aF[i].isFile())
            {
                if (aF[i].length() > mayor)
                {
                    nombreF = aF[i].getName();
                }
            }
        }
        return nombreF;
    }

    public static List<String> eliminaRepetidos(List<String> li)
    {
        int i;
        List<String> li2 = new LinkedList<>();
        for (i = 0; i < li.size(); i++)
        {
            if (!li2.contains(li.get(i)))
            {
                li2.add(li.get(i));
            }
        }
        return li2;
    }

    public static void clasificaFichero()
    {
        int i,j,nRep;

        File f = new File(".");
        File[] aF = f.listFiles();

        List<String> liExt = new LinkedList<>();
        List<String> liF = new LinkedList<>();
        List<String> liExtUnico;
        List<Integer> liRep = new LinkedList<>();

        for (i=0;i<aF.length;i++)
        {
            if (aF[i].isFile())
            {
                liF.add(aF[i].getName());
            }
        }

        for (i=0;i<liF.size();i++)
        {
            liExt.add(liF.get(i).substring(liF.get(i).lastIndexOf(".") + 1));
        }

        liExtUnico = eliminaRepetidos(liExt);

        for (i=0;i<liExtUnico.size();i++)
        {
            nRep=0;
            for (j=0;j<liExt.size();j++)
            {
                if (liExtUnico.get(i).equals(liExt.get(j)))
                {
                    nRep++;
                }
            }
            liRep.add(nRep);
        }

        for (i=0;i<liExtUnico.size();i++)
        {
            System.out.println(liExtUnico.get(i) + " => " + liRep.get(i));
        }
    }


}
