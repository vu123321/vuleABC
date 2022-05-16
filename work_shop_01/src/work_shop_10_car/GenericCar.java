package work_shop_10_car;

import java.util.ArrayList;
import java.util.List;


/**
 * •	Add: add new item of T to a
 * •	Display: display all items of a
 * •	getSize: return the number item of a
 * •	checkEmpty: check and return whether a is empty or not
 * •	delete(int pos): remove the item at the position pos of a.
 */
public class GenericCar<E extends Car> {
    private List<E> list = new ArrayList<>();

    public List<E> add(E t) {
        list.add(t);
        return list;
    }

    public void display() {
        for (E element : list) {
            System.out.println(element);
        }
    }

    public int getSize() {
        return list.size();
    }

    public boolean checkEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<E> delete(int pos) {
        if (list.isEmpty() || list.size() < pos)
            return list;
        list.remove(pos);
        return list;
    }
}
