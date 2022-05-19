import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Outer {
    public static void main(String[] args) {


    }

    public static <T> List<T> asList1(T ... elements) {
        ArrayList<T> temp = new ArrayList<>();
        for(T element : elements) {
            temp.add(element);
        }
        return temp;
    }

    public static <T> List<T> asList2(T... elements) {
        ArrayList<T> temp = new ArrayList<>(Arrays.asList(elements));
        return temp;
    }

    @SafeVarargs
    public static <T> List<?> asList3(T ... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    @SafeVarargs
    public static <T> List<?> asList4(T... elements) {
        return new ArrayList<T>(Arrays.asList(elements));
    }
}