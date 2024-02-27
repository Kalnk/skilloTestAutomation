package Homework1;

import java.util.Scanner;

public class PineTreePrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your pine tree width: ");
        int n = Integer.parseInt(scanner.nextLine());

        int starsLeft = 1;
        int starsRight = 1;
        int spaces = n/2 - 1;


        for (int i = 1; i <=n/2 ; i++) {
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=starsLeft ; j++) {
                System.out.print("*");
            }

            for (int j = 2; j <=starsRight ; j++) {
                System.out.print("*");
            }

            System.out.println();
            starsLeft++;
            spaces--;
            starsRight++;

        }



    }
}
