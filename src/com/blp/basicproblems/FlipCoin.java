package com.blp.basicproblems;
import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int coin, flip, headCount = 0, tailCount = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter number of times you want to flip coin");
        flip = scanner.nextInt();
        scanner.close();
        if (flip < 0) {
            System.out.println("Error enter a number greater than zero");
        } else {
            for (int i = 0; i < flip; i++) {
                coin = random.nextInt(2);
                if (coin == 0) {
                    System.out.println("HEAD");
                    headCount++;
                } else {
                    System.out.println("TAIL");
                    tailCount++;
                }
            }
        }
        System.out.println("Percentage of Heads : " + headCount * 100 / flip + "%");
        System.out.println("Percentage of Tails : " + tailCount * 100 / flip + "%");
    }
}

