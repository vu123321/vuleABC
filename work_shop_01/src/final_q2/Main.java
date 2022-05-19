package final_q2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {// ======= DO NOT EDIT MAIN FUNCTION ============


    public static void f1(List<Integer> list) {
        int curPrime = -1;
        for (int i = 0; i < list.size(); i++) {
            if (isPrimeNumber(list.get(i))) {
                curPrime = i;
            }
        }
        if (curPrime > 0) {
            int newPrime = list.get(curPrime) + 1;
            list.set(curPrime, newPrime);
        }


    }

    private static boolean isPrimeNumber(Integer n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Enter number of item: ");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + i + " (th): ");
            a.add(Integer.parseInt(in.readLine()));
        }
        f1(a);
        System.out.println("OUTPUT:");
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
