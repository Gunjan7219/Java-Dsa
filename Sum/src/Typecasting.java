import java.util.Scanner;
public class Typecasting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = 78.89f;  // this will give the error because the int is small than the float
        int num = (int)(78.89f);// so we use type casting to covert the integer into float
         float num1 = 56;
         // automatic type promotion in expression
        int a= 257;
        byte b= (byte)(a);// we are doing the conversion from integer to byte
        System.out.println(b);// the output is 1 because the range of byte is upto 256 so it does not print value above the 256
        //so here it will printing the reminder of 257 is 1 like 257 % 256 =1

        int number = 'a'; 
        System.out.println(number);  // this print the asci value of a

    }


}