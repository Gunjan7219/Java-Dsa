import java.util.*;

// here he can climb 3 stair at once, so we have to determine in which house he can climb the stairs
class Climbstair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        int count=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                count=count+1;
            }
        }

        System.out.println(count);
    }

}
