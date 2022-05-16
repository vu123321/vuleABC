package work_shop_10_car;

public class Main {
    public static void main(String[] args) {
        GenericCar<Car> genericCar = new GenericCar<>();
        genericCar.add(new Car("BMW1",10000.f,"Tesla"));
        genericCar.add(new Car("BMW2",10000.f,"Tesla"));
        genericCar.add(new Car("BMW3",10000.f,"Tesla"));
        genericCar.display();
        System.out.println(genericCar.checkEmpty());
        System.out.println(genericCar.getSize());
        System.out.println(genericCar.delete(2));
        System.out.println("==============");
        genericCar.display();
    }
}
