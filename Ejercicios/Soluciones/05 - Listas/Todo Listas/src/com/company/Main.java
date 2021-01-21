package com.company;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println();
        System.out.println("Para ejercicios de la realciónes obligatorias elige del " +
                "1 al 18.");
        System.out.println("Para ejercicios adicionales elige del 19 al 24.");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                List<Integer> li = new LinkedList<>();
                leeLista(li);
            }
            break;
            case 2:
            {
                List<Integer> li = new LinkedList<>();
                int n = 5;
                leeListaN(li,n);
            }
            break;
            case 3:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,2,9,6,1));
                escribeLista(li);
            }
            break;
            case 4:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(-5,1,2,-9,6,1));
                escribeLista(eliminaNegativos(li));
            }
            break;
            case 5:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(-5,1,-2,9,-6,1));
                List<Integer> li1 = new LinkedList<>();
                List<Integer> li2 = new LinkedList<>();
                clasificaNumeros(li,li1,li2);
            }
            break;
            case 6:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,9,9,6,1,9));
                escribeLista(eliminaRepetidos(li));
            }
            break;
            case 7:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,2,9,6,1));
                escribeLista(ordenaListaSeleccion(li));
            }
            break;
            case 8:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(5,1,2,9,6,1));
                escribeLista(ordenaListaInsercion(li));
            }
            break;
            case 9:
            {
                List<String> li = new LinkedList<>(Arrays.asList("coco", "adamantium",
                        "metallica", "ballena"));
                escribeListaString(ordenaListaPalabras(li));
            }
            break;
            case 10:
            {
                List<String> li = new LinkedList<>(Arrays.asList("coco", "adamantium",
                        "metallica", "ballena"));
                escribeListaString(ordenaListaPalabras2(li));
            }
            break;
            case 11:
            {
                Integer [] a1 = {1,2,3,4,5,9,10};
                Integer [] a2 = {6,7,8};
                int p = 5;
                Integer [] a3 = insertaArrayEnArrayPro(a1,p,a2);
                escribeArray(a3);

            }
            break;
            case 12:
            {
                List<Integer> liR;
                liR = sorteoBonoloto();
                escribeLista(liR);
            }
            break;
            case 13:
            {
                Integer[] a = {5,1,5,2,9,6,6,6,1};
                Integer[] aR = eliminaRepetidosArray(a);
                escribeArray(aR);
            }
            break;
            case 14:
            {
                List<Integer> li1 = new LinkedList<>(Arrays.asList(2,3,7));
                List<Integer> li2 = new LinkedList<>(Arrays.asList(3,5,4));
                List<Integer> liR = unionListas(li1,li2);
                escribeLista(liR);
            }
            break;
            case 15:
            {
                List<Integer> li1 = new LinkedList<>(Arrays.asList(2,3,7));
                List<Integer> li2 = new LinkedList<>(Arrays.asList(3,5,4));
                List<Integer> liR = interseccionListas(li1,li2);
                escribeLista(liR);
            }
            break;
            case 16:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(1,1,2,5,6,9));
                List<Integer> liR = desordenaLista(li);
                escribeLista(liR);
            }
            break;
            case 17:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(3,2,2,3,3,2,9,6,3,2,6));
                escribeLista(modaLista(li));
            }
            break;
            case 18:
            {
                List<Double> li = new LinkedList<>(Arrays.asList(7.4,7.1,7.9,8.8,7.7,
                        9.0,8.2));
                System.out.println(puntuacionesTrampolin(li));

            }
            break;
            case 19:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(5, 5, 1, 2, 8, 3, 0,
                        3, 2, 2, 5, 7, 5));
                escribeLista(ordenaRepetidos(li));
            }
            break;
            case 20:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(5, 5, 1, 2, 8, 3, 0,
                        3, 2, 2, 5, 7, 5));
                System.out.print("Elementos únios: ");
                escribeLista(elementosUnicos(li));
                System.out.println();
                System.out.print("Elementos repetidos: ");
                escribeLista(elementosRepetidos(li));

            }
            break;
            case 21:
            {
                List<Integer> li = new LinkedList<>(Arrays.asList(1, 1, 2, 6, 0, 0,
                        5, 4));
                listaDominoDobles(li);
            }
            break;
            case 22:
            {
                String s = "Amanda tiene tres serpientes";
                escribeListaString(palabrasMismaLetra(s));
            }
            break;
            case 23:
            {
                String s = "Mi mamá me mima";
                int longMin = 4;
                escribeListaString(listaPalarasLargas(s, longMin));
            }
            break;
            case 24:
            {
                List<String> liLocal = new LinkedList<>(Arrays.asList("Jerez", "Tarifa", "Barbate"));
                List<Double> liTemp = new LinkedList<>(Arrays.asList(18.9,14.1,18.6));
                haceCalor(liLocal,liTemp);
            }
            break;
        }
    }

    public static void leeLista(List<Integer> li)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un entero o -1 para finalzar.");
        n = sc.nextInt();

        while (n!=-1)
        {
            li.add(n);
            System.out.println("Introduce otro.");
            n = sc.nextInt();
        }
    }

    public static void leeListaN(List<Integer> li, int n)
    {
        Scanner sc = new Scanner(System.in);
        int i, x;
        i=0;

        while (i<n)
        {
            System.out.println("Introduce un entero");
            x = sc.nextInt();
            li.add(x);
            i++;
        }
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

    public static void escribeListaDouble(List<Double> li)
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

    public static void escribeListaString(List<String> li)
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

    public static void escribeArray(Integer[] a)
    {
        int i;

        System.out.print("[");
        for (i=0; i<a.length-1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1] + "]");
    }

    public static List<Integer> eliminaNegativos(List<Integer> li)
    {
        int i;
        List<Integer> li2 = new LinkedList<>();
        for (i=0;i<li.size();i++)
        {
            if (li.get(i)>=0)
            {
                li2.add(li.get(i));
            }
        }
        return li2;
    }

    public static void clasificaNumeros(List<Integer> li,List<Integer> li1,List<Integer> li2 )
    {
        int i;

        for (i=0;i<li.size();i++)
        {
            if (li.get(i)<0)
            {
               li2.add(li.get(i));
            }
            else
            {
                li1.add(li.get(i));
            }
        }
        escribeLista(li1);
        System.out.println();
        escribeLista(li2);
    }

    public static List<Integer> eliminaRepetidos(List<Integer> li)
    {
        int i;
        List<Integer> li2= new LinkedList<>();
        for (i=0;i<li.size();i++)
        {
            if (!li2.contains(li.get(i)))
            {
                li2.add(li.get(i));
            }
        }
        return li2;
    }

    public static List<Integer> ordenaListaSeleccion(List<Integer> li)
    {
        List<Integer> liR = new LinkedList<>();
        int i,j, menor;

        while (li.size()>0)
        {
            menor=li.get(0);
            j=0;
            for (i=1;i<li.size();i++)
            {
                if (menor>li.get(i))
                {
                    j=i;
                    menor=li.get(i);
                }
            }
            liR.add(menor);
            li.remove(j);
        }
        return liR;
    }

    public static List<Integer> ordenaListaInsercion(List<Integer> li)
    {
        List<Integer> liR = new LinkedList<>();
        int i, j, mayor;
        mayor = li.get(0);
        j=0;
        for (i=1;i<li.size();i++)
        {
            if (mayor<li.get(i))
            {
                mayor=li.get(i);
                j=i;
            }
        }
        liR.add(mayor);
        li.remove(j);
        while (li.size()>0)
        {
            for (j=0;j<liR.size();j++)
            {
                if (li.get(0)<=liR.get(j))
                {
                    liR.add(j,li.get(0));
                    li.remove(0);
                    j=liR.size();
                }
            }
        }
        return liR;
    }

    public static List<String> ordenaListaPalabras(List<String> li)
    {
        List<String> liR = new LinkedList<>();
        int i,j;
        String menor;

        while (li.size()>0)
        {
            menor=li.get(0);
            j=0;
            for (i=1;i<li.size();i++)
            {
                if (menor.compareToIgnoreCase(li.get(i))>0)
                {
                    j=i;
                    menor=li.get(i);
                }
            }
            liR.add(menor);
            li.remove(j);
        }
        return liR;
    }

    public static List<String> ordenaListaPalabras2(List<String> li)
    {
        List<String> liR = new LinkedList<>();
        int i,j;
        String menor;

        while (li.size()>0)
        {
            menor=li.get(0);
            j=0;
            for (i=1;i<li.size();i++)
            {
                if (menor.length()>li.get(i).length())
                {
                    j=i;
                    menor=li.get(i);
                }
            }
            liR.add(menor);
            li.remove(j);
        }
        return liR;
    }

    public static Integer[] insertaArrayEnArrayPro(Integer[] a1, int p, Integer[] a2)
    {
        int i, j;
        j=p;
        Integer [] aR;
        List<Integer> li = new LinkedList<>(Arrays.asList(a1));
        for (i = 0; i < a2.length; i++)
        {
            li.add(j,a2[i]);
            j++;
        }
        aR = li.toArray(new Integer[0]);
        return aR;
    }

    public static List<Integer> sorteoBonoloto()
    {
        Random r = new Random();
        List<Integer> liBono= new LinkedList<>();
        List<Integer> liR= new LinkedList<>();
        int i, n;
        for (i=1;i<50;i++)
        {
            liBono.add(i);
        }
        i=0;
        while (i<6)
        {
            n = r.nextInt(liBono.size());
            liR.add(liBono.get(n));
            liBono.remove(n);
            i++;
        }
        return liR;
    }

    public static Integer[] eliminaRepetidosArray(Integer []a)
    {
        List<Integer> li = new LinkedList<>();
        int i;
        for (i=0; i<a.length;i++)
        {
            if (!li.contains(a[i]))
            {
                li.add(a[i]);
            }
        }
        Integer[] aR;
        aR = li.toArray(new Integer[0]);
        return aR;
    }

    public static List<Integer> unionListas(List<Integer> li1, List<Integer> li2)
    {
        List<Integer> liUnion = new LinkedList<>(li1);
        liUnion.addAll(li2);
        List<Integer> liR = eliminaRepetidos(liUnion);
        return liR;
    }

    public static List<Integer> interseccionListas(List<Integer> li1, List<Integer> li2)
    {
        int i;
        List<Integer> liR = new LinkedList<>();
        for (i=0;i<li1.size();i++)
        {
            if (li2.contains(li1.get(i)))
            {
                liR.add(li1.get(i));
            }
        }
        return liR;
    }

    public static List<Integer> desordenaLista(List<Integer> li)
    {
        Random r = new Random();
        int n;
        List<Integer> liR = new LinkedList<>();
        while (li.size()>0)
        {
            n = r.nextInt(li.size());
            liR.add(li.get(n));
            li.remove(n);
        }
        return liR;
    }

    public static List<Integer> modaLista(List<Integer> li)
    //Mejorada para casos en el que más de un número se repita las mismas veces
    {
        int nRep, i, j;
        Integer moda;
        List<Integer> liNum;
        List<Integer> liRep = new LinkedList<>();
        liNum = eliminaRepetidos(li);
        List<Integer> liModa = new LinkedList<>();
        for(i=0;i<liNum.size();i++)
        {
            nRep=0;
            for (j=0;j<li.size();j++)
            {
                if (liNum.get(i)==li.get(j))
                {
                    nRep++;
                }
            }
            liRep.add(nRep);
        }
        int max = Collections.max(liRep);
        moda = liNum.get(liRep.indexOf(max));
        liModa.add(moda);
        liRep.remove(liRep.indexOf(max));
        liNum.remove(moda);
        while (liRep.contains(max))
        {
            max = Collections.max(liRep);
            moda = liNum.get(liRep.indexOf(max));
            liModa.add(moda);
            liRep.remove(liRep.indexOf(max));
            liNum.remove(moda);
        }

        return liModa;
    }

    public static double puntuacionesTrampolin(List<Double> li)
    {
        double nota, max, min;
        int i, j;

        while (li.size()>5)
        {
            max = li.get(0);
            j=0;
            for (i=0;i<li.size();i++)
            {
                if (max<li.get(i))
                {
                    max = li.get(i);
                    j=i;
                }
            }
            li.remove(j);
        }

        while (li.size()>3)
        {
            min=li.get(0);
            j=0;
            for (i=0;i<li.size();i++)
            {
                if (min>li.get(i))
                {
                    min = li.get(i);
                    j=i;
                }
            }
            li.remove(j);
        }
        nota = li.get(0) + li.get(1) + li.get(2);
        return nota;
    }

    public static List<Integer> ordenaRepetidos(List<Integer> li)
    //- Una lista(liNum) con los números
    //- Otra lista(liRep) con las rep de cada número.
    //- Calcular el mayor de la liRep y añadir el número correspondiente a ese índice
    // a la lista resutado(liOrdenada) tantas veces como el valor de ese indice
    //- Por último eliminar ese número y su valor de rep. Repetir en bucle
    {
        List<Integer> liNum = eliminaRepetidos(li);
        List<Integer> liRep = new LinkedList<>();
        List<Integer> liOrdenada = new LinkedList<>();
        int i, j,nRep, mayor;

        for(i=0;i<liNum.size();i++)
        {
            nRep=0;
            for (j=0;j<li.size();j++)
            {
                if (liNum.get(i)==li.get(j))
                {
                    nRep++;
                }
            }
            liRep.add(nRep);
        }
        while (liNum.size()>0)
        {
            mayor = liRep.get(0);
            j = 0;
            for (i=0;i<liRep.size();i++)
            {
                if (mayor<liRep.get(i))
                {
                    j = i;
                    mayor = liRep.get(i);
                }
            }
            for (i=0;i<mayor;i++)
            {
                liOrdenada.add(liNum.get(j));
            }
            liNum.remove(j);
            liRep.remove(j);
        }
        return liOrdenada;
    }

    public static List<Integer> elementosUnicos(List<Integer> li)
    {
        List<Integer> liNum = eliminaRepetidos(li);
        List<Integer> liUnicos = new LinkedList<>();
        int i, j, nRep;
        for(i=0;i<liNum.size();i++)
        {
            nRep=0;
            for (j=0;j<li.size();j++)
            {
                if (liNum.get(i)==li.get(j))
                {
                    nRep++;
                }
            }
            if (nRep==1)
            {
                liUnicos.add(liNum.get(i));
            }
        }


        return liUnicos;
    }

    public static List<Integer> elementosRepetidos(List<Integer> li)
    {
        List<Integer> liNum = eliminaRepetidos(li);
        List<Integer> liRepetidos = new LinkedList<>();
        int i, j, nRep;
        for(i=0;i<liNum.size();i++)
        {
            nRep=0;
            for (j=0;j<li.size();j++)
            {
                if (liNum.get(i)==li.get(j))
                {
                    nRep++;
                }
            }
            if (nRep>1)
            {
                liRepetidos.add(liNum.get(i));
            }
        }
        return liRepetidos;
    }

    public static void listaDominoDobles(List<Integer> li)
    {
        int i;
        List<Integer> liDobles = new LinkedList<>();
        boolean error=false;

        for (i=0;i<li.size();i++)
        {
            if (li.get(i)>6 || li.get(i)<0)
            {
                error=true;
            }
        }
        if (!error)
        {
            if (li.size()%2!=0)
            {
                error=true;
            }
        }
        if (!error)
        {
            for (i=0;i<li.size();i=i+2)
            {
                if (li.get(i)==li.get(i+1))
                {
                    liDobles.add(li.get(i));
                    liDobles.add(li.get(i+1));
                }
            }
            escribeLista(liDobles);
        }
        else
        {
            System.out.println("Error");
        }
    }

    public static String quitaAcentos(String s) //sin la eñe
    {
        int i, j;
        String s2=s;
        String acentos="áéíóúüÁÉÍÓÚÜ";
        String sinAcentos="aeiouuAEIOUU";
        for (i=0;i<s2.length();i++)
        {
            j=0;
            while (j<acentos.length() && s2.charAt(i)!=acentos.charAt(j))
            {
                j++;
            }
            if (j<acentos.length())
            {
                s2=s2.substring(0,i) + sinAcentos.charAt(j) + s2.substring(i+1);
            }
        }
        return s2;
        /*int i, j;
        String s1=s;
        String acentos="áéíóúüñÁÉÍÓÚÜÑ";
        String sinAcentos="aeiouunAEIOUUN";
        for (i=0;i<s.length();i++)
        {
            for (j=0;j<acentos.length();j++)
            {
                if (s.charAt(i)==acentos.charAt(j))
                {
                    s1 = sustituyeCaracter(s1,acentos.charAt(j),sinAcentos.charAt(j));
                }
            }
        }
        return s1;*/
    }

    public static List<String> palabrasMismaLetra(String s)
    {
        String sSimple = s.toLowerCase();
        sSimple = quitaAcentos(sSimple);
        String[] sA = sSimple.split(" ");
        List<String> liS = new LinkedList<>();
        int i;
        for (i=0;i<sA.length;i++)
        {
            if (sA[i].charAt(0)==sA[i].charAt(sA[i].length()-1))
            {
                liS.add(sA[i]);
            }
        }
        return liS;
    }

    public static List<String> listaPalarasLargas(String s, int longMin)
    {
       String[] aS = s.split(" ");
       int i;
       List<String> liS = new LinkedList<>();
       for (i=0;i<aS.length;i++)
       {
           if (aS[i].length()>=longMin)
           {
               liS.add(aS[i]);
           }
       }
       return liS;
    }

    public static void haceCalor(List<String> liLocal, List<Double> liTemp)
    {
        int i;
        double suma, media;
        suma = 0;
        if (liTemp.size()==liLocal.size())
        {
            for (i=0;i<liTemp.size();i++)
            {
                suma = suma + liTemp.get(i);
            }
            media = suma / liTemp.size();
            for (i=0; i<liTemp.size();i++)
            {
                if (liTemp.get(i)<media)
                {
                    liTemp.remove(i);
                    liLocal.remove(i);
                    i--;
                }
            }
            escribeListaString(liLocal);
            System.out.println();
            escribeListaDouble(liTemp);
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
