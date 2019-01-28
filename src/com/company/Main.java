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

        if (a > b && a > c) {
            if(b > c) {
                System.out.print("The numbers from smallest to largest are : " + c + ", " + b + ", " + a);
            } else
                System.out.print("The numbers from smallest to largest are : " + b + ", " + c + ", " + a);
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.print("The numbers from smallest to largest are : " + c + ", " + a + ", " + b);
            } else {
                System.out.print("The numbers from smallest to largest are : " + a + ", " + c + ", " + b);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.print("The numbers from smallest to largest are : " + b + ", " + a + ", " + c);
            } else
                System.out.print("The numbers from smallest to largest are : " + a + ", " + b + ", " + c);
        }
    }
}
