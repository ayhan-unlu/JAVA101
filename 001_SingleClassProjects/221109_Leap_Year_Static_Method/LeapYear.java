package ebebekPracticum.Homework;

import java.util.Scanner;

public class LeapYear {

    // method for printing invalid input message
    public static void printInvalidInputMessage() {
        System.out.println("Sorry but You have entered an invalid value.");
    }

    // method for finding the year whether it is Leap Year or not , if not returns string "not" 
    public static String findLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0))|| (year % 400 == 0)){
            return " ";
        } else
            return " NOT ";
    }

    // method for printing Result 
    public static void printResult(int year, String result) {
        System.out.print("Year " + year + " is"+result+"a Leap Year.");
    }

    public static void main(String[] args) {

        boolean isError = true;// used for invalid input

        Scanner scan = new Scanner(System.in);

        while (isError) {
            System.out.print("Please Enter The Year : ");
            int year = scan.nextInt();

            if (year > 0) {
                String result = findLeapYear(year);
                printResult(year, result);
                isError = false;
            } else {
                printInvalidInputMessage();
                isError = true;
            }
        }

        scan.close();
    }
}