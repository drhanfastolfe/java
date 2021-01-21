package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println();
        System.out.println("Elige del 1 al 10.");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String f = "1. ficheroNumRandom10.txt";
                escribeFicheroNumRandom10(f);
            }
            break;
            case 2:
            {
                String f = "2. sumaFicheroInt10.txt";
                System.out.println(sumaFicheroInt10(f));
            }
            break;
            case 3:
            {
                String f = "3. escribeFicheroNumRandom.txt";
                int n = 5;
                escribeFicheroNumRandom(f, n);
            }
            break;
            case 4:
            {
                String f = "4. sumaFicheroInt.txt";
                System.out.println(sumaFicheroInt(f));
            }
            break;
            case 5:
            {
                String f = "5. escribeFicheroTexto.txt";
                escribeFicheroTexto(f);
            }
            break;
            case 6:
            {
                String f = "6. leeFicheroTexto.txt";
                leeFicheroTexto(f);
            }
            break;
            case 7:
            {
                String f1 = "7.1. copiaFicheroTexto.txt";
                String f2 = "7.2. copiaFicheroTexto.txt";
                copiaFicheroTexto(f1,f2);
            }
            break;
            case 8:
            {
                String f1 = "8.1. invierteLineasFichero.txt";
                String f2 = "8.2. invierteLineasFichero.txt";
                invierteLineasFichero(f1,f2);
            }
            break;
            case 9:
            {
                String f = "9. invierteFicheroTexto.txt";
                invierteFicheroTexto(f);
            }
            break;
            case 10:
            {
                String f1 = "10.1. separaPalabrasFichero.txt";
                String f2 = "10.2. separaPalabrasFichero.txt";
                separaPalabrasFichero(f1,f2);
            }
            break;
        }
    }

    public static void escribeFicheroNumRandom10(String f)
    {
        try
        {
            Random r = new Random();
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            int i,n;
            for (i=0;i<10;i++)
            {
                n = r.nextInt(10);
                bw.write(n + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt10(String f)
    {
        int i, suma;
        suma = 0;
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            for (i=0; i<10; i++)
            {
                suma = suma + Integer.valueOf(br.readLine());
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroNumRandom(String f, int n)
    {
        try
        {
            Random r = new Random();
            int i;
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (i=0; i<n; i++)
            {
                bw.write(r.nextInt(10) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheroInt(String f)
    {
        int suma;
        suma = 0;
        try
        {
           FileReader fr = new FileReader(f);
           BufferedReader br = new BufferedReader(fr);

           String linea = br.readLine();
           while (linea!=null)
           {
               suma = suma + Integer.valueOf(linea);
               linea = br.readLine();
           }

           br.close();
           fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }

    public static void escribeFicheroTexto(String f)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea;
            System.out.println("Escribe una línea, para parar introduce una línea en" +
                    "blanco('')");
            linea = sc.nextLine();
            bw.write(linea + System.lineSeparator());

            while (!linea.equals(""))
            {
                System.out.println("Introduce otra línea.");
                linea = sc.nextLine();
                bw.write(linea + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroTexto(String f)
    {
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea!=null)
            {
                System.out.println(linea);
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

    public static void copiaFicheroTexto(String f1, String f2)
    {
        try
        {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea = br.readLine();

            while (linea!=null)
            {
                bw.write(linea + System.lineSeparator());
                linea = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String invierteCardena(String s)
    {
        int i;
        String s2="";
        for (i=s.length()-1;i>=0;i--)
        {
            s2=s2 + s.charAt(i);
        }
        return s2;
    }

    public static void invierteLineasFichero(String f1, String f2)
    {
        try
        {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea = br.readLine();

            while (linea!=null)
            {
                linea = invierteCardena(linea);
                bw.write(linea + System.lineSeparator());
                linea = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteFicheroTexto(String f)
    {
        try
        {
            List<String> liF = new LinkedList<>();
            int i;

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);


            String linea = br.readLine();

            while (linea!=null)
            {
                liF.add(linea);
                linea = br.readLine();
            }

            Collections.reverse(liF);

            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (i=0; i<liF.size();i++)
            {
                bw.write(liF.get(i) + System.lineSeparator());
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void separaPalabrasFichero(String f1, String f2)
    {
        try
        {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);

            List<String> liLineas = new LinkedList<>();
            String[] aPalabras;
            List<String> liPalabras = new LinkedList<>();
            String linea = br.readLine();

            while (linea!=null)
            {
                liLineas.add(linea);
                linea = br.readLine();
            }

            int i;

            for (i=0; i<liLineas.size();i++)
            {
                aPalabras = liLineas.get(i).split(" ");
                liPalabras.addAll(Arrays.asList(aPalabras));
            }

            for (i=0; i<liPalabras.size();i++)
            {
                bw.write(liPalabras.get(i) + System.lineSeparator());
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
