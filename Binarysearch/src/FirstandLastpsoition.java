public class FirstandLastpsoition {
    public static void main(String[] args) {

        int[] nums = {1, 2, 7, 7, 7, 7, 8, 9, 0};
        int[] ans = {-1, -1};
        //check for the first occurence
        ans[0] = search(nums, 7, true);
        ans[1] = search(nums, 7, false);

        System.out.println(ans);

    }


    static int search(int[] nums, int target, boolean startindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start = (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential ans found means middle but we dont know if there is another same number in start of end of nums
                ans = mid;
                if (startindex)//if start inndex =true means if we foyund the target element so we check for start index
                {
                    end = mid - 1;
                } else {
                    start = mid + 1;//we check for end index
                }
            }
        }
            return ans;
        }
    }

