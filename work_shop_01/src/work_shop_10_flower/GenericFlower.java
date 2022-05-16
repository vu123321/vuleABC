package work_shop_10_flower;

import work_shop_10_car.Car;

import java.util.*;


/**
 * •	Add: add new item of Flower to a
 * •	Display: display all items of a
 * •	sort(): sort as descending by Price and display all items of a
 * •	search(Flower f): check and return whether f is exists in a or not.
 * •	delete(int pos): remove the item at the position pos of a.
 * @param <E>
 */
public class GenericFlower<E> {
    private List<E> list = new ArrayList<>();

    public List<E> addFlower(E t) {
        list.add(t);
        return list;
    }

    public void display(){
        for (E elements : list) {
            System.out.println(elements);
        }
    }

    public void sort(){
        list.sort((Comparator<? super E>) Comparator.comparing(Flower::getPrice).reversed());
    }

    public  boolean search(E e){
      if (list.contains(e)){
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
