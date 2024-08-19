import java.util.*;
public class Stringvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        char []ch=s.toCharArray();
        String s1="";

        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
               continue;
            }
            else{
                s1=s1+s.charAt(i);
            }

        }
        System.out.println(s1);
    }
    }

