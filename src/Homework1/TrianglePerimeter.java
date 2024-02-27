package Homework1;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side A:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input side B:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Input side C:");
        double c = Double.parseDouble(scanner.nextLine());

        double perim = a + b + c;

        System.out.printf("Triangle`s perimeter is: %.2f",perim);
    }
}
