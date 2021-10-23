package com.blp.basicproblems;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i;
        System.out.println("Enter the Number");
        num = scanner.nextInt();
        scanner.close();
        System.out.println("Prime factors of given number are:- ");
        for (i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                System.out.println(i + " ");
            }
        }
        if (num != 1) {
            System.out.println(num);
        }
    }
}
