package by.training.sorting;

import java.util.Arrays;

public class Sorting {
    public static void InSorting() {
        int[] array = {1, 10, 3, 19, 4, 6, 2, 9, 8};
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void BubbleSotring() {
        int s = 0;
        int[] array = {6, 8, 9, 2, 5, 3, 0};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            ++s;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Количество перестановок : " + s);
    }

    public static void ArrSorting() {
        // Просто побаловался с сортировкой массива( банальной )
        int[] arr1 = {1, 6, 2, 5, 9, 5, 8, 4, 11, 3, 17, 7, 0};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void SelectionSorting() {
        // Сортировка по возрастанию
        int[] array = {8, 4, 6, 2, 9, 7, 0, 1, 12, 16, 27, 3, 5, 10};
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
            System.out.println(Arrays.toString(array));
        }
        //System.out.println(Arrays.toString(array));
    }

    public static void SelectionSortingMax() {
        // Дана последовательность чисел
        //a1  a2  an
        //.Требуется переставить элементы так,
        //чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
        //элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
        //повторяется. Написать алгоритм сортировки выбором.
        int[] array = {5, 1, 4, 2, 3, 7, 6, 0, 8, 9, 12, 21, 14, 51, 17, 23, 77, 19};
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    position = j;
                    max = array[j];
                }
            }
            array[position] = array[i];
            array[i] = max;
            //System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

}

