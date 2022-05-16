package work_shop_02;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[100];
        evenNumber01();
        System.out.println("==============");
        evenNumber02();
//        input(3, arr);
//        print(3, arr);

        int[] arrays = {2,6,8,7,55,10};

        bubbleSort(arrays);
        System.out.println("=============");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        System.out.println("===========");
        int max = maxArrays(arrays);
        System.out.println("Max:"+max);

    }

    private static void evenNumber01() {
        for (int i = 2; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(+i);
            }
        }
    }

    private static void evenNumber02() {
        int digits = 2;
        while (digits <= 11) {
            if (digits % 2 == 0) {
                System.out.println(digits);
            }
            digits++;
        }
    }

    private static void input(int n, int... arr) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] =");
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int n, int... arr) {
        System.out.println("Arrays:1 ");
        for (int i = 0; i < n; i++)
            System.out.print("\t" + arr[i]);

    }

    private static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    private static int maxArrays(int ... arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


}

