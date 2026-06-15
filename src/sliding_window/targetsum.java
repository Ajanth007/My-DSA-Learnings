package sliding_window;

import java.util.HashMap;

public class targetsum {
    public static void main(String[] args) {

        targetsum ts = new targetsum();

        int arr[] = {3, 4, -7, 1, 3, 3, 1, -4};
        int tsum = 7;
        int res = ts.tgsum(arr, tsum);

        System.out.println(res);
        ;
    }

    private int tgsum(int[] arr, int tsum) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {


        }


        return tsum;
    }
}