import java.sql.SQLOutput;
import java.util.Scanner;
public class fibonachi {
    public static void main(String[]  args)
    {
       Scanner sc = new Scanner(System.in);
       /*int n = sc.nextInt();
       int a=0;
       int b=1;
       int count=2;
       while(count<=n)
       {
           int temp=b;
           b=a+b;
           a = temp;
           count++;
       }
        System.out.println(b);
*/
       // or with the use of for loop

        int term = sc.nextInt();
        int c =0;// we are assigning the value because we need two number to add to get the fibonacci series
        int d=1;
        int e;
        for (int i =0;i<=term;i++)
        {
            System.out.println(c);//we have to print a because it is starting number
            e=c+d;
            c=d;// assigning the value of b to a
            d=e;//assigning the value of c to a

        }

    }

}
