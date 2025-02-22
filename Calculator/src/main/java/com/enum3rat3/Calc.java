package com.enum3rat3;

import java.util.Scanner;

public class Calc {
    public static void main( String[] args )
    {
        while(true)
        {
            System.out.println("\n------------- Calculator -------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Log (ln(x))");
            System.out.println("8. Power Function (x^y)");
            System.out.println("9. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choice: ");
            int op = scanner.nextInt();


            if(op == 9)
            {
                System.out.println("Exiting....");
                break;
            }
            else if(op == 5)
            {
                // Square Root
                System.out.print("Enter number: ");
                double a = scanner.nextDouble();

                if(a < 0)
                {
                    System.out.println("Invalid Input");
                }
                else
                {
                    System.out.println("Square of " + a + " : " + sqaureRoot(a));
                }
                continue;
            }
            else if(op == 6)
            {
                // Factorial
                System.out.print("Enter number: ");
                double a = scanner.nextDouble();

                if(a < 0)
                {
                    System.out.println("Invalid Input");
                }
                else
                {
                    System.out.println("Factorial of " + (long)a + " : " + factorial((long)a));
                }
                continue;
            }
            else if(op == 7)
            {
                // Natural Log
                System.out.print("Enter number: ");
                double a = scanner.nextDouble();

                System.out.println("Natural Log of " + a + " : " + naturalLog(a));
                continue;
            }

            System.out.print("Enter 1st Operand: ");
            double a = scanner.nextDouble();

            System.out.print("Enter 2nd Operand: ");
            double b = scanner.nextDouble();

            if(op == 1)
            {
                System.out.println("Addition of " + a + " + " + b + " = " + addition(a, b));
            }
            else if(op == 2)
            {
                System.out.println("Subtraction of " + a + " - " + b + " = " + subtraction(a, b));
            }
            else if (op == 3)
            {
                System.out.println("Multiplication of " + a + " * " + b + " = " + multiplication(a, b));
            }
            else if (op == 4)
            {
                if(b != 0)
                {
                    System.out.println("Division of " + a + " / " + b + " = " + division(a, b));
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if(op == 8)
            {
                // Power Function
                System.out.println((long)a + "^" + (long)b + " : " + powerFunction((long)a, (long)b));
            }
            else
            {
                System.out.println("Invalid Option....");
                break;
            }
        }
    }

    // ------------------ Factorial ---------------
    public static long factorial(long a)
    {
        if(a == 0 || a == 1)
            return 1;

        return a * factorial(a - 1);
    }

    // ----------------- Square Root ---------------
    public static double sqaureRoot(double a)
    {
        return Math.round(Math.sqrt(a) * 100.0) / 100.0;
    }

    // ----------------- Natural Log ---------------
    public static double naturalLog(double a)
    {
        return Math.log(a);
    }

    // ----------------- Power Function ----------------
    public static long powerFunction(long a, long b)
    {
        return Math.round(Math.pow(a, b));
    }

    // ---------------- Addition -----------------
    public static double addition(double a, double b)
    {
        return a + b;
    }

    // -------------- Subtraction ---------------
    public static double subtraction(double a, double b)
    {
        return a - b;
    }

    // --------------- Multiplication --------------
    public static double multiplication(double a, double b)
    {
        return Math.round(a * b * 100.0) / 100.0;
    }

    // --------------- Division ---------------
    public static double division(double a, double b)
    {
        return Math.round(a / b * 100.0) / 100.0;
    }
}
