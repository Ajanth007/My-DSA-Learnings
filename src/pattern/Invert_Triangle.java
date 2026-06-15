package pattern;

import java.util.Scanner;

public class Invert_Triangle {
//    Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
//
//            *****
//
//            ****
//
//            ***
//
//            **
//
//            *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
