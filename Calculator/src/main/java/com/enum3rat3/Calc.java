package com.enum3rat3;

import java.util.Scanner;

public class Calc {
    public static void main( String[] args )
    {
        while(true)
        {
            System.out.println("------------- Calculator -------------");
            System.out.println("1. Addition");
            System.out.println("2. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 1st Operand: ");
            double a = scanner.nextDouble();

            System.out.print("Enter 2nd Operand: ");
            double b = scanner.nextDouble();

            System.out.print("Enter which operation you want to perform: ");
            int op = scanner.nextInt();

            if(op == 1)
            {
                System.out.println("Addition of " + a + " + " + b + " = " + (a + b));
            }
            else
            {
                System.out.println("Exiting....");
                break;
            }
        }
    }
}
