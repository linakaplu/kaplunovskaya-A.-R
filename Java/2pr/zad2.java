//Дан массив x(n). Переписать в массив y(n) элементы масива х, большие 3
//Затем упорядочить методом "выбора и перестановки" по возрастанию 
//новый массив.

import java.util.Scanner;   //библиотека для ввода с консоли
import java.lang.Math;

public class zad2 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        System.out.println("Размер массива: " + n);
        sc.close();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = (int) (-4 + Math.random() * 30); }

        System.out.println("массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " "); }
        System.out.println(" ");

        int[] y = new int[x.length];
        System.out.println("измененный массив: ");
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 3)
                y[i] = x[i];
            else
                y[i]=0;
            System.out.print(y[i] + " "); }

        System.out.println(" ");
        System.out.println("упорядоченный массив: ");
        for (int i = 0; i < y.length; i++) {
            int min = y[i];
            int min_i = i;
            for (int j = i + 1; j < y.length; j++) {
                if (y[j] < min) {
                    min = y[j];
                    min_i = j; }
            }
            if (i != min_i) {
                int tmp = y[i];
                y[i] = y[min_i];
                y[min_i] = tmp; }
            System.out.print(y[i] + " "); }
        }
        }


