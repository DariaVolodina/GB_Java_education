package Homework01;//Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) System.out.print(i + " ");
        }
    }
}

