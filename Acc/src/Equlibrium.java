// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Equilibrium{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int d=n/2;
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<d;i++){
            sum=sum+arr[i];
        }
        for(int i=d+1;i<n;i++){
            sum1=sum1+arr[i];
        }
        if(sum==sum1){
            System.out.println(arr[d]);
        }
        else{
            System.out.println("not equi");
        }
    }

}
