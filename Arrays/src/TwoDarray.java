import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size 1");
       int c=sc.nextInt();
        System.out.println("Enter the array size 2");
       int d = sc.nextInt();
        int[][] a=new int[c][d];
        for(int i=0;i<c;i++) {
            for(int j=0;j<d;j++) {
            a[i][j]=sc.nextInt();
        }

    }
        for(int i=0;i<c;i++) {
            for(int j=0;j<d;j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
        for(int i=0;i<c;i++) {
            System.out.println(Arrays.toString(a[i]));//we can print output like this also in proper format

        }
        System.out.println();
       for(int e[]:a)// Enhanced for loop
       {
           System.out.println(Arrays.toString(e));
       }
    }
}
