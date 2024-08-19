

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindallDuplicates {
    public static void main(String[] args) {
       int []arr={1,3,3,2};
       System.out.println(duplicates(arr));
        }
static int duplicates(int[]arr){
    int i = 0;
    while (i < arr.length) {
        int correct = arr[i] - 1;
        if (arr[i] != arr[correct]) {
            swap(arr, i, correct);
        } else {
            i++;
        }
    }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
               return arr[index];
            }
        }

        return i;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}