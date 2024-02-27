package Homework1;

import java.util.Scanner;

public class ConvertMinsToYearsAndDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Minutes you want to convert into years and minutes:");
        double minutes = Double.parseDouble(scanner.nextLine());

        double years = minutes / 525948.76656;
        double minsLeft = minutes % 525948.76656;

        if (years < 1){
            System.out.printf("These are %.0f minutes",minutes);
        } else if (years < 2){
            System.out.printf("These are %.0f year and %.0f minutes",years,minsLeft);
        } else {
            System.out.printf("These are %.0f years and %.0f minutes", years, minsLeft);
        }

    }
}
