package com.blp.basicproblems;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the integer value to Check even or odd");
        num = scanner.nextInt();
        scanner.close();
        if((num % 2) == 0){
            System.out.println("Number: " +num+ "is Even");
        }else {
            System.out.println("Number: " +num+ "is Odd");
        }

    }
}
