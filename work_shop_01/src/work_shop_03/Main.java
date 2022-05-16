package work_shop_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMolecules(List<Molecules> list) {
        System.out.println("------------------------------- LIST OF MOLECULES -------------------------------");
        System.out.format("%-20s %-20s %-15s\n", "Structure", "Name", "Weight");
        for (Molecules i : list) {

            System.out.format("%-20s %-20s %-15s  \n", i.getStructure(), i.getName(), i.getWeight());
        }
    }
    private static List<Molecules> inputMolecules(){

        Molecules mole01 = new Molecules("a","b",222.3f);
        Molecules mole02 = new Molecules("a","b",222.3f);
        Molecules mole03 = new Molecules("a","b",222.3f);
        List<Molecules> list = new ArrayList<>();
        list.add(mole01);
        list.add(mole02);
        list.add(mole03);

        return list;


    }
    private static List<Atoms> inputAtoms() {
        Atoms atoms = new Atoms();
        List<Atoms> list = new ArrayList<>();
        do {
            Atoms.input(atoms);
            if (atoms.getNumber() != 0) {
                list.add(new Atoms(atoms));
            }
        } while (atoms.getNumber() != 0 && list.size() < 10);

        return list;
    }

    private static void displayAtoms(List<Atoms> atomsList) {

        System.out.println("------------------------------- LIST OF ATOMS -------------------------------");
        System.out.format("%-20s %-20s %-15s %-15s  \n", "NUMBER", "SYMBOL ", "FULL NAME", "WEIGHT");
        for (Atoms i : atomsList) {

            System.out.format("%-20s %-20s %-15s %-15s   \n", i.getNumber(), i.getSymbol(), i.getFullName(), i.getWeight());
        }
    }

    private static void endConsole() {
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        displayAtoms(inputAtoms());
        endConsole();
    }
}
