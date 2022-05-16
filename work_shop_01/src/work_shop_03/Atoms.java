package work_shop_03;

import java.util.Scanner;

public class Atoms {
    private static final Scanner scanner = new Scanner(System.in);

    private int number;
    private String symbol;
    private String fullName;
    private float weight;


    public Atoms() {
    }

    public Atoms(Integer number, String symbol, String fullName, Float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullName = fullName;
        this.weight = weight;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Atoms(Atoms atoms) {
        this.number = atoms.getNumber();
        this.symbol = atoms.symbol;
        this.fullName = atoms.getFullName();
        this.weight = atoms.getWeight();
    }

    @Override
    public String toString() {
        return "Atoms{" +
                "number=" + number +
                ", symbol='" + symbol + '\'' +
                ", fullName='" + fullName + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void input(Atoms atoms){

        System.out.print("Enter atomic number: ");
        atoms.setNumber(Integer.parseInt(scanner.nextLine()));

        if(atoms.getNumber() == 0)
            return;

        System.out.print("Enter symbol: " );
        atoms.setSymbol(scanner.nextLine());

        System.out.print("Enter full name: ");
        atoms.setFullName(scanner.nextLine());

        System.out.print("Enter atomic weight: ");
        atoms.setWeight(Float.parseFloat(scanner.nextLine()));
    }
}
