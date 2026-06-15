package Array;

import java.util.Scanner;

public class AG2 {
    public static void main(String[] args) {
        //maximun and minum num
        //ip : 1234
        //out 14

        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int max = 0;
        int min = 9;


        while( str > 0){

            int digit = str%10;

            max= Math.max(digit,max);
            min = Math.min(min,digit);

            str= str/10;
        }
        System.out.println(max + " "+ min);

    }
}
