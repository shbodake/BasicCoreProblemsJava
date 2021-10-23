package com.blp.basicproblems;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend, divisor, quotient, remainder;
        System.out.println("Enter the dividend");
        dividend = scanner.nextInt();

        System.out.println("Enter the divisor");
        divisor = scanner.nextInt();
        scanner.close();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);

    }
}
