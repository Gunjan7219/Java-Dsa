public class Maxvalue {
    public static void main(String[] args) {
        int[] arr = {12, 23, 4, 5, 66};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }

        }
        return maxval;
    }
// this will give the max value with in the range
    static int maxRange(int[] arr, int start, int end) {
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }

        }
        return maxval;
    }
}