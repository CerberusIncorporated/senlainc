import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TZ4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you text");
        String input = bf.readLine();
        System.out.println("Enter the word you want to find in the text");
        String pattern = bf.readLine();
        System.out.println(substringCount(input, pattern));
    }

    public static int substringCount(String s, String pattern) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + pattern.length()).equalsIgnoreCase(pattern)) {
                result++;
                i += pattern.length();
            }
        }
        return result;
    }
}
