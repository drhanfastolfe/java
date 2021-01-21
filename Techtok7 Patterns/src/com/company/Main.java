package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option = -1;

        System.out.println
        (
            "Introduce the task number:" + System.lineSeparator() +
            "0. Exit" + System.lineSeparator() +
            "1. Input: 7 Pattern: 1 2 3 4 5 6 7" + System.lineSeparator() +
            "2. Input: 7 Pattern: 7 6 5 4 3 2 1" + System.lineSeparator() +
            "3. Input: 7 Pattern: 1 3 5 7 9 11 13" + System.lineSeparator() +
            "4. Input: 7 Pattern: 14 12 10 8 6 4 2" + System.lineSeparator() +
            "5. Input: 7 Pattern: 0 1 0 1 0 1 0" + System.lineSeparator() +
            "6. Input: 7 Pattern: 1 4 9 16 25 36 49" + System.lineSeparator() +
            "7. Input: 7 Pattern: * * * * * * *" + System.lineSeparator() +
            "8. Input: 7 Pattern: * # * # * # *" + System.lineSeparator() +
            "9. Input: 7 Pattern: * # @ * # @ *"
        );

        option = sc.nextInt();

        while (option!=0)
        {
            switch (option)
            {
                case 1:
                {
                    System.out.println
                            (
                                "1. Write a program that print the following pattern:" + System.lineSeparator() +
                                "   Input: 7" + System.lineSeparator() +
                                "   Pattern: 1 2 3 4 5 6 7"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task1(n);

                    System.out.println();
                }
                break;

                case 2:
                {
                    System.out.println
                            (
                                    "2. Write a program that print the following pattern:" + System.lineSeparator() +
                                    "   Input: 7" + System.lineSeparator() +
                                    "   Pattern: 7 6 5 4 3 2 1"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task2(n);

                    System.out.println();
                }
                break;

                case 3:
                {
                    System.out.println
                            (
                                    "3. Write a program that print the following pattern:" + System.lineSeparator() +
                                    "   Input: 7" + System.lineSeparator() +
                                    "   Pattern: 1 3 5 7 9 11 13"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task3(n);

                    System.out.println();
                }
                break;

                case 4:
                {
                    System.out.println
                            (
                                    "4. Write a program that print the following pattern:" + System.lineSeparator() +
                                    "   Input: 7" + System.lineSeparator() +
                                    "   Pattern: 14 12 10 8 6 4 2"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task4(n);

                    System.out.println();
                }
                break;

                case 5:
                {
                    System.out.println
                            (
                                    "5. Write a program that print the following pattern:" + System.lineSeparator() +
                                    "   Input: 7" + System.lineSeparator() +
                                    "   Pattern: 0 1 0 1 0 1 0"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task5(n);

                    System.out.println();
                }
                break;

                case 6:
                {
                    System.out.println
                            (
                                    "6. Write a program that print the following pattern:" + System.lineSeparator() +
                                    "   Input: 7" + System.lineSeparator() +
                                    "   Pattern: 1 4 9 16 25 36 49"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task6(n);

                    System.out.println();
                }
                break;

                case 7:
                {
                    System.out.println
                            (
                                    "7. Write a program that print the following pattern:" + System.lineSeparator() +
                                            "   Input: 7" + System.lineSeparator() +
                                            "   Pattern: * * * * * * *"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task7(n);

                    System.out.println();
                }

                case 8:
                {
                    System.out.println
                            (
                                    "8. Write a program that print the following pattern:" + System.lineSeparator() +
                                            "   Input: 7" + System.lineSeparator() +
                                            "   Pattern: * # * # * # *"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task8(n);

                    System.out.println();
                }

                case 9:
                {
                    System.out.println
                            (
                                    "9. Write a program that print the following pattern:" + System.lineSeparator() +
                                            "   Input: 7" + System.lineSeparator() +
                                            "   Pattern: * # @ * # @ *"
                            );

                    int n;

                    System.out.println("Enter the input value:");
                    n = sc.nextInt();

                    task9(n);

                    System.out.println();
                }
            }

            System.out.println
                    (
                            "Introduce the task number:" + System.lineSeparator() +
                                    "0. Exit" + System.lineSeparator() +
                                    "1. Input: 7 Pattern: 1 2 3 4 5 6 7" + System.lineSeparator() +
                                    "2. Input: 7 Pattern: 7 6 5 4 3 2 1" + System.lineSeparator() +
                                    "3. Input: 7 Pattern: 1 3 5 7 9 11 13" + System.lineSeparator() +
                                    "4. Input: 7 Pattern: 14 12 10 8 6 4 2" + System.lineSeparator() +
                                    "5. Input: 7 Pattern: 0 1 0 1 0 1 0" + System.lineSeparator() +
                                    "6. Input: 7 Pattern: 1 4 9 16 25 36 49" + System.lineSeparator() +
                                    "7. Input: 7 Pattern: * * * * * * *"+ System.lineSeparator() +
                                    "8. Input: 7 Pattern: * # * # * # *" + System.lineSeparator() +
                                    "9. Input: 7 Pattern: * # @ * # @ *"
                    );

            option = sc.nextInt();
        }

    }

    public static void task1(int n)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.print(i + " ");
        }
    }

    public static void task2(int n)
    {
        for (int i=n; i>=1; i--)
        {
            System.out.print(i + " ");
        }
    }

    public static void task3(int n)
    {
        for (int i=1; i<n*2; i=i+2)
        {
            System.out.print(i + " ");
        }
    }

    public static void task4(int n)
    {
        for (int i=n*2; i>1; i=i-2)
        {
            System.out.print(i + " ");
        }
    }

    public static void task5(int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print(i%2 + " ");
        }
    }

    public static void task6(int n)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.print(i*i + " ");
        }
    }

    public static void task7(int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print("* ");
        }
    }

    public static void task8(int n)
    {
        for (int i=0; i<n;i++)
        {
            if (i%2==0)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("# ");
            }
        }
    }

    public static void task9(int n)
    {
        for (int i=1; i<=n; i++)
        {
            if (i%3==2)
            {
                System.out.print("# ");
            }
            else
            {
                if (i%3==1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("@ ");
                }
            }
        }
    }


}
