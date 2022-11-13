

import java.util.Scanner;

public class Practice_221111_Fibonacci_Sequence {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        //gets the number of elements for Fibonacci Sequence
    
        System.out.print("Please Enter The Number of Elements You Want in Fibonacci Sequence : ");
        int numberOfElements = scan.nextInt();
        scan.close();

        int numberOne , numberTwo = 1, result = 0;

        //Sequence starts with 0 as described in the link: https://en.wikipedia.org/wiki/Fibonacci_number

        System.out.print("Fibonacci Sequence with "+ numberOfElements+" Elements : \n");
        for (int i = 0; i < numberOfElements; i++) {

            System.out.print(result + " ");

            numberOne = numberTwo;
            numberTwo = result;
            result = numberOne + numberTwo;

        }
    }
}
