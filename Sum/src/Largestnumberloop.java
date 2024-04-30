import java.util.Scanner;
public class Largestnumberloop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number 1:  ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:  ");
        int b = sc.nextInt();
        System.out.println("Enter the number 3:  ");
        int c = sc.nextInt();

        if(a>b){
            System.out.println("Max number is:"+a);
        } else if (b>c) {
            System.out.println("Max number is:"+b);

        } else if (c>a) {
            System.out.println("Max number is:"+c);

        }
        else {
            System.out.println("All the number are max number");
        }

        //or

        int max=a;
        if(b>max)
        {
            b=max;
        }
        if(c>max)
        {
            c=max;
        }
        System.out.println(max);

    }
}
