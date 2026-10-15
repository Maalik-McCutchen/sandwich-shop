package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

        System.out.print("Size of sandwich? ");
        String sandwichSize = myScanner.nextLine();

        double regularSize = 5.45;
        double largeSize = 8.95;


        if (sandwichSize.equals("Regular")) {
            System.out.println(regularSize);
        } else if (sandwichSize.equals("Large")) {
            System.out.println(largeSize);
        }
        System.out.println("Would you like it loaded? ");
        String sandwichLoaded = myScanner.nextLine();

        double regularLoad = 1.00;
        double largeLoad = 1.75;

        if (sandwichLoaded.equals("Regular")){
            System.out.println(regularLoad);
        } else if (sandwichLoaded.equals("Large")) {
            System.out.println(largeLoad);
        }

        }

    }

