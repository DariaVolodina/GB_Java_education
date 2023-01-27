// К калькулятору из предыдущего дз добавить логирование.

package Homework02;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task2 {
    public static int getNum (String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
    }

    public static String getOperation (String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String oper = scan.nextLine();
        while (oper.equals("+") == false && oper.equals("-") == false && oper.equals("*") == false && oper.equals("/") == false) {
            System.out.println("Incorrect action. Try again: ");
            Scanner scan1 = new Scanner(System.in);
            oper = scan.nextLine();
        }
        return oper;
    }

    public static void addToFile(String text) {
        try (FileWriter writer = new FileWriter("Calculator", true)) {
            writer.append(text + "\n");
            System.out.println("Data added to the file");

        } catch (Exception exception) {
            Logger logger = Logger.getAnonymousLogger();
            logger.warning("Something went wrong");
        }
    }

    public static void main(String[] args) {
        int num1 = getNum("Enter first number: ");
        String operation = getOperation("Enter operator (+, -, *, /): ");
        int num2 = getNum("Enter second number: ");

        int res = 0;
        if (operation.equals("+"))
            res = num1 + num2;
        else if (operation.equals("*"))
            res = num1 * num2;
        else if (operation.equals("-"))
            res = num1 - num2;
        else if (operation.equals("/"))
            res = num1 / num2;

        addToFile(num1 + operation + num2 + " = " + res);
        System.out.println(num1 + operation + num2 + " = " + res);
    }
}