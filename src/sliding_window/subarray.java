package sliding_window;

public class subarray {
    public static void main(String[] args) {

        // all the average of all sub array
        int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 2;
        subarray sb = new subarray();

        sb.avgsum(arr, k);

    }

    private void avgsum(int[] arr, int k) {

        int sum = 0;
        double avg =0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        avg = (double) sum / k;

//        System.out.println((double) sum / k);

        // sliding window
        for (int i = k; i < arr.length; i++) {

            sum += arr[i];        // add next
            sum -= arr[i - k];    // remove old

            avg += (double) sum / k;

        }
//        System.out.println((double) sum / k);
        System.out.println(avg);
    }
}
