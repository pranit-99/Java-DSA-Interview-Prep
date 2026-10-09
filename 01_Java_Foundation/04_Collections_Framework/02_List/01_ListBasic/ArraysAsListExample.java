import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

    public static void main(String[] args) {

        List<String> fruits =
                Arrays.asList("Apple", "Banana", "Mango");

        System.out.println(fruits);

        fruits.set(1, "Orange");

        System.out.println(fruits);
    }
}
