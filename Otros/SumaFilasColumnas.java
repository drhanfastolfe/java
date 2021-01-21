public class SumaFilasColumnas
{
    public static void main(String[] args)
    {
        int[][] matriz = {{5, 1, 2, 9},
                          {9, 8, 6, 7},
                          {8, 6, 8, 2}};
                          
        int sumaFil = 0;
        int sumaCol = 0;
        int[] arrSumFil = new int[3];
        int[] arrSumCol = new int[4];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                sumaFil += matriz[i][j];
            }
            arrSumFil[i] = sumaFil;
            sumaFil = 0;
        }

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                sumaCol += matriz[j][i];
            }
            arrSumCol[i] = sumaCol;
            sumaCol = 0;
        }

        escribeArray(arrSumFil);
        escribeArray(arrSumCol);
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
}