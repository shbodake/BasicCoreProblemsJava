package com.blp.basicproblems;
import java.util.Scanner;
public class HarmonicNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("Enter Number of Terms to Add");
        n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++)
        {
            sum = sum + (1.0) / i;
            System.out.println(sum);
        }
        System.out.println("Harmonic number sum is : " + sum);
    }


}
