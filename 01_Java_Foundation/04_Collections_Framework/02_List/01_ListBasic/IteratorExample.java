import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Boston");
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Seattle");

        Iterator<String> iterator = cities.iterator();

        while (iterator.hasNext()) {

            String city = iterator.next();

            System.out.println(city);
        }
    }
}
/*An Iterator allows us to move through elements one at a time. */