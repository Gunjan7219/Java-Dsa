import  java.util.*;
public class Stringreplace {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String s=sc.nextLine();
        String ch="";
String su=" ";
        for(int i=0; i<s.length();i++){
            su=s.replaceAll("[{}()]"," ");

        }
ch=ch+su;
        System.out.println(ch);
    }
}
