package Giris.Practices;

import java.util.Scanner;

public class Practice_220612_Leap_Year_Calculator {
    public static void main(String[] args) {

        int year, mode1, mode2;
        boolean leap = false;
        boolean isError;

        Scanner inp = new Scanner(System.in);
        String firstSIn = "Please Enter The Year : ";
        String firstSOut = " is a Leap Year";
        String secondSOut = " is NOT a Leap Year";
        String errorMessage = "Invalid Input";

        System.out.print(firstSIn);
        year = inp.nextInt();
        if (year <= 0) {
            isError = true;
        } else {
            try {
                isError = false;
                mode1 = year % 4;
                mode2 = year % 400;
                switch (mode1) {
                    case 0 -> {
                        leap = true;
                        if (year % 100 == 0) {
                            leap = mode2 == 0;
                        }
                    }
                    case 1, 2, 3 -> leap=false;
                    default -> isError = true;
                }
                if (leap) {
                    System.out.println(year + firstSOut);
                } else {
                    System.out.println(year + secondSOut);
                }
            } catch (Exception e) {
                isError = true;
            }
        }
        if (isError) {
            System.out.println(errorMessage);
        }
    }
}