package Homework01;//Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Enter operator (+, -, *, /): ");
        Scanner scan1 = new Scanner(System.in);
        String oper = scan1.nextLine();
        while (oper.equals("+") == false && oper.equals("-") == false && oper.equals("*") == false && oper.equals("/") == false) {
            System.out.println("Incorrect action. Try again: ");
            Scanner scan3 = new Scanner(System.in);
            oper = scan1.nextLine();
        }

        System.out.println("Enter second number: ");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        int result = 0;
        if (oper.equals("+")) {
            result = num1 + num2;
        }
        else if (oper.equals("*")) {
            result = num1 * num2;
        }
        else if (oper.equals("-")) {
            result = num1 - num2;
        }
        else if (oper.equals("/")) {
            result = num1 / num2;
        }

        System.out.println(num1 + oper + num2 + " = " + result);

    }
}
