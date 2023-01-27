package SeminarsAndLections;


//1. Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Seminar3 {
//    public static void main(String[] args) {
//        int len = 10;
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        Random random = new Random();
//
//        for (int i = 0; i < len; i++) {
//            arr.add(random.nextInt(0, 100));
//        }
////        System.out.println(Arrays.toString(arr.toArray()));
//        System.out.println(arr);
//
//        Collections.sort(arr);
//        System.out.println(arr);
//    }
//}


// 2. Заполнить список названиями планет Солнечной системы
// в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

    public static void main(String[] args) {
        String[] planets = new String [] {"Mars", "Jupiter", "Venera", "Mars", "Mars", "Venera"};
        ArrayList<String> listOfPlanets = new ArrayList<>(Arrays.asList(planets));
        System.out.println(listOfPlanets);

        ArrayList<String> listCopy = new ArrayList<>(listOfPlanets);

        for (listCopy)
    }
}
// 3. Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

// 4. Каталог товаров книжного магазина сохранен в виде
// двумерного списка List<ArrayList<String>> так,
// что на 0й позиции каждого внутреннего списка содержится
// название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.