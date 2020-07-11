// 2) Вывести среднее арифметическое элементов массива

package Lesson5;

public class Average {
    public static void main(String[] args) {
        int arr [] = {5, 8, 12, -18, -54, 84, -35, 17, 37};
        double sum = 0;
        for (int x: arr) {
            sum += x;
        }
        System.out.print(sum / arr.length);
    }
}
