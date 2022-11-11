package ebebekPracticum.Homework;
import java.util.Scanner;

public class Practice_221111_Perfect_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter a number for Perfect Number diagnosis: ");

        //number is taken as a variable

        int number = scan.nextInt();
        scan.close();

        int sum = number;

        for (int i = 2; i <= number; i++) {

            //finding divisors and dividing it to the number and taking out of it 
            if (number % i == 0) {
                sum -= number / i;
            }
        }

        //if sum is equal to zero then it s printed out that the number is perfect
        if (sum == 0) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }
    }
}