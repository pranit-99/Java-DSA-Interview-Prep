/*Part 3 — ListIterator

ListIterator is more powerful than a normal Iterator and is specifically designed for Lists.

It can move:

Forward  →
Backward ← */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

        ListIterator<String> iterator =
                languages.listIterator();

        System.out.println("Forward:");

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        System.out.println("\nBackward:");

        while (iterator.hasPrevious()) {

            System.out.println(iterator.previous());
        }
    }
}
