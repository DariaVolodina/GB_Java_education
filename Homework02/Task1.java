// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package Homework02;

import java.util.Arrays;
import java.io.FileWriter;
import java.util.logging.Logger;
public class Task1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{2, 13, 1, 9, 7};
        System.out.println(Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;

        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                sorted = true;
                if (array[i] < array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                    addToFile(array);
                }
            }
        }
    }

    public static void addToFile(int[] array) {
        String path = "C:/Users/AlexBlues/IdeaProjects/Java_Education/src/Homework02/bubbleView";
        try (FileWriter writer = new FileWriter(path, true)) {
            String text = Arrays.toString(array);
            writer.append(text + "\n");
            System.out.println("Data added to the file");

        } catch (Exception exception) {
            Logger logger = Logger.getAnonymousLogger();
            logger.warning("Something went wrong");
        }
    }
}


//метод вывода массива в консоль, значения через пробел
    //    public static void printer(int [] array) {
//        for (int i = 0; i < array.length; i++)
//            System.out.print(array[i] + " ");
//        System.out.println("");
//    }


