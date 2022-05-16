package work_shop_08;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    private static final String file = "E:\\DU11-TRAINNING\\work_space\\work_shop_01\\src\\text.txt";

    public static void main(String[] args) {
        menu();
        boolean check = true;
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    menu();
                    saveToFile();
                    break;
                case 2:
                    try {
                        menu();
                        readToFile();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("TAM BIET!!");
                    check = false;
                    break;
            }
        } while (check);

    }

    private static void menu() {
        System.out.println("Menu");
        System.out.println("1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File");
        System.out.println("3. Exit");
        System.out.println("Your choice:");
    }

    private static void readToFile() throws IOException {
        List<Student> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(new FileInputStream(file), "UTF-8"));
        String readLine = reader.readLine();
        while (readLine != null) {
            String[] values = readLine.split("\\s");
            Student student = new Student(values[0], Integer.parseInt(values[1]), Float.parseFloat(values[2]));
            list.add(student);
            readLine = reader.readLine();
        }
        for (Student s: list) {
            System.out.println(s.toString());
        }
        reader.close();
    }

    public static void saveToFile() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("le hoang vu", 100, 8.66f));
        studentList.add(new Student("le hoang vu", 100, 8.66f));
        studentList.add(new Student("le hoang vu", 100, 8.66f));
        studentList.add(new Student("le hoang vu", 100, 8.66f));


        try {
            FileOutputStream writeData = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(writeData);
            for (Student s : studentList) {
                outputStream.writeObject(s.toString());
            }

            writeData.flush();
            writeData.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
