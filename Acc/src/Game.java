import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.equals("rock")){
            System.out.println("paper");
        }
        else if(str.equals("paper")){
            System.out.println("scissors");
        }
        else{
            System.out.println("rock");
        }
    }
}
