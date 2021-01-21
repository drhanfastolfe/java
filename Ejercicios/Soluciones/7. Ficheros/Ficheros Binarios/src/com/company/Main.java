package com.company;

import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println();
        System.out.println("Elige del 11 al 21.");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 11:
            {
                String f = "11. escribeFichero1_100.bin";
                escribeFichero1_100(f);
            }
            break;
            case 12:
            {
                String f = "11. escribeFichero1_100.bin";
                leeFicheroInt100(f);
            }
            break;
            case 13:
            {
                String f ="13. escribeFicheroIntAleatorio.bin";
                int n = 8;
                escribeFicheroIntAleatorio(f,n);
            }
            break;
            case 14:
            {
                String f = "14. escribeFicheroIntAleatorioPro.bin";
                int n = 5;
                int min = -5;
                int max = 10;
                escribeFicheroIntAleatorioPro(f,n,min,max);
            }
            break;
            case 15:
            {
                String f = "14. escribeFicheroIntAleatorioPro.bin";
                leeFicheroInt(f);
            }
            break;
            case 16:
            {
                String f = "14. escribeFicheroIntAleatorioPro.bin";
                System.out.println(sumaFicheriInt(f));
            }
            break;
            case 17:
            {
                String f = "14. escribeFicheroIntAleatorioPro.bin";
                escribeLista(leeFicheroIntLista(f));
            }
            break;
            case 18:
            {
                String f = "18. escribeFicheroIntLista.bin";
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,2,9,6,1));
                escribeFicheroIntLista(f,li);
                leeFicheroInt(f);
            }
            break;
            case 19:
            {
                String f = "19. ordenaFicheroInt.bin";
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,2,9,6,1));
                escribeFicheroIntLista(f,li);
                ordenaFicheroInt(f);
                leeFicheroInt(f);

            }
            break;
            case 20:
            {
                String f = "20. ordenaFicheroInt.bin";
                List<Integer> liF = new LinkedList<>(Arrays.asList(-5,1,2,-9,-6,1));
                escribeFicheroIntLista(f,liF);
                separaFicheroInt(f);
                leeFicheroInt(f + "positivos");
                System.out.println();
                leeFicheroInt(f + "negativos");
            }
            break;
            case 21:
            {
                String f = "21. invierteFicheroInt.bin";
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,2,9,6,1));
                escribeFicheroIntLista(f,li);
                invierteFicheroInt(f);
                leeFicheroInt(f);
            }
            break;
        }
    }

    public static void escribeFichero1_100(String f)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i;

            for (i=1;i<=100;i++)
            {
                dos.writeInt(i);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroInt100(String f)
    {
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            int i, n;
            for (i=1;i<=100;i++)
            {
                n = dis.readInt();
                System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorio(String f, int n)
    {
        try
        {
            Random r = new Random();

            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i, x;
            for (i=1; i<=n;i++)
            {
                x = r.nextInt(100)+1;
                dos.writeInt(x);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void escribeFicheroIntAleatorioPro(String f, int n, int min, int max)
    {
        try
        {
            Random r = new Random();

            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i, x;
            for (i=1; i<=n;i++)
            {
                x = r.nextInt(max-min+1)+min;
                dos.writeInt(x);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void leeFicheroInt(String f)
    {
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            int n;
            while (dis.available() > 0)
            {
                n = dis.readInt();
                System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int sumaFicheriInt(String f)
    {
        int suma;
        suma = 0;
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                suma = suma + dis.readInt();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return suma;
    }

    public static void escribeLista(List<Integer> li)
    {
        int i;
        System.out.print("<");
        for (i=0; i<li.size();i++)
        {
            System.out.print(li.get(i));
            if (i!=li.size()-1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

    public static List<Integer> leeFicheroIntLista(String f)
    {
        List<Integer> liF = new LinkedList<>();
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                liF.add(dis.readInt());
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return liF;
    }

    public static void escribeFicheroIntLista(String f, List<Integer> li)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i;

            for (i=0; i<li.size();i++)
            {
                dos.writeInt(li.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void ordenaFicheroInt(String f)
    {
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            List<Integer> liF = new LinkedList<>();
            int i;

            while (dis.available() > 0)
            {
                liF.add(dis.readInt());
            }

            dis.close();
            fis.close();

            Collections.sort(liF);

            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i=0;i<liF.size();i++)
            {
                dos.writeInt(liF.get(i));
            }

            dos.close();
            fos.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void separaFicheroInt(String f)
    {
        try
        {
            List<Integer> liF = leeFicheroIntLista(f);

            FileOutputStream fosPos = new FileOutputStream(f + "positivos");
            DataOutputStream dosPos = new DataOutputStream(fosPos);
            FileOutputStream fosNeg = new FileOutputStream(f + "negativos");
            DataOutputStream dosNeg = new DataOutputStream(fosNeg);

            int i;

            for (i=0;i<liF.size();i++)
            {
                if(liF.get(i)<0)
                {
                    dosNeg.writeInt(liF.get(i));
                }
                else
                {
                    dosPos.writeInt(liF.get(i));
                }
            }

            dosNeg.close();
            fosNeg.close();
            dosPos.close();
            fosPos.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void invierteFicheroInt(String f)
    {
        try
        {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            List<Integer> liF = new LinkedList<>();
            int i;

            while (dis.available() > 0)
            {
                liF.add(dis.readInt());
            }

            dis.close();
            fis.close();

            Collections.reverse(liF);

            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i=0;i<liF.size();i++)
            {
                dos.writeInt(liF.get(i));
            }

            dos.close();
            fos.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
