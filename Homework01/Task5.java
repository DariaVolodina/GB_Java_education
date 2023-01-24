package Homework01;//5*. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.

public class Task5 {
    public static void main(String[] args) {
        int[] numsArray = new int[]{3,0,1,2,3,4,5,3,6,7,8,3,9};
        int[] newArray = new int[numsArray.length]; // создан новый массив
        int val = 3;
        int j = 0; // индекс в новом массиве
        int a = 1; // счётчик для обратного отсчёта (для подстановки 3-ек в конец массива)

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] != val) {
                newArray[j++] = numsArray[i];
            }

            else {
                newArray[newArray.length - a] = numsArray[i];
                a ++;
            }

        }
        System.out.print("\nAfter moving" + val + "'s to the end of the array: \n");
        for (int n : newArray)
            System.out.print(n+"  ");
        System.out.print("\n");
    }
}
