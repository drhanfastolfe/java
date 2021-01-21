package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Díme un número A.");
        a = sc.nextInt();
        System.out.println("Díme un número B.");
        b = sc.nextInt();
        System.out.println("Díme un número C.");
        c = sc.nextInt();

        if ((a == b) || (a == c) || (b == c))
        {
            System.out.println("No puede haber valores iguales.");
        }
        else
        {
           if ((a > b) && (b > c))
           {
               System.out.println(a + ">" + b + ">" + c);
           }
           else
           {
               if ((a > c) && (c > b))
               {
                   System.out.println(a + ">" + c + ">" + b);
               }
               else
               {
                   if ((b > a) && (a > c))
                   {
                       System.out.println(b + ">" + a + ">" + c);
                   }
                   else
                   {
                       if (b > c)
                       {
                           System.out.println(b + ">" + c + ">" + a);
                       }
                       else
                       {
                           if (a > b)
                           {
                               System.out.println(c + ">" + a + ">" + b);
                           }
                           else
                           {
                               System.out.println(c + ">" + b + ">" + a);
                           }
                       }
                   }
               }
           }
        }
    }
}
