

// if we have to find the number greater than equal to target
public class Binaryceil {
    public static void main (String[] args)
    {
        int []arr={3,9,12,17,19,20,22,29,30};
        int target=21;
        System.out.println(binu(arr,target));




    }
    static int binu(int[] arr,int target)
    {
        int start =0;
        int end=arr.length-1;
        while (start <= end) {
if(target>arr.length-1)
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

        }return start;// condition for breaking loop or when the while loop breaks the condition get violate is start =mid +1; or start =end+1; because at the end all the pointers which re start and end middle point towards only one number
    }
}
