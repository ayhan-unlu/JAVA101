package ebebekPracticum.Homework;

import java.util.Scanner;

public class SubtractFiveAddFive_Recursive {

    //recursive function for decreasing 
    static int fSubtractFive(int a) {
        System.out.print(a + " ");
        if (a <= 0) {
            {
                {
                    return a;
                }
            }
        }
        return         fSubtractFive(a - 5);

    }
    //recursive function for increasing 

    static int fAddFive(int a1, int a) {
        if (a1>a)
            return a1;
        else {
            System.out.print(a1 + " ");
            fAddFive(a1 + 5, a);
        }

        {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please Enter Number \"n\" : ");
        int a =scan.nextInt();
        scan.close();
//first decreasing recursive function is executed
        fAddFive(fSubtractFive(a)+5, a);
    }
}