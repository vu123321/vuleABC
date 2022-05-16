package work_shop_08;

import java.io.*;

public class ReaderFile {


    public static void main(String[] args) {
        File file = new File("E:\\DU11-TRAINNING\\work_space\\work_shop_01\\src\\text.txt");
        String line = null;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);
        assert line != null;
        String lineNew = line.replaceAll("a", "d")
                .replaceAll("b", "e")
                .replaceAll("c", "f");
        System.out.println(lineNew);
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(lineNew);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
