import java.sql.SQLOutput;
import java.util.Scanner;
public class Loop {
    public static void main(String[] arg) {
        int i;

 /*for(i=0;i<5;i++)
       {
           System.out.println("Hello");
       }*/
        for (i = 0; i < 5; i += 2) // i+=2 increment number by 2
        {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(i + 1);

        }

        // While loop
        System.out.println("Enter the number:");
        int p = sc.nextInt();
        while (p <= 5) {
            System.out.println(p);
            p++;
            //break;
        }

        //Do while loop
        int f =1;
        do {

            System.out.println(f);
            f++;
        } while (f <= 4);
        //do while loop execute at least once is it is wrong also
        int g =1;
        do {

            System.out.println("Hello world");

        } while (g !=1);
    }

}
