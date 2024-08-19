import java.util.*;
public class Stringpalin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s==rev) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
