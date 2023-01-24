package Homework01;//*+Задано уравнение вида q + w = e,
// q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("There's an  expression: q? + ?w = e.");
        System.out.println("Enter q:");
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        System.out.println("Enter w:");
        Scanner scan1 = new Scanner(System.in);
        int d = Integer.parseInt(scan1.nextLine());

        System.out.println("Enter e:");
        Scanner scan2 = new Scanner(System.in);
        int res = Integer.parseInt(scan2.nextLine());

        if ((a * 10 + d) >= res || (res - a * 10 - d) > 99) {
            System.out.println("Impossible case");
        }
        else {
        int b = 1;
        int c = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 if (a * 10 + i + j * 10 + d == res) {
                    b = i;
                    c = j;
                    break;
                    }
                }
            }
            System.out.print(Integer.toString(a * 10 + b) + '+' + Integer.toString(c * 10 + d) + '=' + res);
        }
    }
}