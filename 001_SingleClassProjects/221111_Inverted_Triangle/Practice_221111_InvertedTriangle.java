
import java.util.Scanner;

public class Practice_221111_InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // number of lines is taken from the user

        System.out.print("Please Enter the Number of Lines for the Triangle : ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");//spaces defined
            }
            for (int k = 1; k <= 2 * n - 2 * i + 1; k++) {
                System.out.print("*");// asteriks defined
            }
            System.out.println();
        }
    }
}