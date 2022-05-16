package work_shop_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student01 = new Student("LE HOANG VU ", "DU11 ", 101, 20);
        Student student02 = new Student("LE HOANG VU ", "DU11 ", 101, 20);


        Student sv2 = new Student();
        System.out.println("Enter name ");
        sv2.setName(sc.nextLine());
        System.out.println(" Enter class name:");
        sv2.setClassName(sc.nextLine());
        System.out.println("Enter id");
        sv2.setId(sc.nextInt());
        System.out.println("Enter Age ");
        sv2.setAge(sc.nextInt());

        System.out.println(student01);
        System.out.println(student02);
        System.out.println(sv2);
    }
}
