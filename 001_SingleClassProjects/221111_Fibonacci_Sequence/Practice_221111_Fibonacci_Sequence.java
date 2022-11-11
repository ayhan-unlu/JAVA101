package ebebekPracticum.Homework;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        //gets the number of elements for Fibonacci Sequence
    
        System.out.print("Please Enter The Number of Elements You Want in Fibonacci Sequence : ");
        int n = scan.nextInt();
        scan.close();

        int a , b = 1, c = 0;

        //Sequence starts with 0 as described in the link: https://en.wikipedia.org/wiki/Fibonacci_number

        System.out.print("Fibonacci Sequence with "+ n+" Elements : \n");
        for (int i = 0; i < n; i++) {

            System.out.print(c + " ");

            a = b;
            b = c;

            c = a + b;
        }
    }
}
