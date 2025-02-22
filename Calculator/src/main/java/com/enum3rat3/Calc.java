package com.enum3rat3;

import java.util.Scanner;

public class Calc {
    public static void main( String[] args )
    {
        while(true)
        {
            System.out.println("------------- Calculator -------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter which operation you want to perform: ");
            int op = scanner.nextInt();

            if(op == 5)
            {
                System.out.println("Exiting....");
                break;
            }

            System.out.print("Enter 1st Operand: ");
            double a = scanner.nextDouble();

            System.out.print("Enter 2nd Operand: ");
            double b = scanner.nextDouble();

            if(op == 1)
            {
                System.out.println("Addition of " + a + " + " + b + " = " + (a + b));
            }
            else if(op == 2)
            {
                System.out.println("Subtraction of " + a + " - " + b + " = " + (a - b));
            }
            else if (op == 3)
            {
                System.out.println("Multiplication of " + a + " * " + b + " = " + Math.round(a * b * 100.0) / 100.0);
            }
            else if (op == 4)
            {
                if(b != 0)
                {
                    System.out.println("Division of " + a + " / " + b + " = " + Math.round((a / b) * 100.0) / 100.0);
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else
            {
                System.out.println("Invalid Option....");
                break;
            }
        }
    }
}
