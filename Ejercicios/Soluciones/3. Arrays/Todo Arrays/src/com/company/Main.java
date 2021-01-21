package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println();
        System.out.println("Ejercicios de las relacion 1, 2, 3 y 4 numerados del 1 al" +
                " 40. Los adicionales del 41 al 56.");
        System.out.println();
        System.out.println("Elige un ejercicio del 1 al 56: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int[] a = {1, 5, 9, 2, 7};
                escribeArray5(a);
            }
            break;

            case 2:
            {
                int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                escribeArray(a);
            }
            break;

            case 3:
            {
                int[] a = new int[5];
                leeArray5(a);
                escribeArray(a);
            }
            break;

            case 4:
            {
                int[] a = new int[10];
                leeArray(a);
                escribeArray(a);
            }
            break;

            case 5:
            {
                int[] a = new int[5];
                ponCeros5(a);
                escribeArray(a);
            }
            break;

            case 6:
            {
                int[] a = new int[10];
                ponCeros(a);
                escribeArray(a);
            }
            break;

            case 7:
            {
              int[] a = {1, 1, 1, 1, 1};
              System.out.println(sumaArray5(a));
            }
            break;

            case 8:
            {
                int[]a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
                System.out.println(sumaArray(a));
            }
            break;

            case 9:
            {
                int[]a = {11, 5, 5, 5, 5};
                System.out.println(mediaArray5(a));
            }
            break;

            case 10:
            {
                int[]a= {7, 10, 7, 10, 8, 9, 7};
                System.out.println(mediaArray(a));
            }
            break;

            case 11:
            {
                int []a= new int[7];
                rellenaEnOrden(a);
                escribeArray(a);
            }
            break;

            case 12:
            {
                int []a= new int[7];
                rellenaEnOrdenDesc(a);
                escribeArray(a);
            }
            break;

            case 13:
            {
                int[]a= new int[7];
                rellenaAleatorio(a);
                escribeArray(a);
            }
            break;

            case 14:
            {
                int[]a= {1,2,3,4,5};
                System.out.println(estaOrdenado(a));
            }
            break;

            case 15:
            {
                int[]a= {1,2,3,4,5};
                System.out.println(numeroImpares(a));
            }
            break;

            case 16:
            {
                int[]a= {7,5,3,1,5};
                System.out.println(minArray(a));
            }
            break;

            case 17:
            {
                int[]a= {5,2,4,7,1,9,3};
                System.out.println(maxArray(a));
            }
            break;

            case 18:
            {
                int[]a= {5,2,4,7,1,9,3};
                System.out.println(numeroAprovados(a));
            }
            break;

            case 19:
            {
                int[]a= {5,2,4,7,1,9,3};
                int limite = 4;
                System.out.println(porEncimaDe(a, limite));
            }
            break;

            case 20:
            {
                int[]a= {1,0,5,6,0,7,0,9,0};
                System.out.println(cuantosCeros(a));
            }
            break;

            case 21:
            {
                int[]a1= {1,2,3,4,5};
                int[]a2= {7,5,3,1,5};
                copiaArray(a1,a2);
                escribeArray(a2);
            }
            break;

            case 22:
            {
                int[]a1= {1,2,3,4,5};
                int[]a2= {7,5,3,1,5};
                copiaArrayInvertido(a1,a2);
                escribeArray(a2);
            }
            break;

            case 23:
            {
                int[]a1= {1,2,3,4,5};
                int[]a2= {7,5,3,1,5};
                int[]a3= new int[a1.length];
                sumaArrays(a1,a2,a3);
                escribeArray(a3);
            }
            break;

            case 24:
            {
                int[]a1= {1,2,3,4,5};
                int[]a2= {7,5,3,1,5};
                int[]a3= new int[a1.length];
                restaArrays(a1,a2,a3);
                System.out.println("Restado: ");
                escribeArray(a3);
                System.out.println();
                multiplicaArrays(a1,a2,a3);
                System.out.println("Multiplicado: ");
                escribeArray(a3);
                System.out.println();
                divideArrays(a1,a2,a3);
                System.out.println("Dividido: ");
                escribeArray(a3);
            }
            break;

            case 25:
            {
                int[]a={1,2,3,4,5,6};
                invierteArray(a);
                escribeArray(a);
            }
            break;

            case 26:
            {
                int[]a1={1,2,3,4,5,6};
                int[]a2={1,2,3,4,5,6};
                System.out.println(comparaArrays(a1,a2));
            }
            break;

            case 27:
            {
              double[]nota={3.5,9.5,5.3,4.7,8.0};
              boolean[]aprobados= new boolean[nota.length];
              ponNotasArray(nota,aprobados);
              escribeArrayBoolean(aprobados);
            }
            break;

            case 28:
            {
                int[]a1={4,5,6,7,8};
                int[]a2={1,1,2,2,3};
                int[]a3= new int[10];
                concatenaArray55(a1, a2, a3);
                escribeArray(a3);
            }
            break;

            case 29:
            {
                int[]a1={9,4,6,5};
                int[]a2={4,9,5,8,1};
                int[]a3= new int[a1.length+a2.length];
                concatenaArray(a1, a2, a3);
                escribeArray(a3);
            }
            break;

            case 30:
            {
                int[]a={1,2,3,4,5};
                int x= 3;
                System.out.println(contiene(a, x));
            }
            break;

            case 31:
            {
                int[]a={1,2,3};
                int[]b={4,5,6,7,2};
                int[]c = concatenaArrayPro(a,b);
                escribeArray(c);
            }
            break;

            case 32:
            {
                int[]a={1,2,3};
                int[]b= copiaArrayPro(a);
                escribeArray(b);
            }
            break;

            case 33:
            {
              int[]a={1,2,3,4,5};
              int valor = 7;
              int posicion= 4;
              int[]b= insertaEnArray(a, valor, posicion);
              escribeArray(b);
            }
            break;

            case 34:
            {
                int[]a={5,7,2,8,1};
                int posicion= 2;
                int[]b= borraDeArray(a, posicion);
                escribeArray(b);
            }
            break;

            case 35:
            {
                int[]a= {1,2,5,4,3,5};
                int valor= 5;
                int[]b=elimina1ElementoArray(a, valor);
                escribeArray(b);
            }
            break;

            case 36:
            {
                int[]a= {5,1,5,2,5,3,5};
                int valor= 5;
                int[]b=eliminaElementoArray(a, valor);
                escribeArray(b);
            }
            break;

            case 37:
            {
                int[]a= {1,2,3,9,10};
                int posicion=3;
                int[]b= {4,5,6,7,8};
                int[]c= insertaArrayEnArray(a,posicion,b);
                escribeArray(c);
            }
            break;

            case 38:
            {
               int[]a={3,6,2,8,9};
               int p1=1;
               int p2=3;
               int[]b=subArray(a,p1,p2);
               escribeArray(b);
            }
            break;

            case 39:
            {
                int[]a={3,6,2,8,9};
                int p1=1;
                int p2=3;
                int[]b=recortaArray(a,p1,p2);
                escribeArray(b);
            }
            break;

            case 40:
            {
                int[]a={3,9,4,6,8,1};
                int[] b=ordenBurbuja(a);
                escribeArray(b);
            }
            break;

            case 41:
            {
                int[]a={1,2,3,4,5,6};
                intercambiaParImpar(a);
                escribeArray(a);
            }
            break;

            case 42:
            {
                int[]a={5,5,6,5,8,6,6,6,4,5,2,2,7,3,0,7};
                System.out.println(compruebaTarjeta(a));
            }
            break;

            case 43:
            {
                int[]a={1,2,3,4,5,6};
                int n=-3;
                int[]b= tailArray(a,n);
                escribeArray(b);
            }
            break;

            case 44:
            {
                int[]a={0,1,2,3,4,5,6,7,5,5,5,5,5,8,9};
                System.out.println(detecta5(a));
            }
            break;

            case 45:
            {
                int n=10;
                boolean[]b=calculaNPrimos(n);
                escribeArrayBoolean(b);
            }
            break;

            case 46:
            {
                double[]a= {5.5,3.2,11,9.75,4.27,0,-2};
                escribeArrayNotas(a);
            }
            break;

            case 47:
            {
                int[]a={1,3,5,7};
                int[]b={1,2,3,4};
                tachaElementosNoComunes(a,b);
            }
            break;

            case 48:
            {
                int[]a={0,2,9,2,3,0,1,3};
                int[]b=eliminaRepetidos(a);
                escribeArray(b);
            }
            break;

            case 49:
            {
                double[]a={1.56,2.75,3,-9.9};
                double[]b=redondeaArray(a);
                escribeArrayDouble(b);

                double[]a2={1.56,2.75,3,9.9};
                double[]b2=decimalesArray(a2);
                escribeArrayDouble(b2);
            }
            break;

            case 50:
            {
                int[]a={5,1,2,9,6,1};
                int[]b=desordenaArray(a);
                escribeArray(b);
            }
            break;

            case 51:
            {
                int[]a={7,3,9,4,4,6};
                int[]b=minMaxArray(a);
                escribeArray(b);
            }
            break;

            case 52:
            {
                int[]a={7,3,9,-1,1,6};
                graficaBarras(a);
            }
            break;

            case 53:
            {
                int[]a={1,1,1,0,1,1,1,1,1,1,1,1,1,1,2,2,1,1};
                System.out.println(mejorRacha(a));
            }
            break;

            case 54:
            {
                numerosPrimosPro(1000);
            }
            break;

            case 55:
            {
                int[]a=new int[10];
                a=sucesionFibonacci(a);
                escribeArray(a);
            }
            break;

            case 56:
            {
                int[]r={4,8,2,8,3,2,6,9,1,5};
                String visitante= "Los Angeles Dodgers";
                String local= "Boston Red Sox";
                System.out.println(seriesMundiales(r,visitante,local));
            }
            break;

        }
    }

    public static void escribeArray5(int[] a)
    {
        int i;

        System.out.print("[");
        for (i=0; i<4; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[4] + "]");
    }

    public static void escribeArray(int[] a)
    {
        int i;

        System.out.print("[");
        for (i=0; i<a.length-1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1] + "]");
    }

    public static void escribeArrayDouble(double[] a)
    {
        int i;

        System.out.print("[");
        for (i=0; i<a.length-1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1] + "]");
    }

    public static void escribeArrayBoolean(boolean[] a)
    {
        int i;

        System.out.print("[");
        for (i=0; i<a.length-1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1] + "]");
    }

    public static void leeArray5(int[] a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor 0");
        a[0] = sc.nextInt();
        System.out.println("Introduce el valor 1");
        a[1] = sc.nextInt();
        System.out.println("Introduce el valor 2");
        a[2] = sc.nextInt();
        System.out.println("Introduce el valor 3");
        a[3] = sc.nextInt();
        System.out.println("Introduce el valor 4");
        a[4] = sc.nextInt();
    }

    public static void leeArray(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<a.length; i++)
        {
            System.out.println("Introduce el valor " + i + ".");
            a[i]= sc.nextInt();
        }
    }

    public static void leeArrayDouble(double[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<=a.length-1; i++)
        {
            System.out.println("Introduce el valor " + i + ".");
            a[i]= sc.nextDouble();
        }
    }

    public static void ponCeros5(int[] a)
    {
        int i;
        for (i=0; i<=4; i++)
        {
            a[i]= 0;
        }
    }

    public static void ponCeros(int[] a)
    {
        int i;
        for (i=0; i<=a.length-1; i++)
        {
            a[i]= 0;
        }
    }

    public static int sumaArray5(int[] a)
    {
        int i, suma;
        suma = 0;

        for (i=0; i<=4; i++)
        {
            suma = suma + a[i];
        }

        return suma;
    }

    public static int sumaArray(int[] a)
    {
        int i, suma;
        suma= 0;
        for (i=0; i<=a.length-1; i++)
        {
            suma= suma + a[i];
        }

        return suma;
    }

    public static double mediaArray5(int[] a)
    {
        double media;

        media = sumaArray(a) / 5.0;

        return media;
    }

    public static double mediaArray(int[]a)
    {
        double media;

        media = sumaArray(a)*1.0 / a.length;

        return media;
    }

    public static void rellenaEnOrden(int[] a)
    {
        int i;

        for (i=0; i<=a.length-1; i++)
        {
            a[i]= i+1;
        }
    }

    public static void rellenaEnOrdenDesc(int[]a)
    {
        int i,j;
        j= a.length;

        for (i=0; i<=a.length-1; i++)
        {
            a[i]= j;
            j--;
        }
    }

    public static void rellenaAleatorio(int[]a)
    {
        Random r = new Random();
        int i;

        for (i=0; i<=a.length-1; i++)
        {
            a[i]= r.nextInt(10) + 1;
        }
    }

    public static boolean estaOrdenado(int[]a)
    {
//        int i;
//        boolean resultado;
//        resultado = false;
//
//        for (i=0; i<=a.length-2; i++)
//        {
//            if (!(a[i] < a[i+1]))
//            {
//                resultado = false;
//                i = a.length;
//            }
//            else
//            {
//                resultado = true;
//
//            }
//        }
//        return resultado;

        int i = 1;
        boolean resultado = false;

        while (i < a.length && (a[i - 1] < a[i]))
        {
            resultado = true;
            i++;
        }

        if (i != a.length)
        {
            resultado = false;
        }

        return resultado;
    }

    public static int numeroImpares(int[]a)
    {
        int i, impares;
        impares=0;

        for (i=0; i<=a.length-1; i++)
        {
            if(!(a[i]%2==0))
            {
                impares = impares + 1;
            }
        }
        return impares;
    }

    public static int minArray(int[]a)
    {
        int i, menor;
        menor = a[0];

        for (i=0; i<=a.length-1; i++)
        {
            if (a[i] < menor)
            {
                menor= a[i];
            }
        }
        return menor;
    }

    public static int maxArray(int[]a)
    {
        int i, mayor;
        mayor = a[0];

        for (i=0; i<=a.length-1; i++)
        {
            if (a[i] > mayor)
            {
                mayor= a[i];
            }
        }
        return mayor;
    }

    public static int numeroAprovados(int[]a)
    {
        int i, aprobados;
        aprobados = 0;
        for (i=0; i<=a.length-1; i++)
        {
            if (a[i]>=5)
            {
                aprobados = aprobados + 1;
            }
        }
        return aprobados;
    }

    public static int porEncimaDe(int[]a, int limite)
    {
        int climite, i;
        climite=0;

        for(i=0; i<=a.length-1; i++)
        {
            if (a[i]>= limite)
            {
                climite= climite +1;
            }
        }
        return climite;
    }

    public static int cuantosCeros(int[]a)
    {
        int i, nCeros;
        nCeros=0;
        for (i=0; i<=a.length-1; i++)
        {
            if (a[i]==0)
            {
                nCeros=nCeros+1;
            }
        }
        return nCeros;
    }

    public static void copiaArray(int[]a1, int[]a2)
    {
        int i;
        if (a1.length == a2.length)
        {
            for (i=0; i<=a1.length-1; i++)
            {
                a2[i]=a1[i];
            }
        }
        else
        {
            System.out.println("ERROR: Los tamaños son diferentes");
        }
    }

    public static void copiaArrayInvertido(int[]a1, int[]a2)
    {
        int i, j;
        j=a1.length-1;

        if (a1.length == a2.length)
        {
            for (i=0; i<=a1.length-1; i++)
            {
                a2[i]=a1[j];
                j--;
            }
        }
        else
        {
            System.out.println("ERROR: Los tamaños son diferentes");
        }
    }

    public static void sumaArrays(int[]a1, int[]a2, int[]a3)
    {
        int i;

        if (a1.length == a2.length)
        {
            for (i=0; i<a1.length; i++)
            {
                a3[i]= a1[i] + a2[i];
            }
        }
        else
        {
            System.out.println("ERROR: Los tamaños son diferentes");
        }
    }

    public static void restaArrays(int[]a1, int[]a2, int[]a3)
    {
        int i;

        if (a1.length == a2.length)
        {
            for (i=0; i<a1.length; i++)
            {
                a3[i]= a1[i] - a2[i];
            }
        }
        else
        {
            System.out.println("ERROR: Los tamaños son diferentes");
        }
    }

    public static void multiplicaArrays(int[]a1, int[]a2, int[]a3)
    {
        int i;

        if (a1.length == a2.length)
        {
            for (i=0; i<a1.length; i++)
            {
                a3[i]= a1[i] * a2[i];
            }
        }
        else
        {
            System.out.println("ERROR: Los tamaños son diferentes");
        }
    }

    public static void divideArrays(int[]a1, int[]a2, int[]a3)
    {
        int i;

        if (a1.length == a2.length)
        {
            for (i=0; i<a1.length; i++)
            {
                a3[i]= a1[i] / a2[i];
            }
        }
        else
        {
            System.out.println("ERROR: Los tamaños son diferentes");
        }
    }

    public static void invierteArray(int[]a)
    {
        int i, j, t;
        j= a.length-1;
        for (i=0; i<a.length/2; i++)
        {
            t = a[i];
            a[i]=a[j];
            a[j] = t;
            j--;
        }
    }

    public static boolean comparaArrays(int[]a1, int[]a2)
    {
        int i;
        boolean resultado;

        if (a1.length == a2.length)
        {
            i=0;

            while (i<a1.length && a1[i] == a2[i])
            {
                i++;
            }

            if(i == a1.length) //resultado = (i == a1.length);
            {
                resultado = true;
            }
            else
            {
                resultado = false;
            }

        }
        else
        {
            resultado = false;
        }
        return resultado;
       /* int i;
        boolean resultado;
        resultado= true;

        if (a1.length == a2.length)
        {
            resultado= true;

            for (i=0; i<a1.length; i++)
            {
                if (a1[i] != a2[i])
                {
                    resultado=false;
                    i=a1.length;
                }

            }
        }
        else
        {
            resultado = false;
        }
        return resultado;*/
    }

    public static void ponNotasArray(double[]nota, boolean[]aprobados)
    {
        int i;

        for(i=0; i<nota.length; i++)
        {
            aprobados[i]= nota[i] >= 5;
        }
    }

    public static void concatenaArray55(int[]a1, int[]a2, int[]a3)
    {
        int i;
        for (i=0; i<a3.length; i++)
        {
            if (i<5)
            {
                a3[i]= a1[i];
            }
            else
            {
                a3[i]=a2[i-5];
            }
        }
    }

    public static void concatenaArray(int[]a1, int[]a2, int[]a3)
    {
        int i;

        for (i=0; i<a3.length; i++)
        {
            if (i<a1.length)
            {
                a3[i]= a1[i];
            }
            else
            {
                a3[i]=a2[i-a1.length];
            }
        }

    }

    public static boolean contiene(int[]a, int x)
    {
        int i=0;
        boolean resultado;

        while (i<a.length && a[i]!= x)
        {
            i++;
        }
        if(i<a.length)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    public static int[] concatenaArrayPro(int[]a, int[]b)
    {
        int [] c= new int[a.length+b.length];
        int i;

        for (i=0; i<c.length; i++)
        {
            if (i<a.length)
            {
                c[i]= a[i];

            }
            else
            {
                c[i]=b[i-a.length];
            }
        }
        return c;
    }

    public static int[] copiaArrayPro(int[] a)
    {
        int i;
        int[]b=new int[a.length];
        for (i=0; i<a.length;i++)
        {
            b[i]=a[i];
        }
        return b;
    }

    public static double[] copiaArrayProDouble(double[] a)
    {
        int i;
        double[] b = new double[a.length];
        for (i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        return b;
    }

    public static int[] insertaEnArray(int[]a, int valor, int posicion)
    {
        /*int i;
        int[]b= new int[a.length+1];
        for (i=0; i<b.length;i++)
        {
            if (i<posicion)
            {
                b[i]=a[i];
            }
            else
            {
                if (i==posicion)
                {
                    b[i]=valor;
                }
                else
                {
                    b[i]=a[i-1];
                }
            }
        }
        return b;*/

        int i, j;
        int[] r = new int[a.length + 1];

        for (i = 0, j = 0; i < r.length; i++)
        {
            if (i == posicion)
            {
                r[i] = valor;
            }
            else
            {
                r[i] = a[j];
                j++;
            }
        }

        return r;
    }

    public static int[] borraDeArray(int[]a, int posicion)
    {
        /*int i;
        int[]b= new int[a.length-1];
        for (i=0;i<b.length;i++)
        {
            if (i<posicion)
            {
                b[i]=a[i];
            }
            else
            {
                if (i==posicion)
                {
                    b[i]=a[i+1];
                }
                else
                {
                    b[i]=a[i+1];
                }
            }
        }
        return b;*/

        int i, j;
        int[] r = new int[a.length -1];

        j = 0;
        for (i = 0; i < a.length; i++)
        {
            if (i != posicion)
            {
                r[j] = a[i];
                j++;
            }
        }

        return r;
    }

    public static int[] elimina1ElementoArray(int[]a, int valor)
    {
        int i;
        int[]b;
        i=0;

        while (i<a.length && a[i]!=valor)
        {
            i++;
        }
        if (i<a.length)
        {
            b= borraDeArray(a,i);
        }
        else
        {
            b= a;
        }
        return b;
    }

    public static int[] eliminaElementoArray(int[]a, int valor)
    {
        int contadorValor, i, j;
        j=0;
        contadorValor=0;

        for(i=0; i<a.length;i++)
        {
            if(a[i]== valor)
            {
                contadorValor= contadorValor+ 1;
            }
        }
        int[]b= new int[a.length-contadorValor];
        i=0;
        while (i<a.length)
        {
            if (a[i]==valor)
            {
                i++;
            }
            else
            {
                b[j]=a[i];
                i++;
                j++;
            }
        }
        return b;
    }

    public static int[] insertaArrayEnArray(int[]a, int posicion, int[]b)
    {
        int[]c= new int[a.length+b.length];
        int i;


        for (i=0; i<c.length;i++)//intentar no poner muchos if dentro de un for
                                    // hacerlo con dos for
        {
            if (i<posicion)
            {
                c[i]=a[i];
            }
            else
            {
                if (posicion<=i && i<=posicion+b.length-1)
                {
                    c[i]=b[i-posicion];
                }
                else
                {
                    c[i]=a[i-b.length];
                }
            }
        }
        return c;
    }

    public static int[] subArray(int[]a, int p1, int p2)
    {
        int i, j;
        j=0;
        int[]b= new int[p2-p1+1];

        for (i=p1; i<=p2;i++)
        {
            b[j]= a[i];
            j++;
        }
        return b;
    }

    public static int[] recortaArray(int[]a, int p1, int p2)
    {
        int[]b=new int[a.length-(p2-p1+1)];
        int i, j;
        j=0;

        for (i=0;i<a.length;i++)
        {
            if (i<p1)
            {
                b[j]=a[i];
                j++;
            }
            if (i>p2)
            {
                b[j]=a[i];
                j++;
            }
        }

        return b;
    }

    public static int[] ordenBurbuja(int[]a)
    {
        int[]b= new int[a.length];
        int i,j,menor;

        for (i=0; i<a.length-1;i++)
        {
            for (j=0; j<a.length-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    menor=a[j+1];
                    a[j+1]=a[j];
                    a[j]=menor;
                }
            }
        }
        return a;
    }

    public static void intercambiaParImpar(int[]a)
    {
        int i,t;

        for(i=0;i<a.length;i=i+2)
        {
            t=a[i+1];
            a[i+1]=a[i];
            a[i]=t;
        }
    }

    public static boolean compruebaTarjeta(int[]a)
    {
        int[]b=copiaArrayPro(a);
        int i, suma;
        suma =0;
        boolean resultado;

        if (b.length!=16)
        {
            resultado=false;
        }
        else
        {

            for (i=0;i<b.length;i++)
            {
                if (i%2==0)
                {
                    b[i]=b[i]*2;
                    if (b[i]>=10)
                    {
                        b[i]= b[i] -9;
                    }
                }
                suma= suma + b[i];
            }
            if (suma%10==0)
            {
                resultado=true;
            }
            else
            {
                resultado= false;
            }
        }
        return resultado;
    }

    public static int[] tailArray(int[]a, int n)
    {
        int[]c;
        int i,j;

        if (n>a.length||n<0)
        {
            System.out.println("ERROR");
            c=a;
        }
        else
        {
            int[]b=new int[n];
            j=0;
            for (i=a.length-n;i<a.length;i++)
            {
                b[j]=a[i];
                j++;
            }
            c=b;
        }
        return c;
    }

    public static boolean detecta5(int[]a)
    {
        int i;
        boolean resultado;
        i=0;
        while (i<a.length-4 && !(a[i]==a[i+1] && a[i]==a[i+2] && a[i]==a[i+3] && a[i]==a[i+4]))
        {
            i++;
        }
        if (i==a.length-4)
        {
            resultado=false;
        }
        else
        {
            resultado=true;
        }
        return resultado;
    }

    public static boolean primo(int n)
    {
        int i;
        boolean resultado;
        resultado = false;
        for (i = 1; i < n; i++)
        {
            if (n % i == 0 && i != 1)
            {
                resultado = false;
                i = n;
            }
            else
            {
                resultado = true;
            }
        }
        return resultado;
    }

    public static boolean[] calculaNPrimos(int n)
    {
        boolean[]b=new boolean[n+1];
        int[]a=new int[n+1];
        int i;
        for (i=0; i<a.length;i++)
        {
            a[i]=i;
        }

        for (i=0;i<b.length;i++)
        {
            if (primo(a[i]))
            {
                b[i]=true;
            }
            else
            {
                b[i]=false;
            }
        }
        return b;
    }

    public static void escribeArrayNotas(double[]a)
    {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_WHITE = "\u001B[37m";
        int i;

        System.out.print(ANSI_WHITE + "[" + ANSI_RESET);
        for (i=0; i<a.length-1; i++)
        {
            if (5<=a[i] && a[i]<=10)
            {
                System.out.print(ANSI_GREEN + a[i] + ANSI_RESET + ANSI_WHITE + ", " + ANSI_RESET);
            }
            else
            {
                if (0<=a[i]&&a[i]<5)
                {
                    System.out.print(ANSI_RED + a[i] + ANSI_RESET + ANSI_WHITE + ", " + ANSI_RESET);
                }
                else
                {
                    System.out.print(ANSI_YELLOW + "ERROR" + ANSI_RESET + ANSI_WHITE + ", " + ANSI_RESET);
                }
            }
        }
        if (5<=a[i] && a[i]<=10)
        {
            System.out.print(ANSI_GREEN + a[i] + ANSI_RESET + ANSI_WHITE + "]" + ANSI_RESET);
        }
        else
        {
            if (0<=a[i]&&a[i]<5)
            {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + ANSI_WHITE + "]" + ANSI_RESET);
            }
            else
            {
                System.out.print(ANSI_YELLOW + "ERROR" + ANSI_RESET + ANSI_WHITE + "]" + ANSI_RESET);
            }
        }
    }

    public static void tachaElementosNoComunes(int[]a,int[]b)
    {
        int i, j;
        int[]a2=new int[a.length];
        int[]b2=new int[b.length];

        for (i=0;i<a.length;i++)
        {
            j=0;
            while (j<b.length && a[i]!=b[j])
            {
                j++;
            }
            if (j==b.length)
            {
                a2[i]=0;
            }
            else
            {
                a2[i]=a[i];
            }
        }
        for (i=0;i<b.length;i++)
        {
            j=0;
            while (j<a.length && b[i]!=a[j])
            {
                j++;
            }
            if (j==a.length)
            {
                b2[i]=0;
            }
            else
            {
                b2[i]=b[i];
            }
        }
        escribeArray(a);
        System.out.print(" y ");
        escribeArray(b);
        System.out.print(" => ");
        escribeArray(a2);
        System.out.print(" y ");
        escribeArray(b2);
    }

    public static int[] eliminaRepetidos(int[]a)
    {
        int[]b= new int[a.length];
        int i,j;
        j=0;
        for (i=0;i<a.length;i++)
        {
            if (i==0)
            {
                b[j]=a[0];
                j++;
            }
            else
            {
                if (!contiene(b,a[i]))
                {
                    b[j]=a[i];
                    j++;
                }
            }
        }
        b=subArray(b,0,j-1);
        return b;


        /*int[]b= new int[a.length];
        int i, j;
        j=0;
        for (i=0;i<a.length;i++)
        {
            if (contiene(b,a[i])) //hay que solucionar el problema de cuando un valor
                                  //sea 0, porque también lo elimina al final
            {
                b[j]=0;
                j++;
            }
            else
            {
                b[j]=a[i];
                j++;
            }
        }
        b=eliminaElementoArray(b,0);
        return b;*/


        /*int[]a2=copiaArrayPro(a);
        int i,j,k,l,contadorRepetidos;
        contadorRepetidos=0;
        l=0;
        for (i=1;i<a2.length;i++)
        {
            for (j=0;j<i;j++)
            {
                k=0;
                while (k<j && a2[k]!=a2[j])
                {
                    k++;
                }
                if(k==j && a[i]==a[j])
                {
                    contadorRepetidos=contadorRepetidos +1;
                }
            }
        }
        int[]b=new int[a2.length-contadorRepetidos];
        int[]p=new int[contadorRepetidos];
        for (i=1;i<a2.length;i++)
        {
            for (j=0;j<i;j++)
            {
                k=0;
                while (k<j && a2[k]!=a2[j])
                {
                    k++;
                }
                if(k==j && a[i]==a[j])
                {
                    p[l]=i;
                    l++;
                }
            }
        }
        if (contadorRepetidos==0)
        {
            b=a2;
        }
        else
        {
            l=0;
            for (i=0;i<p.length;i++)
            {
                if (i==0)
                {
                    b=borraDeArray(a2,p[i]);
                }
                else
                {
                    b=borraDeArray(b,p[i]-l);
                }
                l++;
            }
        }
        return b;*/
    }

    public static double[] redondeaArray(double[]a)
    {
        double[]b=new double[a.length];
        int i;

        for (i=0;i<b.length;i++)
        {
            b[i]=(int)(a[i]);
        }
        return b;
    }

    public static double[] decimalesArray(double[]a)
    {
        double[]b=new double[a.length];
        double[]r= redondeaArray(a);
        int i;

        for (i=0;i<b.length;i++)
        {
            b[i]= a[i] - r[i];
        }
        return b;
    }

    public static int[] desordenaArray(int[]a)
    {
        Random r= new Random();
        int[]b=new int[a.length];
        int[]aux= new int[a.length];
        int i,x;
        for(i=0;i<a.length;i++)
        {
            aux[i]=a.length;
        }
        for (i=0;i<a.length;i++)
        {
            x=r.nextInt(a.length);
            while (contiene(aux,x))
            {
                x=r.nextInt(a.length);
            }
            aux[i]=x;
            b[i]=a[aux[i]];
        }
        return b;
    }

    public static int[] minMaxArray(int[]a)
    {
        int i,j, min, max;

        min=minArray(a);
        max=maxArray(a);
        int[]b=new int[max-min +1];
        j=min;
        for (i=0;i<b.length;i++)
        {
            b[i]=j;
            j++;
        }
        return b;
    }

    public static void graficaBarras(int[]a)
    {
        int i,j;

        i=0;
        while (i<a.length && 0<=a[i] && a[i]<=10)
        {
            i++;
        }
        if (i==a.length)
        {
            for (i=0;i<a.length;i++)
            {
                System.out.print(a[i] + " ");
                for (j=0;j<a[i];j++)
                {
                    System.out.print("█");
                }
                System.out.println();
            }

        }
        else
        {
            System.out.println("ERROR: nota numero " + (i+1) + " incorrecta.");
        }

    }

    public static int mejorRacha(int[]a)
    {
        //hacerlo para numero maximo de victorias
        //este es para numero maximo de racha
        int i,j,racha, maxRacha;
        j=3;
        racha=1;
        maxRacha=0;
        for (i=2;i<a.length-1;i=i+2)
        {
            if (a[i-2]>a[j-2] && a[i]>a[j])
            {
                racha++;
                if (racha>maxRacha)
                {
                    maxRacha=racha;
                }
            }
            else
            {
                racha=1;
            }
            j=j+2;
        }
        return maxRacha;
    }

    public static void numerosPrimosPro(int a)
    {
        int[]b=new int[a+1];
        int i,j;
        b[0]=-1;
        b[1]=-1;
        for(i=2;i<b.length;i++)
        {
            if (b[i]==0)
            {
                b[i]=i;
                for (j=i+1;j<b.length;j++)
                {
                    if (j%i==0)
                    {
                        b[j]=-1;
                    }
                }
            }
        }
        b=eliminaElementoArray(b,-1);
        escribeArray(b);
    }

    public static int[] sucesionFibonacci(int[]a)
    {
        int i;
        a[0]=0;
        a[1]=1;
        for (i=2;i<a.length;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        return a;
    }

    public static String seriesMundiales (int a[], String visitante, String local)
    {
        int i;
        boolean error = false;
        int viclocal = 0, vicvisitante =0;
        String resultado = "";
        if (a.length %2 != 0)
        {
            error=true;
        }
        else
        {
            if ((a.length/2) %2  == 0)
            {
                error = true;
            }
            else
            {
                for (i=0;i<a.length;i = i + 2)
                {
                    if (a[i] == a[i + 1])
                    {
                        error = true;
                    }
                }
            }
        }
        if (!error)
        {
            for (i=0;i<a.length;i=i+2)
            {
                if (a[i]>a[i+1])
                {
                    vicvisitante++;
                }
                else
                {
                    viclocal++;
                }
            }
            if (viclocal > vicvisitante)
            {
                resultado = local;
            }
            else
            {
                resultado = visitante;
            }
        }
        else
        {
            resultado="ERROR";
        }
        return resultado;
    }
}
