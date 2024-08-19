import java.util.*;
public class Bulbonoff {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int count=0;
    int expectvalue=1;
    for(int i=0;i<n;i++){
        if(arr[i]!=expectvalue){
            count=count+1;
            expectvalue=1-expectvalue;
        }
    }
        System.out.println(count);
    }
}
