package work_shop_05.solution1;

public class PhoneNumber {
    protected int area;
    protected String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public void display(){
        System.out.println(this.area+ "--" +this.number);
    }
}
