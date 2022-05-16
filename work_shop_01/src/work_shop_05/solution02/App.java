package work_shop_05.solution02;

import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person[] e = new Person[2];
        int n = 0, c;

        do {
            System.out.println("Worker (1); Officer(2): ");
            c = sc.nextInt();
            if (c == 1) {
                System.out.print("Enter worker name: ");
                String name = sc.next();
                System.out.print("Enter worker working hours: ");
                int hrs = sc.nextInt();
                e[n] = new Worker(name, hrs);

                n++;
            } else if (c == 2) {
                System.out.print("Enter Officer name: ");
                String name = sc.next();
                System.out.print("Enter officer salary: ");
                double salary = sc.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        } while (c != 0);
        for (int i = 0; i < n; i++) {
            if (e[i] instanceof Worker)
                e[i].display();
        }
    }
}
