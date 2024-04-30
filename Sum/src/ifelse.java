import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
       /* if (salary > 3000)
        {
            System.out.println("salary is greater than intial");

        }
        else
        {
            System.out.println("Salary is same");
        }*/

        if (salary > 10000)
        {
             salary +=2000;// salary = salary +2000
        }
        else if (salary> 100000) {
            salary += 3000;
        }
        else {
            salary += 4000;
        }
        System.out.println(salary);
    }
}
