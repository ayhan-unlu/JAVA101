

import java.util.Scanner;

public class Practice_221112_Exponents_Recursive {

    //recursive method for decreasing power 1 by 1 until it reaches power:0
    static int power(int base, int power) {

        if (power > 0) {//reruns the function recursively until it reaches 0
            return base*power(base, power - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter the Base : ");
        int base = scan.nextInt();

        System.out.print("Please Enter the Power : ");
        int power = scan.nextInt();

        scan.close();

        System.out.println(power(base, power));

    }
}
