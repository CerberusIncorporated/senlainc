import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


public class TZ5 {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the length of the sequence from 0 to 100: ");
        try {
            int n = Integer.parseInt(reader.readLine());
            if (!(n < MIN_VALUE || n > MAX_VALUE)) {
                for (int i = MIN_VALUE; i < n + 1; i++) {
                    if (isPalindrome(i)) System.out.println(i);
                }
            } else System.out.println("The length of the sequence must be in the range from 0 to 100.");

        } catch (InputMismatchException | IOException e) {
            System.out.println("Invalid input.");
        }
    }
          static boolean isPalindrome(int i) {
            int next = 0;
            int temp = i;

            while (temp != 0) {
                next = (next * 10) + (temp % 10);
                temp /= 10;
            }
            return i == next;
        }
}



