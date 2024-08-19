public class Infinitearray {
    public static void main(String[] args)
    {int []arr={1,22,3,6,7,9,12,15,16,17,19,24,26,27,29,50};
        int target=24;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[]arr,int target)
    {
        // first find the range
        //first start with the box of size two
        int start=0;
        int end=1;
        //condition for the target lie int the range
        while(target>arr[end])
        {
            int temp=end+1;//this is my new start
                //double the box value
            // end=previous end+size of box*2
                end=end+(end-start)*2;//
            ;
                start=temp;

            }return binarysearch(arr,target,start,end);

        }
    static int binarysearch(int []arr,int target,int start,int end) {
        start = 0;
         end = arr.length - 1;
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

