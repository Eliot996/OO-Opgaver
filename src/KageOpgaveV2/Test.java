package KageOpgaveV2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Cake cake = new Cake();

        //greeting
        System.out.println("""
                Hello this program will calculate the required amounts of ingredients
                for a given amount of portions of green poison cake from the following recipe:
                https://madenimitliv.dk/2019/02/groen-giftkage-den-skoenne-klassiker/
                """);

        // get desired amount of portions, and calculate amounts
        System.out.print("How many portions do you want? ");
        cake.calculateindgridientAmounts(getIntFromScanner());

        // total amounts
        cake.calculateTotalWeigth();

        // estimated finished weights
        cake.calculateEstimatedFinishedWeight();

        // calculating KCAL
        cake.calculateTotalKCAL();

        // calculating per portion
        cake.calculateKCALPerPortions();

        //print list of ingredients
        cake.printAmounts();
        System.out.println();

        // print info about the cake
        cake.printInfo();
    }


    // As name says, returns an int, or it prompts the user for a different input
    static Integer getIntFromScanner() {
        Scanner scannerInput = new Scanner(System.in);

        while (true) {

            if (scannerInput.hasNextInt()) {
                return scannerInput.nextInt();

            } else {
                // request new input
                System.out.println("Invalid input, please try again:");
                scannerInput.nextLine();
            }
        }
    }
}
