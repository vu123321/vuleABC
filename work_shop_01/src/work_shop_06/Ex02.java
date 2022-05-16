package work_shop_06;

public class Ex02 {
    public static void main(String[] args) {
        print("le hoang vu");

    }

    private static void print(String str) {
        if (str.length() == 0)
            return;

        System.out.print(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(" " + Character.toUpperCase(str.charAt(i + 1)));
            }
        }
    }
}
