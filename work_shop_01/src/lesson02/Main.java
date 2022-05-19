package lesson02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "E:\\DU11-TRAINNING\\work_space\\work_shop_01\\lhvu11.txt";
        FileReader lhvName = new FileReader(fileName);
        SolutionIter solutionIter = new SolutionIter(lhvName);

        for (Integer x : solutionIter) {
            System.out.println(x);
        }
    }

    static class SolutionIter implements Iterable<Integer> {

        @Override
        public Iterator<Integer> iterator() {
            return integerLinkedList.iterator();
        }

        private LinkedList<Integer> integerLinkedList;

        public LinkedList<Integer> getIntegerLinkedList() {
            return integerLinkedList;
        }

        public void setIntegerLinkedList(LinkedList<Integer> integerLinkedList) {
            this.integerLinkedList = integerLinkedList;
        }

        public SolutionIter(Reader inp) {
            LinkedList<Integer> tempList = new LinkedList<>();
            try {
                String line;
                BufferedReader bf = new BufferedReader(inp);
                while ((line = bf.readLine()) != null) {
                    line = line.trim();
                    if (line.charAt(0) == '+' || line.charAt(0) == '-') {
                        if (isNumber(line.substring(1))) {
                            tempList.add(Integer.parseInt(line));
                        }
                    } else if (isNumber(line)) {
                        tempList.add(Integer.parseInt(line));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            integerLinkedList = tempList;
        }

        public boolean isNumber(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }
}
