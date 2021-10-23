package com.blp.basicproblems;
import java.util.Scanner;
public class LargestOfThree
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Enter the First Number");
        n1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        n2 = scanner.nextInt();
        System.out.println("Enter the Third Number");
        n3 = scanner.nextInt();
        scanner.close();
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("First Number is greater");
        }else if(n2 > n1 && n2 > n3)
        {
            System.out.println("Second Number is greater");
        } else
        {
            System.out.println("Third Number is greater");
        }
        }
    }

