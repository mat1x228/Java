// 2) Написать программу, которая выводит зеркальное представление пятизначного числа. Например, 34765 в виде 56743

package Lesson3;

import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = num / 10000;
        int n2 = (num / 1000) % 10;
        int n3 = (num / 100) % 10;
        int n4 = (num / 10) % 10;
        int n5 = num % 10;
        num = (n5 * 10000) + (n4 * 1000) + (n3 * 100) + (n2 * 10) + n1;

        System.out.println(num);
    }
}
