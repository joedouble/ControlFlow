package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter variable a followed by ENTER: ");
        a = number.nextInt();
        System.out.println("You entered " + a + ".");

        System.out.println("Enter variable b followed by ENTER: ");
        b = number.nextInt();
        System.out.println("You entered " + b + ".");

        System.out.println("Enter variable c followed by ENTER: ");
        c = number.nextInt();
        System.out.println("You entered " + c + ".");

        if (a < b && b < c ) {


        }

    }
}
