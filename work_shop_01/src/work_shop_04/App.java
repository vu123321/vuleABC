package work_shop_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws IOException {
        f1(input());
    }
    public static int f1(String s){
        String[] array = s.split(" ");
        String regex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(regex);
        int count = 0;
        for(int i = 0; i < array.length; i++){
            Matcher matcher = pattern.matcher(array[i]);
            if (matcher.find()){
                count++;}
        }
        return count;
    }

    private static String input() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        System.out.print("Enter a string s: ");
        s = in.readLine();
        return s;
    }
}
