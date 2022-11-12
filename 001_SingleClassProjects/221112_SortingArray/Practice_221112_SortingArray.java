import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of elements You want in the array: ");
        int n = scan.nextInt();
        
        //the length of the array is established
        int[] arr = new int[n];
        //input numbers are assigned to the indices of the array 
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter the number indexed \"" + i + "\" in the array: ");
            arr[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.print("Sorted Array :");
        System.out.println(Arrays.toString(arr));
    }
}
