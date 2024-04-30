import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.println("1.Addition" + "   " + "2.Substraction" + "   " + "3.Multiplying" + "   " + "4.Division" + "  " + "5.Reminder");
        System.out.println("Enter the choice :");
        int cal = sc.nextInt();
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

            switch (cal) {
                case 1:
                    ans = num1 + num2;
                    System.out.println(ans);
                    break;

                case 2:
                    ans = num1 - num2;
                    System.out.println(ans);
                    break;

                case 3:
                    ans = num1 * num2;
                    System.out.println(ans);
                    break;

                case 4:
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println(ans);
                    }

                    break;

                case 5:
                    ans = num1 % num2;
                    System.out.println(ans);
                    break;

            }
        }
    }
