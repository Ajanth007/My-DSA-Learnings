package String;

import java.util.Scanner;

public class spg1 {
    public static void main(String[] args) {

        // inp ; set135fg
        // out 3 -> no of digits

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int digit=0;

        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                digit += 1;
            }
        }
        System.out.println(digit);
    }
}
