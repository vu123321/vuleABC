package work_shop_05.solution02;

public class Officer extends Person{

    private double salary;

    public Officer(double salary) {

        this.salary = salary;
    }

    public Officer(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void display() {

    }

    @Override
    public double getSalary() {
        return 0;
    }
}
