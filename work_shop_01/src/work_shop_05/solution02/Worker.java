package work_shop_05.solution02;

public class Worker extends Person {

    private double hrs;
    private final double RATE = 5.5;

    public Worker() {
    }

    public Worker(String name, double hrs) {
        super(name);
        this.hrs = hrs;
    }



    @Override
    public void display() {
        System.out.println(super.toString() + " - Worker salary: " + this.getSalary());
    }

    @Override
    public double getSalary() {
        return this.hrs * RATE;
    }
}
