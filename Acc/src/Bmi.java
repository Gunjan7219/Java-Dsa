import java.util.*;

public class Bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        float height = sc.nextFloat();
        float h=height*height;

        float bmi = (kg / (height*height));


        if (bmi < 18) {
            System.out.println(0);
        } else if (bmi >= 18 && bmi < 25) {
            System.out.println(1);
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println(2);
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println(3);
        } else if (bmi >= 40) {
            System.out.println(4);
        }
    }
}
