// 1) Поменять местами максимальный и минимальный элемент массива.

package Lesson5;

public class ChangePlace {
    public static void main(String[] args) {

        int[] a = {55,2,71,17,2,14};

        int nMin = 0;
        int nMax = 0;

        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                nMax = i;
            }
            if (a[i] < min) {
                min = i;
                nMin = i;
            }
        }
        int tmp = a[nMax];
        a[nMax] = a[nMin];
        a[nMin] = tmp;

        for (int item: a) {
            System.out.print(item + " ");
        }
    }
}
