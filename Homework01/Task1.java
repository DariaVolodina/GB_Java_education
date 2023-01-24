package Homework01;//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sumOfNums = 0;
        int multNums = 1;

        for (int i = 1; i <= num; i++) {
            sumOfNums += i;
            multNums *= i;
        }

        System.out.println("Сумма чисел от 1 до " + num + " = " + sumOfNums);
        System.out.println("Произведение чисел от 1 до " + num + " = " + multNums);
    }
}
