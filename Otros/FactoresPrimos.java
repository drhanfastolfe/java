import java.util.Scanner;

public class FactoresPrimos
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num, contPrimos, i, j, cociente, contBases;
        contPrimos = 0;
        contBases = 0;

        System.out.println("Introdcue un número:");
        num = sc.nextInt();

        for (i = 2; i < num; i++) // Calcula tamaño array para n primos < num
        {
            if (esPrimo(i))
            {
                contPrimos++;
            }
        }

        int[] primos = new int[contPrimos];
        j = 0;
        for (i = 2; i < num; i++) // Agrega al array n primos < num en orden asc
        {
            if (esPrimo(i))
            {
                primos[j] = i;
                j++;
            }
        }

        cociente = num;
        for (i = 0; i < primos.length - 1; i++) // Calcula tamaño array para bases de num
        {
            if (cociente % primos[i] == 0)
            {
                contBases++;
                cociente /= primos[i];

                if (cociente == 1)
                {
                    i = primos.length;
                }
                else
                {
                    i = -1;
                }
            }
        }

        int[] bases = new int[contBases];
        cociente = num;
        j = 0;
        for (i = 0; i < primos.length - 1; i++) // Agrega bases al array
        {
            if (cociente % primos[i] == 0)
            {
                bases[j] = primos[i];
                j++;
                cociente /= primos[i];

                if (cociente == 1)
                {
                    i = primos.length;
                }
                else
                {
                    i = -1;
                }
            }
        }

        for (i = 0; i < bases.length; i++)
        {
            System.out.print(bases[i] + " ");
        }
    }

    public static boolean esPrimo(int num)
    {
        boolean resultado = true;

        for (int i = 2; resultado && i < num; i++)
        {
            if (num % i == 0)
            {
                resultado = false;
            }
        }

        return resultado;
    }
}
