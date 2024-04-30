import java.util.Scanner;
public class numberoccurcount {
    public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n=sc.nextInt();
         int count=0;
         while(n>0)
         {
             int rem=n%10;
             if (rem == 5)
             {

                 count++;
             }
             n  = n/10;//divide by 10 so the last number will be removed
         }
        System.out.println(count);
    }
}
