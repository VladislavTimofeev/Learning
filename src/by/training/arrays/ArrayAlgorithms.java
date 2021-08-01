package by.training.arrays;

import java.util.Random;

public class ArrayAlgorithms {
    public static void printSum() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Число " + i + " составное");
            } else {
                System.out.println("Число " + i + " простое");
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void printMore() {
        int[] array = new int[]{1, 5, 3, 6, 8, 9, 2, 5, 11, 19};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
    }

    public static void changePlace() {
        int[] array = new int[]{-1, 2, 3, 4, 8, 54, 32, 9, 0, 5, 77, 21, 66, 0, 35};
        int minM = array[0];
        int maxM = array[0];
        int min = 0;
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxM) {
                maxM = array[i];
                max = i;
            }
            if (array[i] < minM) {
                minM = array[i];
                min = i;
            }
        }
        array[min] = maxM;
        array[max] = minM;
        for (int i = 0; i < array.length; i++) {
            System.out.println("i=" + i + " array[" + i + "]=" + array[i]);
        }

    }

    public static void MuHyCZeroPlus() {
        double[] massive = new double[]{4, 7, 12, 51, -4, 0, 9, 11, -54, -13, 0};
        int plusCount = 0;
        int muHycCount = 0;
        int zeroCount = 0;
        for (double v : massive) {
            if (v > 0) {
                plusCount++;
            } else if (v < 0) {
                muHycCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Положительные: " + plusCount + " Отрицательные: " + muHycCount + " Ноль " + zeroCount);

    }

    public static void changeZ() {
        double[] array = new double[]{3, 5, 6, 8, 9, 11, 13, 21, 45};
        double number = 5.5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
                count++;
            }
        }
        System.out.println("Количество замен:" + count);
        printest(array);
    }

    public static void printest(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент:" + array[i]);
        }
    }


    public static void findSumMultipleOfK() {
        int arraySize = 10;
        int divider = 2;
        int[] mas = new int[arraySize];
        int sum = 0;
        fillArray(mas);
        //printArray(mas);
        for (int number : mas) {
            if (number % divider == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }

    static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

    static void fillArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }
    }
}
