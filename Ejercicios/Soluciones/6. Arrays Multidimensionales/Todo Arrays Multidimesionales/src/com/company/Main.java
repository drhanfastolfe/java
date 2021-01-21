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
                "1 al 15.");
        System.out.println("Para ejercicios adicionales elige del 16 al 20.");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int[][] a = {{55555,6446,3222},{333,-8654,55555},{54,246,-654}};
                escribeArray3x3(a);
            }
            break;
            case 2:
            {
                int[][] a = new int[3][3];
                escribeArray3x3(rellena3x3(a));
            }
            break;
            case 3:
            {
                int[][] a = new int[3][3];
                escribeArray3x3(rellenaAleatorio3x3(a));
            }
            break;
            case 4:
            {
                int[][] a = {{9,8,7},{6,5,4},{3,2,1}};
                System.out.println(sumaArray3x3(a));
            }
            break;
            case 5:
            {
                int[][] a = {{55555,6446,3222},{333,-8654,55555},{54,246,-654}};
                escribeArrayBi(a);

            }
            break;
            case 6:
            {
                int [][] a = new int[4][4];
                escribeArrayBi(rellenaAleatorioBi(a));
            }
            break;
            case 7:
            {
                int [][] a = new int[4][4];
                escribeArrayBi(rellenaEnOrdenBi(a));
            }
            break;
            case 8:
            {
                int[][] a = new int[5][5];
                a = rellenaEnOrdenBi(a);
                System.out.println(sumaArrayBi(a));
            }
            break;
            case 9:
            {
                int[][] a1 = new int[3][3];
                int[][] a2 = new int[3][3];
                int[][] a3 = new int[3][3];
                a1 = rellenaEnOrdenBi(a1);
                a2 = rellenaEnOrdenBi(a2);
                a3 = rellenaEnOrdenBi(a3);
                System.out.println(suma2ArrayBi(a1,a2,a3));
            }
            break;
            case 10:
            {
                int[][] a = {{5,2,8},{5,1,2},{9,6,1}};
                int[][] a1 = new int[a.length][a[0].length];
                escribeArrayBi(copiaArrayBi(a,a1));
            }
            break;
            case 11:
            {
                int[][] a = {{5,2,8},{5,1,2},{9,6,1},{2,3,1}};
                int[][] a1 = copiaArrayBiPro(a);
                escribeArrayBi(a1);
            }
            break;
            case 12:
            {
               int[][] a = new int[8][8];
               a = rellenaArrayAjedrez(a);
               escribeArrayBi(a);
            }
            break;
            case 13:
            {
                int[][] a = new int[4][4];
                a = rellenaDiagonal(a);
                escribeArrayBi(a);
            }
            break;
            case 14:
            {
                int[][] a = new int[5][5];
                a = rellenaX(a);
                escribeArrayBi(a);
            }
            break;
            case 15:
            {
                int[][] a = new int[6][6];
                a = rellenaCuadrados(a);
                escribeArrayBi(a);
            }
            break;
            case 16:
            {
                int[][] a = new int[4][4];
                a = rellenaEnOrdenBi(a);
                escribeArrayBi(a);
                System.out.println();
                a = invierteBi(a);
                escribeArrayBi(a);
            }
            break;
            case 17:
            {
                int[][] a = new int[3][3];
                a = rellenaEnOrdenBi(a);
                escribeArrayBi(a);
                System.out.println("DET= " + calculaDeterminante(a));
            }
            break;
            case 18:
            {
                int[][] a = {{4,9,2},{3,5,7},{8,1,6}};
                System.out.println(cuadradoMagico(a));
            }
            break;
            case 19:
            {
                int[][] a = {{4,2,9,8,1,3,5,6,7},
                             {5,1,6,4,7,2,9,3,8},
                             {7,8,3,6,5,9,2,4,1},
                             {6,7,2,1,3,4,8,5,9},
                             {3,9,5,2,8,6,1,7,4},
                             {8,4,1,7,9,5,6,2,3},
                             {1,5,8,3,6,7,4,9,2},
                             {9,3,4,5,2,8,7,1,6},
                             {2,6,7,9,4,1,3,8,5}};
                //System.out.println(compruebaSudoku(a));
            }
            break;
            case 20:
            {
            }
            break;
        }
    }

    public static void escribeArray3x3(int[][] a)
    {
        int i, j, k, esp;
        esp = numeroCharMayor(a);

        for (i=0;i<a.length;i++)
        {
            System.out.print("[");
            for (j=0;j<a[i].length;j++)
            {
                for (k=0;k<esp-numeroChar(a[i][j]);k++)
                {
                    System.out.print(" ");
                }

                System.out.print(a[i][j]);
                if (j!=a[i].length-1)
                {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static int numeroCharMayor(int[][] a)
    {
        String[] aS = new String[a.length * a[0].length];
        int i, j, k, mayor;
        k=0;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                aS[k]=String.valueOf(a[i][j]);
                k++;
            }
        }
        mayor = aS[0].length();
        for (i=0;i<aS.length;i++)
        {
            if (aS[i].length()>mayor)
            {
                mayor = aS[i].length();
            }
        }
        return mayor;
    }

    public static int numeroChar(int n)
    {
        int nChar = String.valueOf(n).length();
        return nChar;
    }

    public static int[][] rellena3x3(int[][] a)
    {
        int i, j, n;
        n=1;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                a[i][j]=n;
                n++;
            }
        }
        return a;
    }

    public static int[][] rellenaAleatorio3x3(int[][] a)
    {
        Random r = new Random();
        int i, j, n;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                n = r.nextInt();
                a[i][j]=n;
            }
        }
        return a;
    }

    public static int sumaArray3x3(int[][] a)
    {
        int i, j, suma;
        suma = 0;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    public static void escribeArrayBi(int[][] a)
    {
        int i, j, k, esp;
        esp = numeroCharMayor(a);

        for (i=0;i<a.length;i++)
        {
            System.out.print("[");
            for (j=0;j<a[i].length;j++)
            {
                for (k=0;k<esp-numeroChar(a[i][j]);k++)
                {
                    System.out.print(" ");
                }

                System.out.print(a[i][j]);
                if (j!=a[i].length-1)
                {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static int[][] rellenaAleatorioBi(int[][] a)
    {
        Random r = new Random();
        int i, j, n;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                n = r.nextInt();
                a[i][j]=n;
            }
        }
        return a;
    }

    public static int[][] rellenaEnOrdenBi(int[][] a)
    {
        int i, j, n;
        n=1;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                a[i][j]=n;
                n++;
            }
        }
        return a;
    }

    public static int sumaArrayBi(int[][] a)
    {
        int i, j, suma;
        suma = 0;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    public static int suma2ArrayBi(int[][] a1, int[][] a2, int[][] a3)
    {
        int i, j, suma1, suma2, suma3, sumaTotal;
        suma1 = 0;
        suma2 = 0;
        suma3 = 0;
        for (i=0;i<a1.length;i++)
        {
            for (j=0;j<a1[i].length;j++)
            {
                suma1 = suma1 + a1[i][j];
            }
        }
        for (i=0;i<a2.length;i++)
        {
            for (j=0;j<a2[i].length;j++)
            {
                suma2 = suma2 + a2[i][j];
            }
        }
        for (i=0;i<a3.length;i++)
        {
            for (j=0;j<a3[i].length;j++)
            {
                suma3 = suma3 + a3[i][j];
            }
        }
        sumaTotal = suma1 + suma2 + suma3;
        return sumaTotal;
    }

    public static int[][] copiaArrayBi(int[][] a, int[][] a1)
    {
        int i, j;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                a1[i][j] = a[i][j];
            }
        }
        return a1;
    }

    public static int[][] copiaArrayBiPro(int[][] a)
    {
        int[][] a1 = new int[a.length][a[0].length];
        int i, j;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                a1[i][j] = a[i][j];
            }
        }
        return a1;
    }

    public static int[][] rellenaArrayAjedrez(int[][] a)
    {
        int i, j;
        for (i=0;i<a.length;i++)
        {
            if (i%2==0)
            {
                for (j=0;j<a[i].length;j=j+2)
                {
                    a[i][j]=1;
                }
            }
            else
            {
                for (j=1;j<a[i].length;j=j+2)
                {
                    a[i][j]=1;
                }
            }

        }
        return a;
    }

    public static int[][] rellenaDiagonal(int[][] a)
    {
        int i, j;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                if (i==j)
                {
                    a[i][j]=1;
                }
                else
                {
                    if (i>j)
                    {
                        a[i][j]=3;
                    }
                    else
                    {
                        a[i][j]=2;
                    }
                }
            }
        }
        return a;
    }

    public static int[][] rellenaX(int[][] a)
    {
        int i, j;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                if (i==j || i+j==a.length-1)
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=2;
                }
            }
        }
        return a;
    }

    public static int[][] rellenaCuadrados(int[][] a)
    {
        int i, j, k, l, n;
        n=1;
        for (i=0;i<a.length;i=i+a.length/2)
        {
            for (j=0;j<a.length;j=j+a.length/2)
            {
                for (k=i;k<a.length/2 + i;k++)
                {
                    for (l=j;l<a.length/2 + j;l++)
                    {
                       a[k][l]=n;
                    }
                }
                n++;
            }
        }


        /*for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                if (i<a.length/2 && j<a.length/2)
                {
                    a[i][j]=1;
                }
                else
                {
                    if (i<a.length/2 && j>=a.length/2)
                    {
                        a[i][j]=2;
                    }
                    else
                    {
                        if (i>=a.length/2 && j<a.length/2)
                        {
                            a[i][j]=3;
                        }
                        else
                        {
                            a[i][j]=4;
                        }
                    }
                }
            }
        }*/
        return a;
    }

    public static int[][] invierteBi(int[][] a)
    {
        int[][] aCopia = copiaArrayBiPro(a);
        int i, j;
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                a[j][(a.length-1)-i]=aCopia[i][j];
            }
        }
        return a;
    }

    public static int calculaDeterminante(int[][] a)
    {
        int diagonalesPos, diagonalesNeg, det;
        diagonalesPos = (a[0][0] * a[1][1] * a[2][2]) + (a[0][2] * a[1][0] * a[2][1]) +
                (a[0][1] * a[1][2] * a[2][0]);
        diagonalesNeg = - (a[0][2] * a[1][1] * a[2][0]) - (a[0][1] * a[1][0] * a[2][2]) -
                (a[0][0] * a[1][2] * a[2][1]);
        det = diagonalesPos + diagonalesNeg;
        return det;
    }

    public static boolean cuadradoMagico(int[][] a)
    {
        boolean resultado = false;
        int suma, sumFila1,sumFila2,sumFila3, sumColm1, sumColm2, sumColm3,
                sumDiagPos, sumDiagNeg;

        suma = sumaArrayBi(a);

        if (suma % 3 == 0)
        {
            resultado = true;
        }
        if (resultado)
        {
            sumFila1 = a[0][0] + a[0][1] + a[0][2];
            sumFila2 = a[1][0] + a[1][1] + a[1][2];
            sumFila3 = a[2][0] + a[2][1] + a[2][2];
            if (sumFila1 == sumFila2 && sumFila1==sumFila3)
            {
                resultado = true;
            }
            else
            {
                resultado = false;
            }
        }

        if (resultado)
        {
            sumColm1 = a[0][0] + a[1][0] + a[2][0];
            sumColm2 = a[0][1] + a[1][1] + a[2][1];
            sumColm3 = a[0][2] + a[1][2] + a[2][2];
            if (sumColm1 == sumColm2 && sumColm1 == sumColm3)
            {
                resultado = true;
            }
            else
            {
                resultado = false;
            }
        }

        if (resultado)
        {
            sumDiagPos = a[0][0] + a[1][1] + a[2][2];
            sumDiagNeg = a[0][2] + a[1][1] + a[2][0];
            if (sumDiagPos == sumDiagNeg)
            {
                resultado = true;
            }
            else
            {
                resultado = false;
            }
        }

        return resultado;




    }
}
