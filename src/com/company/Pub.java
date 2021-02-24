package com.company;

import java.util.Scanner;

public class Pub {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your drink: 1 - beer, 2 - cider, 3 - good cider, 4 - gin tonic, 5 - bacardi special.");
        short drink = input.nextShort();
        if (drink > 5 || drink <= 0) {
            System.out.println("Please enter a valid number!");
        }
        System.out.println("How many drinks would you like to order?");
        Integer amount = input.nextInt();
        System.out.println("Are you a student? Please type Y or N: ");
        String student = input.next();
        System.out.println("Your choice is: " + amount + drink);
        System.out.println(computeCost((student == "Y") ? true : false, amount, drink));


        //  public static final String ONE_BEER = "hansa";
        //  public static final String ONE_CIDER = "grans";
        // public static final String A_PROPER_CIDER = "strongbow";

        // public static final String GT = "gt";
        // public static final String BACARDI_SPECIAL = "bacardi_special";
    }

    public static int computeCost(boolean student, int amount, short drink) {
        int ingredient1 = 65;
        int ingredient2 = 10;
        int ingredient3 = 10;
        int ingredient4 = 10;
        int ingredient5 = 20;
        int ingredient6 = 85;
        if (amount > 2 && (drink == 4 || drink == 5)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
        int price = 0;

        if (drink == 1) {
            price = 74;
        } else if (drink == 2) {
            price = 103;
        } else if (drink == 3) {
            price = 110;
        } else if (drink == 4) {
            price = ingredient6 + ingredient5 + ingredient4;
        } else if (drink == 5) {
            price = ingredient6 / 2 + ingredient1 + ingredient2 + ingredient3;
        } else {
            throw new RuntimeException("No such drink exists");
        }
        if (student && (drink == 2 || drink == 1 || drink == 3)) {
            price = price - price / 10;
        }
        return price * amount;
    }

    //one unit of rum
    // private static int ingredient1() {
    //  return 65;
    // }

    //one unit of grenadine
    //private static int ingredient2() {
    //    return 10;
    //}

    //one unit of lime juice
    // private static int ingredient3() {
    //     return 10;
    // }

    //one unit of green stuff
    // private static int ingredient4() {
    //    return 10;
    // }

    //one unit of tonic water
    //private static int ingredient5() {
    //   return 20;
    //  }

    //one unit of gin
    //private static int ingredient6() {
    // return 85;
    //}
}
