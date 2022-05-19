package lesson01_minimum_increments;

import java.util.Arrays;

public class MinimumIncrements {


    public static void main(String[] args) {


        int[] arrays = {1, 4, 3, 4};
        minimumIncrements(arrays);
    }

    private static void minimumIncrements(int... arrays) {
        Arrays.sort(arrays);

        System.out.println("Given Input: " + Arrays.toString(arrays));


        int previous = arrays[0];
        int minimumIncrements = 0;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] <= previous) {
                int temp = arrays[i];
                arrays[i] = previous;
                arrays[i]++;
                if (arrays[i] > arrays.length) {
                    return;
                }
                minimumIncrements += arrays[i] - temp;
            }
            previous = arrays[i];
        }

        System.out.println("Array: " + Arrays.toString(arrays) + ", minimumIncrements : " + minimumIncrements);
    }
}
