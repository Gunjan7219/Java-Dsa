public class Magicalnumber {
    public static void main(String[] args) {
        int n = 0;
        int ans = magical(n);
        System.out.println(ans);  // This should print the correct count of numbers with even sum
    }

    static int magical(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int j = i;

            while (j > 0) {
                if ((j & 1) == 1) {
                    sum += 2;  // Add 2 if the bit is 1
                } else {
                    sum += 1;  // Add 1 if the bit is 0
                }
                j >>= 1;  // Shift bits right
            }

            if (sum % 2 == 0) {  // Check if the sum is even
                count++;
            }
        }

        return count;
    }
}
