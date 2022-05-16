package work_shop_10_flower;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GenericFlower<Flower> genericFlower = new GenericFlower<Flower>();

        genericFlower.addFlower(new Flower("hoa hong 1", 10004.F, "mau do"));
        genericFlower.addFlower(new Flower("hoa hong 2", 2000.F, "mau do"));
        genericFlower.addFlower(new Flower("hoa hong 3 ", 555.F, "mau do"));
        genericFlower.addFlower(new Flower("hoa hong 3 ", 5556699.F, "mau do"));
        genericFlower.addFlower(new Flower("hoa hong 3 ", 55500.F, "mau do"));
        genericFlower.display();

        System.out.println("========================");
        genericFlower.sort();
        genericFlower.display();
        System.out.println(genericFlower.search(new Flower("hoa hong 3 ", 55500.F, "mau do")));
        System.out.println("=================================qqq");

        System.out.println(genericFlower.search(new Flower("hoa hong 111 ", 555.F, "mau do")));




    }
}
