package matrix;

import java.util.Scanner;

public class returnaHighestOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int maxrow = 0;
        int row_index = -1;

        for (int i = 0; i < r; i++) {

            int tempmax = 0;

            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 1) {
                    tempmax++;
                }
            }

            if (tempmax > maxrow) {
                maxrow = tempmax;
                row_index = i;
            }
        }

        System.out.println("Array");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maximum Ones: " + maxrow);
        System.out.println("Row Index: " + row_index);
    }
}
