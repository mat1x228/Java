// 1) Написать программу, которая выводит сумму цифр пятизначного числа.

package Lesson3;

import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = num / 10000;
        int n2 = (num / 1000) % 10;
        int n3 = (num / 100) % 10;
        int n4 = (num / 10) % 10;
        int n5 = num % 10;
        num = n1 + n2 + n3 + n4 + n5;
        System.out.println(num);
    }
}
