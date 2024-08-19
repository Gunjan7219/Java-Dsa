// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Trail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=trav(arr,n);
        System.out.println(ans);
    }

        static public int trav ( int [] arr, int n){

if(n==0){
    return 0;
}
if(n==1){
    return arr[0];
}
            if (arr[0] > arr[1]) {
                return arr[0];
            }

     for(int i=1;i<arr.length-1;i++){
         if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
             return arr[i];
         }
     }
     return -1;

    }

}
