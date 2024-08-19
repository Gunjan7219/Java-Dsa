import java.util.Scanner;
public class Codechef{
 public static void main(String[] args){


     fast(1,5,0);

     int a=0;
     int b=1;
     System.out.println(a);
     System.out.println(b);
  int n=7;
  fast2(a,b,n-2);

 }
 static void fast(int i,int n,int sum)
 {
     if (i==n){
         sum=sum+i;
         System.out.println(sum);
         return;
     }
     sum=sum+i;
     fast(i+1,n,sum);


 }
    static int fast1(int n){
     if(n==0||n==1){
         return 1;
     }
     int a=fast1(n-1);
     int b=n*a;
     return b;
    }
static void fast2(int a,int b,int n){
     if(n==0)
     {
         return;
     }
     int c=a+b;
    System.out.println(c);
     fast2(b,c,n-1);

}
static void fast3(int n){




}
        }
