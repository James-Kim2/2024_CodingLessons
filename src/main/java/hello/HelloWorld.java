package main.java.hello;

import java.util.Scanner;

public class HelloWorld {
    static Scanner scanner = new Scanner(System.in);

    static Circle  spot    = new Circle();

    public static void main(String[] varArgs) {

        // System.out.println("Goodbye Crule World");



        System.out.println("What is the radius?");
        double radius = scanner.nextInt();
        spot.setRadius(radius);

        System.out.println("Circle radius:" + spot.getRadius());
        System.out.println("Circle area:" + spot.area());
        System.out.println(
            "NOW GO BUY YOUR OWN CALCULATOR.                                                                                      AFTER ASKING RECEIPT.JAVA FOR YOUR TAX COST OBVIUSLY");

        System.out.println("Hello there I am the Receipt please enter the cost: ");
        double       cost     = scanner.nextDouble();
        final double TAX_RATE = 0.13;
        System.out.println("Your tax is " + (cost * TAX_RATE));
        System.out.println("PAY UP BROKE BOI");
    }
}