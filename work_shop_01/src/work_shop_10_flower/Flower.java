package work_shop_10_flower;

import java.util.Objects;

public class Flower {
    private String name;
    private Float price;
    private String color;

    public Flower() {
    }

    public Flower(String name, Float price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) && Objects.equals(price, flower.price) && Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, color);
    }


    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
