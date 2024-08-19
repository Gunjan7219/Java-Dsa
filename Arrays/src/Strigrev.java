import java.util.*;
public class Strigrev {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        String ans=rev(s);
        System.out.println(ans);
    }
    static String rev(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}
