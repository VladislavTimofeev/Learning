package by.training.cycle;

import java.math.BigInteger;
import java.util.Scanner;

public class Cycle {
    public static void Task5() {
        //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
        //заданному е. Общий член ряда имеет вид:
        int e = 3;
        int z = 2;


    }

    public static void Task4() {
        //Составить программу нахождения произведения квадратов первых двухсот чисел
        BigInteger z = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            z = z.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(z);
    }

    public static void Task3() {
        //Найти сумму квадратов первых ста чисел.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }

    public static void Task1() {
        //Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        //все числа от 1 до введенного пользователем числа.
        int sum = 0;
        System.out.println("Введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Ваше число: " + a);
        if (a <= 0) {
            System.out.println("Вы ввели неверное число, попробуйте еще раз");
        }
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел от 1 до " + a + " равна " + sum);
    }
}


