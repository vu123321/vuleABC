package work_shop_01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter className:");

        String className = sc.nextLine();

        System.out.println("Enter id number:");

        int id = sc.nextInt();

        System.out.println("Enter age:");

        int age = sc.nextInt();
        System.out.println("=================");
        System.out.println("name:" +name);
        System.out.println("className:" +className);
        System.out.println("id:" +id);
        System.out.println("age:" +age);
    }
}
