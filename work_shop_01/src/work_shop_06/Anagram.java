package work_shop_06;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toLowerCase(Locale.ROOT).toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main(String[] args) {

        String name1  = "Le hoang vu";
        String name2 = "vu hoang le";
        if (isAnagram(name1, name2)){
            System.out.println("chung no la doi so cua nhau!!");
        }
        else {
            System.out.println("khong phai!!");
        }
    }
}
