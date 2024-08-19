
import java.lang.*;


class Patternq
{
    public static void main (String[] args) {
        pattern(4);
    }
    static void pattern(int n){

        // outer loop to handle number of rows
        for (int i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (int j = 1; j <= n; j++) {
                // printing column values upto the row
                // value.
                System.out.print("*");
            }

            // print new line for each row
            System.out.println();
        }
    }


}
