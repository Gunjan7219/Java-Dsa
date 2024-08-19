import java.util.*;
public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                s=s+'p';
            }
            else if(str.charAt(i)=='p'){
                s=s+'a';

            }
            else{
                s=s+str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
