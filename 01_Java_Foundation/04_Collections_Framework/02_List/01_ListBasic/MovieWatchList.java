/*Problem 2 — Add an Element at a Specific Index
Problem Statement

Create a Movie Watchlist using List<String>.

Initially add:

Inception
Interstellar
Avatar
Titanic

You forgot to add "The Dark Knight" between Interstellar and Avatar.

Insert "The Dark Knight" at the correct index and display the updated List. */
import java.util.ArrayList;
import java.util.List;
public class MovieWatchList {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("Interstellar");
        movies.add("Avatar");
        movies.add("Titanic");

        System.out.println("Original Watchlist:");
        System.out.println(movies);

        movies.add(2, "The Dark Knight");

        System.out.println("Updated Watchlist:");
        System.out.println(movies);
        }
}
