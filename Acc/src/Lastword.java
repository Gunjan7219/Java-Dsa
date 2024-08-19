import java.util.*;
import java.lang.*;
public class Lastword {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        String str=sc.next();

        int count=0;
       String s= str.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                  count=0;
            }
            else{
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
