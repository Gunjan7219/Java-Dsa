


import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google

class FindAllMissing {
    public static void main(String[] args) {
int []arr={};
System.out.println(missing(arr));
    }


    static int missing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

            // just find missing numbers

            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    return index + 1;
                }
            }


        }return i;

    }
        static void swap ( int[] arr, int first, int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }


}
