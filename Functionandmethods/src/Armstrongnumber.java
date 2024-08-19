// armstrong number basically mean to take the sepereate number make a cube and add them
import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        iarmstrong(n);
        System.out.println(iarmstrong(n));

    }

    static  boolean iarmstrong(int n)
    {
        int sum=0;
        int original=n;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;

        }
        if(original==sum) {
            return true;
        }

        return false;
    }
}
