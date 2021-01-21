package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println();
        System.out.println("Para ejercicios de la realciónes obligatorias elige del " +
                "1 al 20.");
        System.out.println("Para ejercicios adicionales elige del 21 al 31.");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String s= " The story of the universe carried on waves of light ";
                System.out.println(numeroEspacios(s));
            }
            break;
            case 2:
            {
                String s= "The stÓry of thE Üniverse carried on waves of light";
                System.out.println(numeroVocales(s));
            }
            break;
            case 3:
            {
                String s="reconocer";
                System.out.println(esPalindromo(s));
            }
            break;
            case 4:
            {
                String s="reconocer";
                char c= 'o';
                System.out.println(contiene(s,c));
            }
            break;
            case 5:
            {
                char c= 'X';
                int n = 5;
                System.out.println(repiteCaracter(c,n));
            }
            break;
            case 6:
            {
                String s="patata";
                int l=10;
                System.out.println(padLeft(s,l));
                System.out.println(padRight(s,l));
            }
            break;
            case 7:
            {
                String s=" Patata Pa Come ";
                System.out.println(quitaEspacios(s));
            }
            break;
            case 8:
            {
                String s="  Patata Pa Come  ";
                System.out.println(quitaEspaciosTrim(s));
            }
            break;
            case 9:
            {
                String s="Patata Pa Come";
                char c1 = 'a';
                char c2 = 'i';
                System.out.println(sustituyeCaracter(s,c1,c2));
            }
            break;
            case 10:
            {
                String s=" patata  pa   come ";
                System.out.println(cuentaPalabras(s));
            }
            break;
            case 11:
            {
                String s="512961";
                System.out.println(esNumero(s));
            }
            break;
            case 12:
            {
                String s="patata pa come";
                char c= 'a';
                System.out.println(quitaCaracter(s, c));
            }
            break;
            case 13:
            {
                String s="pátátÁ pa cÓme";
                System.out.println(quitaAcentos(s));
            }
            break;
            case 14:
            {
                String s="roma";
                System.out.println(invierteCardena(s));
            }
            break;
            case 15:
            {
                String s="papa pa come";
                char c='a';
                System.out.println(vecesCaracter(s,c));
            }
            break;
            case 16:
            {
                String s="patata pa come pa";
                String p="pa";
                System.out.println(vecesPalabra(s,p));
            }
            break;
            case 17:
            {
                String s="patata pa come";
                System.out.println(mayusculasPrimera(s));
            }
            break;
            case 18:
            {
                String s="patata pa come pa la gente";
                String pQuita= "pa";
                String pPon="para";
                System.out.println(sustituyePalabra(s,pQuita,pPon));
            }
            break;
            case 19:
            {
                String s="patata pa come pa la gente";
                System.out.println(inviertePalabras(s));
            }
            break;
            case 20:
            {
                String s="   patata   pa     come pa   la  gente  ";
                System.out.println(quitaEspaciosSobrantes(s));
            }
            break;
            case 21:
            {
                String s="patata pa come pa la gente pa come";
                String sb="pa come";
                System.out.println(marcaSubCadena(s,sb));
            }
            break;
            case 22:
            {
                String s="Morgado Guerrero Estela Rubio Fernández Anhur Beato García " +
                        "Adrián";
                escribrNombres(s);

            }
            break;
            case 23:
            {
                String s="El veloz murciélago hindú comía feliz cardillo y kiwi. La" +
                        " cigüeña tocaba el saxofón detrás del palenque de paja. El " +
                        "pingüino Wenceslao hizo kilómetros bajo exhaustiva lluvia y" +
                        " frío, añoraba a su querido cachorro. Le gustaba cenar un " +
                        "exquisito sándwich de jamón con zumo de piña y vodka fría.";
                int[]a=cuentaLetras(s);
                escribeArray(a);
            }
            break;
            case 24:
            {
                int opciones24;
                System.out.println("Elige:");
                System.out.println();
                System.out.println("• 1 = Todas las letras en minúsculas.\n" +
                        "• 2 = Todas las letras en mayúsculas.\n" +
                        "• 3 = La primera letra de cada palabra en mayúsculas y el resto en minúsculas.\n" +
                        "• 4 = La primera letra de cada frase en mayúsculas y el resto en minúsculas.");
                opciones24=sc.nextInt();
                String s="primera ¿fRase\nsegunda. fRase\ntercera ¡fRase";
                System.out.println(mayusculasMinusculas(s,opciones24));
            }
            break;
            case 25:
            {
                String s="<p>Esto es texto normal <b>y esto es texto en negrita</b>.</p>";
                System.out.println(eliminaTags(s));
            }
            break;
            case 26:
            {
                String s="hola,don,pepito,pasó,usted,ya,por,casa";
                System.out.println(ordenaPalabrasComas(s));
            }
            break;
            case 28:
            {
                String s="Amanda tiene tres serpientes";
                String[] a=palabrasMismaLetra(s);
                escribeArrayString(a);
            }
            break;
            case 30:
            {
                String s="Hola, ¿qué tal? Soy amigo de Poti-Poti.";
                System.out.println(limpiaCadena(s));
            }
            break;


        }
    }

    public static int numeroEspacios(String s)
    {
        int i, espacios;
        espacios=0;
        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            {
                espacios++;
            }
        }
        return espacios;
    }

    public static int numeroVocales(String s)
    {
        int i,j,cVocales;
        cVocales=0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
        for(i=0;i<s.length();i++)
        {
            for (j=0;j<vocales.length();j++)
            {
                if (s.charAt(i)==vocales.charAt(j))
                {
                    cVocales++;
                }
            }
        }
        return cVocales;
    }

    public static boolean esPalindromo(String s)
    {
        int i, j;
        boolean resultado;
        i=0;
        j=s.length()-1;
        while (i<(s.length()/2) && s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        if (i==(s.length()/2))
        {
            resultado=true;
        }
        else
        {
            resultado=false;
        }
        return resultado;
    }

    public static boolean contiene(String s, char c)
    {
        int i;
        boolean resultado;

        i=0;
        while (i<s.length() && s.charAt(i)!=c)
        {
            i++;
        }
        if (i==s.length())
        {
            resultado=false;
        }
        else
        {
            resultado=true;
        }
        return resultado;
    }

    public static String repiteCaracter(char c, int n)
    {
        int i;
        String s="";
        for (i=0; i<n; i++)
        {
            s = s + c;
        }
        return s;
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

    public static String quitaEspacios(String s)
    {
        String s1 ="";
        int i;
        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
            {
                s1 = s1 + s.charAt(i);
            }
        }
        return s1;
    }

    public static String quitaEspaciosTrim(String s)
    {
        int i, j, k;
        String s1="";
        i=0;
        while (i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        j=s.length()-1;
        while (j>0 && s.charAt(j)==' ')
        {
            j--;
        }
        for (k=i;k<=j;k++)
        {
            s1 = s1 + s.charAt(k);
        }
        return s1;
    }

    public static String sustituyeCaracter(String s, char c1, char c2)
    {
        String s1="";
        int i;

        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)==c1)
            {
                s1 = s1 + c2;
            }
            else
            {
                s1= s1 + s.charAt(i);
            }
        }
        return s1;
    }

    public static int cuentaPalabras(String s)
    {
        int i, huecos, nPalabras;
        huecos=0;
        String s1= quitaEspaciosTrim(s);
        if (s1.length()==0)
        {
            nPalabras=0;
        }
        else
        {
            i=0;
            for (i=0;i<s1.length();i++)
            {
                if (s1.charAt(i)!=' ')
                {
                    i=s1.length();
                }
            }
            while (i<s1.length() && s1.charAt(i)==' ')
            {
                i++;
            }
            if (i==s1.length())
            {
                nPalabras=0;
            }
            else
            {
                for (i=1;i<s1.length();i++)
                {
                    if (s1.charAt(i-1)==' ' && s1.charAt(i)!=' ')
                    {
                        huecos++;
                    }
                }
                nPalabras= huecos +1;
            }
        }
        return nPalabras;
    }

    public static boolean esNumero(String s)
    {
        boolean resultado;
        int i;
        i=0;
        while (i<s.length() && Character.isDigit(s.charAt(i)))
        {
            i++;
        }
        if (i==s.length())
        {
            resultado=true;
        }
        else
        {
            resultado=false;
        }
        return resultado;
    }

    public static String quitaCaracter(String s, char c)
    {
        String s1 ="";
        int i;
        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=c)
            {
                s1 = s1 + s.charAt(i);
            }
        }
        return s1;
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

    public static int vecesCaracter(String s, char c)
    {
        int i, nVeces;
        nVeces=0;

        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)==c)
            {
                nVeces++;
            }
        }
        return nVeces;
    }

    public static int vecesPalabra(String s, String p)
    {
        int i, j, nVeces;
        nVeces=0;
        String s2;
        s=' ' + quitaEspaciosTrim(s) + ' ';
        p=' ' + quitaEspaciosTrim(p) + ' ';

        i=0;
        for (j=p.length();j<=s.length();j++)
        {
            s2= s.substring(i,j);
            if (s2.contains(p))
            {
                nVeces++;
            }
            i++;
        }
        return nVeces;
    }

    public static String mayusculasPrimera(String s)
    {
        int i;
        String s2=' '+ s;

        for (i=1;i<s2.length();i++)
        {
            if ((s2.charAt(i-1)==' ' || s2.charAt(i-1)=='\n') && Character.isLowerCase(s2.charAt(i)))
            {
                s2=s2.substring(0,i) + Character.toUpperCase(s2.charAt(i)) + s2.substring(i+1);
            }
        }
        s2=quitaEspaciosTrim(s2);
        return s2;
    }

    public static String sustituyePalabra(String s, String p1, String p2)
    {
        int i, j;
        String s2=s;
        String s3;
        s2=' ' + quitaEspaciosTrim(s2) + ' ';
        p1=' ' + quitaEspaciosTrim(p1) + ' ';
        p2=' ' + quitaEspaciosTrim(p2) + ' ';

        i=0;
        for (j=p1.length();j<=s2.length();j++)
        {
            s3= s2.substring(i,j);
            if (s3.contains(p1))
            {
                s2=s2.substring(0,i) + p2 + s2.substring(j);
            }
            i++;
        }
        s2=quitaEspaciosTrim(s2);
        return  s2;
    }

    public static String inviertePalabras(String s)
    {
        int i, pi, pf;
        pi=0;
        String s2=s;
        String p;
        s2=' '+quitaEspaciosTrim(s2)+' ';
        for (i=1;i<s2.length();i++)
        {
            if (s2.charAt(i-1)==' ' && s2.charAt(i)!=' ')
            {
                pi=i-1;
            }
            if (s2.charAt(i-1)!=' ' && s2.charAt(i)==' ')
            {
                pf=i;
                p=s2.substring(pi,pf);
                p=invierteCardena(p);
                s2=s2.substring(0,pi) + p + s2.substring(pf);
            }
        }
        s2=quitaEspaciosTrim(s2);
        return s2;
    }

    public static String quitaEspaciosSobrantes(String s)
    {
        String s2="";
        int i;
        s=quitaEspaciosTrim(s);
        s2= s2 + s.charAt(0);
        for (i=1;i<s.length();i++)
        {
            if (s.charAt(i)!=' ' || (s.charAt(i)==' ' && s.charAt(i-1)!=' '))
            {
                s2= s2 + s.charAt(i);
            }
        }

        return s2;
    }

    public static String marcaSubCadena(String s, String sb)
    {
        int i, j;
        String s2;
        String s3="";
        j=sb.length();
        for (i=0;i<s.length();i++)
        {
            if (j<=s.length())
            {
                s2= s.substring(i,j);
                if (s2.contains(sb))
                {
                    s3=s3 + '*';
                }
                else
                {
                    s3=s3 + s.charAt(i);
                }
            }
            else
            {
                s3=s3 + s.charAt(i);
            }
            j++;
        }
        return s3;
    }

    public static void escribrNombres(String s)
    {
        int i, pi, pf, nPalabra;
        pi=0;
        nPalabra=0;
        String nombre;
        String apellido1="";
        String apellido2="";
        s=' ' + quitaEspaciosTrim(s) + ' ';

        for (i=1;i<s.length();i++)
        {
            if (s.charAt(i-1)==' ' && s.charAt(i)!=' ')
            {
                pi=i;
            }
            if (s.charAt(i-1)!=' ' && s.charAt(i)==' ')
            {
                pf=i;
                if (nPalabra%3==0)
                {
                    apellido1=s.substring(pi,pf);
                }
                if (nPalabra==1 || nPalabra%3==1)
                {
                    apellido2=s.substring(pi,pf);
                }
                if (nPalabra==2 || nPalabra%3==2)
                {
                    nombre=s.substring(pi,pf);
                    System.out.println(nombre + ' ' + apellido1 + ' ' + apellido2);
                }
                nPalabra++;
            }
        }
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

    public static void escribeArrayString(String[] a)
    {
        int i;

        System.out.print("[");
        for (i=0; i<a.length-1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1] + "]");
    }

    public static int[] cuentaLetras(String s)
    {
        int[] a= new int[27];
        int i,j;
        String abc="abcdefghijklmnñopqrstuvwxyz";
        s= quitaAcentos(s);
        s=s.toLowerCase();

        for (i=0;i<s.length();i++)
        {
            j=0;
            while (j<abc.length() && s.charAt(i)!=abc.charAt(j))
            {
                j++;
            }
            if (j<abc.length())
            {
                a[j]= a[j] + 1;
            }
        }
        return a;
    }

    public static String mayusculasMinusculas(String s, int n)
    {
        String s2="";
        switch (n)
        {
            case 1:
            {
                s2= s.toLowerCase();
            }
            break;
            case 2:
            {
                s2= s.toUpperCase();
            }
            break;
            case 3:
            {
                s2= s.toLowerCase();
                s2= mayusculasPrimera(s2);
            }
            break;
            /*case 4: //mayus despues de .?! etc
            {
                String s3= s.toLowerCase();
                for (int i=0;i<s.length();i++)
                {
                    if (i==0)
                    {
                        s2= s2 + Character.toUpperCase(s3.charAt(i));
                    }
                    else
                    {
                        if (s3.charAt(i-1)=='\n' || s3.charAt(i-1)=='?' || s3.charAt(i-2)=='.' || s3.charAt(i-1)=='¡')
                        {
                            s2=s2 + Character.toUpperCase(s3.charAt(i));
                        }
                        else
                        {
                            s2=s2 + s3.charAt(i);
                        }
                    }
                }
            }
            break;*/

        }
        return s2;
    }

    public static String eliminaTags(String s)
    {
        int i;
        String s2="";

        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='<')
            {
                while (s.charAt(i)!='>')
                {
                    i++;
                }
            }
            else
            {
                s2=s2+s.charAt(i);
            }
        }
        return s2;
    }

    public static String ordenaPalabrasComas(String s)
    {
        String[] sA= s.split(",");
        int i, j;
        String menor;

        for (i=0; i<sA.length-1;i++)
        {
            for (j=0; j<sA.length-1;j++)
            {
                if (sA[j].compareTo(sA[j+1])>0)
                {
                    menor=sA[j+1];
                    sA[j+1]=sA[j];
                    sA[j]=menor;
                }
            }
        }
        String s2 = String.join(",",sA);
        return s2;
    }

    public static String[] subArrayString(String[]a, int p1, int p2)
    {
        int i, j;
        j=0;
        String[]b= new String[p2-p1+1];
        for (i=p1; i<=p2;i++)
        {
            b[j]= a[i];
            j++;
        }
        return b;
    }

    public static String[] palabrasMismaLetra(String s)
    {
        s=quitaAcentos(s);
        s=s.toLowerCase();
        String[] sA= s.split(" ");
        String[] sA2=new String[sA.length];
        int i,j;
        j=0;
        for (i=0;i<sA.length;i++)
        {
            if (sA[i].charAt(0)==sA[i].charAt(sA[i].length()-1))
            {
                sA2[j]=sA[i];
                j++;
            }
        }
        sA2= subArrayString(sA2,0,j-1);
        return sA2;
    }

    public static String limpiaCadena(String s)
    {
        String letras="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZáéíóúüÁÉÍÓÚÜ";
        int i, j;
        String s2="";

        for (i=0;i<s.length();i++)
        {
            j=0;
            while (j<letras.length() && s.charAt(i)!=letras.charAt(j))
            {
                j++;
            }
            if (j<letras.length())
            {
                s2=s2 + s.charAt(i);
            }
            else
            {
                s2=s2 + " ";
            }
        }
        s2= quitaEspaciosSobrantes(s2);
        return s2;
    }
}
