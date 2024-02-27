package Homework1;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side A:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input side B:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Input side C:");
        double c = Double.parseDouble(scanner.nextLine());

        double p = (a + b + c)/2;

        boolean isValidTriangle = true;
        //exceptions
        if ( b + c < a){
            System.out.println("Error!\n" +
                    "\"b\" + \"c\" must be greater than \"a\", as the sum of two side lengths has to exceed the length of the third side!");
            isValidTriangle = false;
        } else if (a + c < b) {
            System.out.println("Error!\n" +
                    "\"a\" + \"c\" must be greater than \"b\", as the sum of two side lengths has to exceed the length of the third side!");
            isValidTriangle = false;

        } else if (a + b < c) {
            System.out.println("Error!\n" +
                    "\"a\" + \"b\" must be greater than \"c\", as the sum of two side lengths has to exceed the length of the third side!");
            isValidTriangle = false;

        }


        if (isValidTriangle) {
            //calc area using heron`s formulae
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("The area is:  %.3f", s);
        }

    }
}
