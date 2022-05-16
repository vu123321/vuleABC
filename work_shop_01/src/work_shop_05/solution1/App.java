package work_shop_05.solution1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inputData();
    }

    private static void inputData() {
        PhoneNumber[] phoneList = new PhoneNumber[1000];
        System.out.println("Enter list of phone numbers\n" + "-----------------------------------------");
        for (int i = 0; i < phoneList.length; i++) {
            System.out.print("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit):  ");
            int chooses = sc.nextInt();
            int area;
            String number, countryCode;
            switch (chooses) {
                case 1:
                    System.out.print("Enter area code: ");
                    area = sc.nextInt();
                    System.out.print("Enter number: ");
                    number = sc.next();
                    phoneList[i] = new PhoneNumber(area, number);
                    break;
                case 2:
                    System.out.print("Enter country code: ");
                    countryCode = sc.next();
                    System.out.print("Enter area code: ");
                    area = sc.nextInt();
                    System.out.print("Enter number: ");
                    number = sc.next();
                    phoneList[i] = new IntPhoneNumber(countryCode, area, number);
                    break;
                case 0:
                    Arrays.stream(phoneList).filter(Objects::nonNull).forEach(PhoneNumber::display);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter failed! Reaction...");
            }
        }
    }
}
