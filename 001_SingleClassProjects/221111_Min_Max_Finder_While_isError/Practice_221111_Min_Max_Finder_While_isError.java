import java.util.Scanner;

public class Practice_221111_Min_Max_Finder_While_isError {

    // method for printing invalid input message
    public static void printInvalidInputMessage() {
        System.out.println("Sorry but You have entered an invalid value.\nThe input must be pozitive.");
    }

    public static void main(String[] args) {


        //n is the amount of the numbers to be examined, largest&smallest numbers are at the limits of integer. 

        int n = 0, number, largestNumber = -2_147_483_647, smallestNumber = 2_147_483_647;

        boolean isError = true;

        Scanner scan = new Scanner(System.in);

        while (isError) {
            System.out.print("How Many Numbers Do You Want to Use? ");
            n = scan.nextInt();
            printInvalidInputMessage();
            if (n > 0) {
                isError = false;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Please Enter Number " + i + ":");
            number = scan.nextInt();
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }

        }
        scan.close();
        System.out.println("The Smallest Number is : " + smallestNumber + 
        "\nThe Largest Number is : " + largestNumber);
    }
}