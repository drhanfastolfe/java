package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Grupo
{
    private List<Alumno> listaAlumnos;

    public Grupo()
    {
        this.listaAlumnos = new LinkedList<>();
    }

    public void insertaAlumnoLista(Alumno a)
    {
        this.listaAlumnos.add(a);
    }

    public void insertaAlumnoLista(String nombre, int edad, double calificacion)
    {
        Alumno a = new Alumno(nombre, edad, calificacion);

        this.listaAlumnos.add(a);
    }

    public String toString()
    {
        int i;
        String fichaAlumnos = "";

        for(i=0;i<this.listaAlumnos.size();i++)
        {
            fichaAlumnos = fichaAlumnos + this.listaAlumnos.get(i).toString();
            if (i!=this.listaAlumnos.size()-1)
            {
                fichaAlumnos = fichaAlumnos + "\n";
            }
        }

        return fichaAlumnos;
    }

    public void escribeFicheroBinario(String fichero)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            int i;
            dos.writeInt(this.listaAlumnos.size());
            for (i=0;i<this.listaAlumnos.size();i++)
            {
                dos.writeUTF(this.listaAlumnos.get(i).getNombre());
                dos.writeInt(this.listaAlumnos.get(i).getEdad());
                dos.writeDouble(this.listaAlumnos.get(i).getCalificacion());
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void leeFicheroBinario(String fichero)
    {
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            int i;
            this.listaAlumnos.clear();
            int tam = dis.readInt();
            for (i=0;i<tam;i++)
            {
                Alumno aTemp = new Alumno();
                aTemp.setNombre(dis.readUTF());
                aTemp.setEdad(dis.readInt());
                aTemp.setCalificacion(dis.readDouble());
                this.listaAlumnos.add(aTemp);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void escribeFicheroTexto(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            bw.write(this.listaAlumnos.size() + System.lineSeparator());

            for (i=0;i<this.listaAlumnos.size();i++)
            {
                bw.write(this.listaAlumnos.get(i).getNombre() + System.lineSeparator());
                bw.write(this.listaAlumnos.get(i).getEdad() + System.lineSeparator());
                bw.write(String.valueOf(this.listaAlumnos.get(i).getCalificacion()) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void leeFicheroTexto(String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            int i, temp;

            temp = Integer.parseInt(br.readLine());
            this.listaAlumnos.clear();

            for (i=0;i<temp;i++)
            {
                Alumno aTemp = new Alumno();
                aTemp.setNombre(br.readLine());
                aTemp.setEdad(Integer.parseInt(br.readLine()));
                aTemp.setCalificacion(Double.parseDouble(br.readLine()));
                this.listaAlumnos.add(aTemp);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void escribeFicheroCSV(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;

            for (i=0;i<this.listaAlumnos.size();i++)
            {
                bw.write(this.listaAlumnos.get(i).getNombre() + ";");
                bw.write(this.listaAlumnos.get(i).getEdad() + ";");
                bw.write(String.valueOf(this.listaAlumnos.get(i).getCalificacion()) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void leeFicheroCSV(String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            this.listaAlumnos.clear();
            String linea = br.readLine();

            while (linea!=null)
            {
                Alumno aTemp = new Alumno();
                String[] aAlumno = linea.split(";");
                aTemp.setNombre(aAlumno[0]);
                aTemp.setEdad(Integer.parseInt(aAlumno[1]));
                aTemp.setCalificacion(Double.parseDouble(aAlumno[2]));
                this.listaAlumnos.add(aTemp);
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
