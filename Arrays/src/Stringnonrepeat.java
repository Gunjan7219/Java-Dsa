import java.util.*;
public class Stringnonrepeat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}
