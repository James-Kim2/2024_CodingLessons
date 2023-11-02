package main.java.hello;

import java.util.Scanner;

public class Receipt {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the cost: ");
        double       cost     = scanner.nextDouble();
        final double TAX_RATE = 0.13;
        System.out.println("Your tax is " + (cost * TAX_RATE));
        System.out.println("PAY UP BROKE BOI");

    }

}
