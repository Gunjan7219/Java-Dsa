import  java.util.Arrays;



public class Reverse {
    public static void main(String[] args) {
        int []arr={12,34,56,68,46};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void reverse(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr,int index1,int index3)
    {
        int temp=arr[index1];
        arr[index1]=arr[index3];
        arr[index3]= temp;
    }
}

