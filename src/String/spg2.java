package String;

import java.util.Locale;
import java.util.Scanner;

public class spg2 {
    public static void main(String[] args) {
        // count vowels and consonants

        //Hello Welcome

        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine().toLowerCase(Locale.ROOT);
        int cons = 0;
        int vow =0;

        for (char ch :str.toCharArray()){
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                vow +=1;
            }
            else
                cons+=1;

        }

        System.out.println(vow+" "+cons);

    }
}
