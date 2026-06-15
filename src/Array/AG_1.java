package Array;

public class AG_1 {
    public static void main(String[] args) {

        int arr[] = {7, 2, 9, 1, 5, 3};
        AG_1 a= new AG_1();

        int minvalue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }

        System.out.println("min value : "+minvalue);

        //largest value

        int maxvalue= arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        System.out.println("max_value: "+maxvalue);

        //sum of elements in an array

        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            sum += arr[i];
            count++;
        }
        System.out.println("Total_sum : "+sum);

        //Avaerage of all elemts
        System.out.println("Average of all elements : "+(sum/count));

        //searching an element
        a.LinearSearch(7,arr);

        //reverse the array
        System.out.println("reverse  ");
        a.ReverseArray(arr);

















    }

    public void LinearSearch(int S, int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == S) {
                System.out.println("Element found in : "+(i+1));
                break;
            }
        }
    }

    public void ReverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;         // 7, 2, 9, 1, 5, 3

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
