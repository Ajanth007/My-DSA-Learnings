package sliding_window;

public class slidingbsic {

    public static void main(String[] args) {

        slidingbsic sl = new slidingbsic();
        int arr[]= {2,9,31,-4,21,7};
        int k = 3;

       sl. max(  arr,k);


    }
    public void max( int[] arr,int k){

        int cusum = 0;
        int msum = -1;

        //first window
        for (int i = 0; i < k; i++) {
            cusum += arr[i];
        }
        msum = cusum;

        for (int i = k; i < arr.length-1; i++) {

            cusum = cusum +arr[i]-arr[i-k];

            msum = Math.max(cusum,msum);

        }


        System.out.println(msum);
    }
}
