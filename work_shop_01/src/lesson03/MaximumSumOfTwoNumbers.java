package lesson03;

import java.util.*;

public class MaximumSumOfTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {45, 21, 12, 65, 71, 1712, 7121, 77, 86, 55, 64};
        int digits = maximumSum(arr);
        System.out.println(digits);

    }

    public static int digit_sum(int n) {
        int sum = 0;
        while (n >= 10) {
            sum += n % 10;
            n = n / 10;
        }
        sum += n;
        return sum;
    }

    public static int maximumSum(int ... arrays) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = -1;

        for (int i = 0; i < arrays.length; i++) {
            int temp = digit_sum(arrays[i]);

            if (map.containsKey(temp)) {
                map.get(temp).add(arrays[i]);

            } else {
                List<Integer> nums = new ArrayList<>();
                nums.add(arrays[i]);
                map.put(temp, nums);
            }
        }


        for (Integer key : map.keySet()) {
            if (map.get(key).size() < 2) {
                continue;
            }
            Collections.sort(map.get(key));

            List<Integer> num = new ArrayList<>(map.get(key));
            System.out.println();

            int n = num.size();
            sum = Math.max(sum, num.get(n - 1) + num.get(n - 2));
        }
        return sum;
    }
}
