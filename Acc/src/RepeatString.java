import java.util.*;
public class RepeatString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="abc";
        String s="";
        for (int i=1;i<=n;i++){
            s=s+str;
        }
        System.out.println(s);
    }
}
