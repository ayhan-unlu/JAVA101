package ebebekPracticum.Homework;

public class PrimeNumbers {
    public static void main(String[] args) {

        //finds the prime numbers between 2-100(both included)

        for (int i = 2; i <= 100; i++) {

            for (int k = 2; k <= i; k++) {

                if ((i % k == 0) && (i != k)) {

                    break;
                } else if ((i % k == 0) && (i == k)) {//finds prime number here then prints
                    System.out.print(i +" ");
                }
            }
        }
    }
}