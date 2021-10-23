package com.blp.basicproblems;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        int N,power;
        System.out.println("Enter the power value : ");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= N; i++) {
            power = (int) Math.pow(2, i);
            System.out.println(2 + " to the power of " + i + " is " + power);
        }
    }
}

