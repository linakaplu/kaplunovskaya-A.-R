//задача 4: Дан двумерный массив А квадратная матрица n*n. Найти среднеарифметическое
//положительных элементов параллели главной диагонали, расположенной
//над диагональю выше над диагональю.

import java.util.Scanner;
import java.lang.Math;

public class zad4 {
    public static void main(String args[]) {

        int summa = 0, srednee = 0, k = -3;

        int[][] A = new int[4][4];

        System.out.println("Ваш массив: ");                // заполнение матрицы рандомными элементами
        for (int i = 0; i < 4; i++) {                          // и вывод на консоль
            for (int j = 0; j < 4; j++) {
                A[i][j] = (int) (1 + Math.random() * 10);
                System.out.print(" " + A[i][j]); }
            System.out.println(); }
        System.out.println("Сокращенная матрица: ");
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (A[i][j] >= 0) {
                    k++;
                    summa = summa + A[i][j]; }
                if (j != i + 1) {
                    A[i][j] = 0; }
                if (A[i][j] != 0) {
                    System.out.println(A[i][j]); }
            }
        }
                System.out.println("количество: " + k);
                System.out.println("сумма: " + summa);
                srednee = summa / k;
                System.out.println(" Среднее арифметическое: " + srednee);
            }
        }

