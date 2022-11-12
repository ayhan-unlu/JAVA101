import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //the matrix's dimension: 2x3
        int row = 2;
        int column = 3;

        int arr[][] = new int[row][column];

        System.out.print("Please Enter the Matrix You Want to Transpose: (2x3)");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //elements are taken from the user one by one 
                System.out.print("Please Enter the ["+i+","+j+"] Element of the Matrix: ");
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();

        //input matrix is printed
        System.out.println();
        System.out.print("Input Matrix :(2x3)");
        System.out.println(); 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        //Transpose matrix is printed

        
        System.out.println();
        System.out.print("Transpose Matrix :(3x2)");
        System.out.println();
        
        //transposed matrix is printed
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}

