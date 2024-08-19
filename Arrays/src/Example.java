import java.util.Scanner;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0) {
            int N = sc.nextInt();
            int C = N % 10;
            int D=0;
            while (N > 0) {
                 D = N / 10;
            }System.out.println(D);

        }

    }
}

