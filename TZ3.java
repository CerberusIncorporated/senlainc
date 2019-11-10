import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TZ3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter words separated by a space in one line: ");
        String input = reader.readLine();
        String[] words = input.split("\\s+");
        System.out.println("Unsorted array: "+toUP(input));
        Arrays.sort(words);
        System.out.println("Sorted array: "+toUP(Arrays.toString(words)));
        Count(input);
    }

    public static String toUP(String s) {
        char[] answer = s.toCharArray();
        if (Character.isAlphabetic(answer[0])) answer[0] = Character.toUpperCase(answer[0]);
        String z = "" + answer[0];
        for (int i = 1; i < answer.length; i++) {
            if (Character.isAlphabetic(answer[i]) && !Character.isAlphabetic(answer[i - 1]))
                answer[i] = Character.toUpperCase(answer[i]);
            z += answer[i];
        }
        return z;
    }

    public static void Count(String s){
        int word = 0;
        if(s.length() != 0){
            word++;
            for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i) == ' '){
                    word++;
                }
            }
        }
        System.out.println("You enter "+word+" words!");
    }
}

