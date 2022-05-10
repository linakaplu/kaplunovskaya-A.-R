//Определить одномерный массив и заполнить его случайными числами. 
//Определить, сколько раз в массиве меняется знак.

import java.util.Scanner;   //библиотека для ввода с консоли
import java.lang.Math;      //библиотека для рандома

public class zad1 {
    public static void main (String args[]) {

        int k = 0;                                      //счетчик изменения знака
        int t = 0;                                      //счетчик НЕизменения знака

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");      //ввод с консоли размера массива n
        int n = sc.nextInt();                       // размер массива
        System.out.println("Размер массива: " + n);
        sc.close();
        
        int[] a = new int [n];
        for (int i = 0; i < n; i++){                //заполнение массива рандомными значениями
            a[i] = (int) (-10 + Math.random() *50);
        }

        System.out.println("Ваш массив: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < (n - 1); i++){
            if ((a[i] >= 0 && a[i + 1] >= 0) | (a[i] <0 && a[i + 1] < 0)) {     //условие для основного вопроса задачи
                t++;
            }
            else{
                k++;
            }
        }

       /* for (int i = 0; i < (n - 1); i++){
            if ((a[i] >= 0 && a[i + 1] < 0) | (a[i] < 0 && a[i + 1] >= 0));
            k++;
        }*/

        System.out.println(k + " раз менялся знак в массиве");      
        System.out.println(t + " раз не менялся знак в массиве");
    }
    
}
