import java.util.Scanner;
public class Nestedswitchcase {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Roll no");
        int Sid=sc.nextInt();
        String Dept=sc.next();
        switch(Sid)
        {
            case 1:
                System.out.println("Gunjan Mahajan");
                break;

            case 2:
                System.out.println("yash upare");
                break;
            case 3:
                System.out.println("Kshitija Mande");
                break;
            case 4:
                System.out.println("Mandu");
                switch(Dept)
                {
                    case "dept":
                    System.out.println("Entc");
                    break;
                    default:
                        System.out.println("Enter the valid number");
                }



        }
    }
}
