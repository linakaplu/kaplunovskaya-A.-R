//Определить марицу, заполнить ее случайными значениями.
// Построить вектор, который будет возвращать сумму
// отрцательных элементов в каждом столбце
import java.util.Vector;
import java.lang.Math;

public class zadd3 {
    public static void main(String[] args) {

        Vector vec = new Vector();
        int sum = 0;

        int[][]mas = new int[4][4];
        System.out.println("Ваш массив: ");
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length; j++){
                mas[i][j] = (int) (-30 + Math.random() * 30); }
            }
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length; j++) {
                System.out.print(mas[j][i] + " "); }
            System.out.println(); }
        System.out.println("Полученный вектор: ");
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length; j++){
                if (mas[i][j] < 0){
                    sum += mas[i][j];
                }
            }
            vec.add(sum);
            sum = 0; }
        System.out.println(vec);
    }
}

