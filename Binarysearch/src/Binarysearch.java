public class Binarysearch {
    public static void main (String[] args)
    {
        int []arr={1,23,45,67,89,90,122,134};
        int target=134;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int []arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        //find mid

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
              end=mid-1;
            } else if (target > arr[mid]) {
                start= mid + 1;
            } else {
                return mid;
            }

        }return -1;
    }
}
