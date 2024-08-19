public class Exmples {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int start=0;
        int end=arr.length-1;

        for (int i = start; i < arr.length - 1; i++) {
            for (int j = end; j < arr.length; j++) {
                if (arr[j] == 7) {
                    System.out.println(arr[j] );


                } else {
                    System.out.println("-1,-1");
                }
            }
        }

    }}
