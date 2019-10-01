package com.example.randomday;

import java.util.Scanner;

public class RandomDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program will random select a day of the week and print out the result");
        int weekday = (int)(1+Math.random()* 7);

        switch (weekday) {
            case 1:
                System.out.println("System chose day No " + weekday + ", monday.");
            break;

            case 2:
                System.out.println("System chose day No " + weekday + ", tuesday.");
            break;

            case 3:
                System.out.println("System chose day No " + weekday + ", wednesday.");
            break;

            case 4:
                System.out.println("System chose day No " + weekday + ", thursday.");
            break;

            case 5:
                System.out.println("System chose day No " + weekday + ", friday.");
            break;

            case 6:
                System.out.println("System chose day No " + weekday + ", saturday.");
            break;

            case 7:
                System.out.println("System chose day No " + weekday + ", sunday.");
            break;
        }

        if(weekday == 7) {
            System.out.println("\nHope you had a nice weekend.");
        }
    }
}
