package final_q1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    // ======= DO NOT EDIT MAIN FUNCTION ============


    /**
     * Count the number of words in s that contain at least a vowel letter
     *
     * @param s - an input string
     * @return - number of words in an input string that contain at least a vowel letter
     */
    public static int f1(String s) {
        List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String lowerCaseString = s.toLowerCase();

        int count = 0;
        for (String sp : lowerCaseString.split(" ")) {
            for (int i = 0; i < sp.length(); i++) {
                if (characters.contains(sp.charAt(i))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        System.out.print("Enter a string s: ");
        s = in.readLine();
        System.out.println("OUTPUT:");
        System.out.println(f1(s));
    }
}
