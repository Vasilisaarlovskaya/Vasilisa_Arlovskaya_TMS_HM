package Lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Шахматная доска
        Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8.
        С помощью циклов задать элементам циклам значения B(Black) или W(White).
         */

        String mat[][] = new String[8][8];
        String White = "W";
        String Black = "B";

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    mat[i][j] = White;
                } else {
                    if (i % 2 == 0 && j % 2 != 0) {
                        mat[i][j] = Black;
                    } else if (i % 2 != 0 && j % 2 == 0) {
                        mat[i][j] = Black;
                    } else {
                        mat[i][j] = White;
                    }
                }
            }
            System.out.println(Arrays.toString(mat[i]));
        }
 /*
 Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива
  */

        int mas1[][] = {{1, 5, 9, 0}, {2, 1, 2, 2}, {3, 0, 0, 0}};
        int result = 0;

        System.out.println(" ");
        System.out.println(Arrays.deepToString(mas1));
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                result += mas1[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива " + result);
/*
Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
        int mas3[][] = {{1, 0, 5}, {4, 3, 90}, {99, 1, 0}};

        System.out.println(" ");
        System.out.println("Элементы массива до сортировки: ");
        System.out.println(Arrays.deepToString(mas3));
        for (int i = 0; i < mas3.length; i++) {
            Arrays.sort(mas3[i]);
        }
        System.out.println("Элементы массива после сортировки: ");
        System.out.println(Arrays.deepToString(mas3));
/*
Создайте двумерный массив. Выведите на консоль диагонали массива
Не доделано!
*/
        int mas4[][] = {{10, 6, 9}, {4, 8, 12}, {1, 3, 5}};
        int d;

        System.out.println(" ");
        for (int i = 0; i < mas4.length; i++) {
            System.out.println(Arrays.toString(mas4[i]));
        }
        System.out.println("Диагональ 1: ");
        System.out.println(mas4 [0][0]);
        System.out.println(mas4 [1][1]);
        System.out.println(mas4 [2][2]);
                for (int i = 0; i < mas4.length; i++) {
            for (int j = 0+i; j < mas4[i].length; j++) {
                System.out.print(mas4 [i][j]);

            }
        }
    }}