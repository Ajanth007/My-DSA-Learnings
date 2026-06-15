import java.util.Scanner;

public class pallindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String og = sc.next();
        String rev = "";

        for (int i = og.length()-1; i>=0;i--){
              rev += og.charAt(i);
        }

        System.out.println(og);
        System.out.println(rev);

        if (og.equals(rev)){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }
}
