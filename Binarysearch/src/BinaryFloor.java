public class BinaryFloor {
    public static void main (String[] args)
    {
        int []arr={1,3,5,8,10,14,16,20};
        int target=15;
        System.out.println(binu(arr,target));




    }
    static int binu(int[] arr,int target)
    {
        int start =0;
        int end=arr.length-1;
        while (start <= end) {
            if(target<arr.length-1)
            {
                return -1;
            }
            int mid=start+(end-start)/2;

            if(target>arr [mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }

        }return end;
    }
}
