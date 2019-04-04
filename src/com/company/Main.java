package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ///////////////////////////////////////
        // Input/Output
        ///////////////////////////////////////

        /*
         * Output
         */
        System.out.println("Hello World");
        System.out.println("Integer: " + 10 + " Double: " + 3.14 + " Boolean: " + true);

        System.out.print("Hello ");
        System.out.print("World");

        System.out.println(" ");

        System.out.printf("pi = %.5f", Math.PI);

        System.out.println(" ");

        /*
         * Input
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.next();

        System.out.println("Byte: ");
        byte numByte = scanner.nextByte();

        System.out.println("Int: ");
        int numInt = scanner.nextInt();

        System.out.println("Float: ");
        float numFloat = scanner.nextFloat();

//        System.out.println("Double: ");
//        double numDouble = scanner.nextDouble();

        System.out.println("Boolean: ");
        boolean bool = scanner.nextBoolean();

        System.out.println("Ok!");


    }
}
