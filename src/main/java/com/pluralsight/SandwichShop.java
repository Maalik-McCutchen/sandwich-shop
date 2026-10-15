package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

        System.out.print("Size of sandwich? ");
        String sandwichSize = myScanner.nextLine();

        double regularSize = 5.45;
        double largeSize = 8.95;


        if (sandwichSize.equalsIgnoreCase("regular")) {
            System.out.println(regularSize);
        } else if (sandwichSize.equalsIgnoreCase("large")) {
            System.out.println(largeSize);
        }
        System.out.println("Would you like it loaded? ");
        String sandwichLoaded = myScanner.nextLine();

        double regularLoad = 1.00;
        double largeLoad = 1.75;

        if (sandwichLoaded.equalsIgnoreCase("no")){
            System.out.println(regularLoad);
        } else if (sandwichLoaded.equalsIgnoreCase("yes")) {
            System.out.println(largeLoad);
        }


        System.out.println("What is your age? ");
        int age = myScanner.nextInt();

        if (age <= 17){
            System.out.println("You received a 10% discount");
        } else if (age >= 65) {
            System.out.println("You received a 20% discount");
            
        }

    }

    }

