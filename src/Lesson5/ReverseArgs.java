// 3) Выполнить разворот массива (первый элемент становится последним, второй - предпоследним и т.д., последний элемент становится первым, предпоследний вторым и т.д.)

package Lesson5;

import java.util.Scanner;

public class ReverseArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i > - 1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
