package ebebekPracticum.Homework;

import java.util.Scanner;

public class PrimeNumbersRecursive {

    public static int findPrimeNumber(int number, int counter) {

        if (number <= 2) {//for declaring 2 as prime and 1 as not prime
            return (number == 2) ? 1 : 0;
        }
        if (number % counter == 0) {
            return 0;
        }
        if (counter * counter > number) {
            return 1;
        }
        return findPrimeNumber(number, (counter + 1));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int a = scan.nextInt();
        scan.close();
        if (findPrimeNumber(a, 2) == 1) {//using boolean for return of the function is avoided
            //1 is for found Prime Number 
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is NOT a Prime Number");
        }
    }
}