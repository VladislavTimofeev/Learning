package by.training.arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class MatrixAlgorithms {
    public static void myLove() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    public static void matrix5() {
//         Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//         Здесть должен быть КОД
//        mat [0][0]=1
//                mat [1][2]= 0
//                        mat [2][2]= 0
//        1 1 1
//        2 2 0
//        3 0 0
//        i=0
//                j=0 j<3-0
//                matr=0+1=1
//                        matr = 0+1=1
//                                1 1 1
//            i = 1
//                    j=0 j<3-1
//                matr = 1+1=2
//                        matr = 1+1=2
//                                2 2 0
//            i = 2
//                    j=0 j<3-2
//                matr = 2+1 = 3
//
//        1 1 1 1 1
//        2 2 2 2 0
//        3 3 3 0 0
//        4 4 0 0 0
//        5 0 0 0 0
//                    i=0
//                            j = 0, j < 5 - 0;
//        matr = i + 1 = 0 + 1=1
//                i = 1
//                        j = 0, j < 5- 1;
//        matr = i + 1 = 1+1=2
//                i=2
//                        j=0, j<5-2;
//        matr = i + 1= 2+1

        int n = 6;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void matrix4() {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 4;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 != 0) {
                    matrix[i][j] = n - j;
                } else {
                    matrix[i][j] = j + 1;
                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void matrix3(int k, int p) {
        //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        int[][] matrix =
                {{5, 7, 3},
                        {7, 0, 1},
                        {8, 1, 2}};
        for (int i = 0; i < matrix[k].length; i++) {
            System.out.print(matrix[k][i]);
        }
        System.out.println();
        for (int i = 0; i < matrix[p].length; i++) {
            System.out.println(matrix[i][p]);
        }
    }

    public static void matrix2() {
        //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        int[][] matrix =
                {{5, 7, 3},
                        {7, 0, 1},
                        {8, 1, 2}};
        int dig = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][matrix.length - i - 1]);
        }
    }

    public static void matrix1() {
        // Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
        int[][] matrix =
                {{5, 7, 3, 17},
                        {7, 0, 1, 12},
                        {8, 1, 2, 3}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.print("");
                } else if (j == 1) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else if (j == 2) {
                    System.out.print("");
                } else {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
