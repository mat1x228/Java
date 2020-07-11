// 3) Написать программу, которая выведет двоичное представление пятизначного числа.
// https://numsys.ru - проверка

package Lesson3;

import java.util.Scanner;

public class BinaryRepres {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        String s = "";
        while (a != 0) {
            b = a % 2;
            s = b + s;
            a = a / 2;
        }
        System.out.print(s);
    }
}