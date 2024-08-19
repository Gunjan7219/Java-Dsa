import java.util.Scanner;

public class Firstkwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String straw = sc.nextLine(); // Use nextLine() to read the entire line
        String s = "";
        String str = straw.trim(); // Trim leading and trailing spaces
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
            // Stop appending characters after the third word
            if (count == 3) {
                break;
            }
            s = s + str.charAt(i);
        }

        System.out.println(s); // Print the result after trimming any trailing spaces
    }
}
