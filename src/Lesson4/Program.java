package Lesson4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        int n = sc.nextInt();
        while(n != -1) {
            int j = n;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum % 2 == 0) {
                count = count * j;
            }
            sum = 0;
            n = sc.nextInt();
        }
        System.out.println(count);
    }
}