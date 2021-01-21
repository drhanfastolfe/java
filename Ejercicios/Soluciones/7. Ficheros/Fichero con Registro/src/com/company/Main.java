package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = -1;

        List<FichaAlumno> liAlumnos = new ArrayList<>();
        while (opcion!=0)
        {
            System.out.println("Menu");
            System.out.println();
            System.out.println("Elige del 1 al 8.");
            System.out.println();
            System.out.println("Para salir del menú introduce el 0");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    leeAlumnoLista(liAlumnos);
                }
                break;
                case 2:
                {
                    imprimeListaAlumnos(liAlumnos);
                }
                break;
                case 3:
                {
                    String f = "3. escribeFicheroAlumnosBinarios.bin";
                    escribeFicheroAlumnosBinario(liAlumnos,f);
                }
                break;
                case 4:
                {
                    String f = "3. escribeFicheroAlumnosBinarios.bin";
                    leeFicheroAlumnosBinario(liAlumnos,f);
                }
                break;
                case 5:
                {
                    String f = "5. escribeFicheroAlumnoTexto.txt";
                    escribeFicheroAlumnosTexto(f,liAlumnos);
                }
                break;
                case 6:
                {
                    String f = "5. escribeFicheroAlumnoTexto.txt";
                    leeFicheroAlumnosTexto(liAlumnos,f);
                }
                break;
                case 7:
                {
                    String f = "7. escribeFicheroAlumnos.csv";
                    escribeFicheroAlumnosCSV(f,liAlumnos);
                }
                break;
                case 8:
                {
                    String f = "7. escribeFicheroAlumnos.csv";
                    leeFicheroAlumnosCSV(liAlumnos,f);
                }
                break;
            }
        }
    }

    public static void leeAlumnoLista(List<FichaAlumno> liAlumnos)
    {
        Scanner sc = new Scanner(System.in);
        FichaAlumno fa = new FichaAlumno();
        System.out.println("Introduce le nombre del alumno:");
        fa.nombre = sc.next();
        System.out.println("Introduce la edad del alumno:");
        fa.edad = sc.nextInt();
        System.out.println("Introduce la calificación del alumno");
        fa.calificacion = sc.nextDouble();

        liAlumnos.add(fa);
    }

    public static String padLeft(String s, int l)
    {
        int i,nEspacios;
        nEspacios= l - s.length();
        String s1=s;
        for (i=0; i<nEspacios;i++)
        {
            s = ' ' + s;
        }
        return s;
    }

    public static String padRight(String s, int l)
    {
        int i,nEspacios;
        nEspacios= l - s.length();
        String s1=s;
        for (i=0; i<nEspacios;i++)
        {
            s = s + ' ';
        }
        return s;
    }

    public static void imprimeListaAlumnos(List<FichaAlumno> liAlumnos)
    {
        int i;

        for (i=0;i<liAlumnos.size();i++)
        {
            System.out.print(liAlumnos.get(i).nombre + " " + liAlumnos.get(i).edad +
                    " " + liAlumnos.get(i).calificacion);
            System.out.println();
        }
    }

    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> liAlumnos, String f)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i;
            dos.writeInt(liAlumnos.size());
            for (i=0;i<liAlumnos.size();i++)
            {
                dos.writeUTF(liAlumnos.get(i).nombre);
                dos.writeInt(liAlumnos.get(i).edad);
                dos.writeDouble(liAlumnos.get(i).calificacion);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosBinario(List<FichaAlumno> liAlumnos, String f)
    {
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            int i;
            liAlumnos.clear();
            int tam = dis.readInt();
            for (i=0;i<tam;i++)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre = dis.readUTF();
                fa.edad = dis.readInt();
                fa.calificacion = dis.readDouble();
                liAlumnos.add(fa);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosTexto(String f, List<FichaAlumno> liAlumnos)
    {
        try
        {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            bw.write(liAlumnos.size() + System.lineSeparator());

            for (i=0;i<liAlumnos.size();i++)
            {
                bw.write(liAlumnos.get(i).nombre + System.lineSeparator());
                bw.write(liAlumnos.get(i).edad + System.lineSeparator());
                bw.write(String.valueOf(liAlumnos.get(i).calificacion) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosTexto(List<FichaAlumno> liAlumnos, String f)
    {
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            int i, temp;

            temp = Integer.parseInt(br.readLine());
            liAlumnos.clear();

            for (i=0;i<temp;i++)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre = br.readLine();
                fa.edad = Integer.parseInt(br.readLine());
                fa.calificacion = Double.valueOf(br.readLine());
                liAlumnos.add(fa);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroAlumnosCSV(String f, List<FichaAlumno> liAlumnos)
    {
        try
        {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;

            for (i=0;i<liAlumnos.size();i++)
            {
                bw.write(liAlumnos.get(i).nombre + ";");
                bw.write(liAlumnos.get(i).edad + ";");
                bw.write(String.valueOf(liAlumnos.get(i).calificacion) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroAlumnosCSV(List<FichaAlumno> liAlumno, String f)
    {
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            liAlumno.clear();
            String linea = br.readLine();

            while (linea!=null)
            {
                FichaAlumno fa = new FichaAlumno();
                String[] aAlumno = linea.split(";");
                fa.nombre = aAlumno[0];
                fa.edad = Integer.valueOf(aAlumno[1]);
                fa.calificacion = Double.valueOf(aAlumno[2]);
                liAlumno.add(fa);
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
}

