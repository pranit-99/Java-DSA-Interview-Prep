/*Problem 7 of 8 — Streaming Platform
Media → Movie → PremiumMovie

Now we'll switch to a streaming platform.

This problem focuses on a useful multilevel idea:

The final child can call an inherited method from its grandparent, call another inherited method from its parent, and then execute its own specialized behavior.

We are still not overriding methods yet. We'll keep that for the appropriate inheritance/polymorphism stage.

Problem Statement

Create this hierarchy:

Media
  ↓
Movie
  ↓
PremiumMovie
Level 1 — Media

Fields:

protected String title;
protected int durationMinutes;

Method:

void displayMediaDetails()
Level 2 — Movie

Movie extends Media.

Fields:

protected String genre;
protected double rating;

Method:

void displayMovieDetails()
Level 3 — PremiumMovie

PremiumMovie extends Movie.

Fields:

double baseSubscriptionPrice;
double premiumCharge;

Create:

void displayPremiumDetails()

Calculate:

Total Subscription Cost
= Base Subscription Price + Premium Charge

Also create:

void displayCompleteDetails()

This final method should internally call:

displayMediaDetails();
displayMovieDetails();
displayPremiumDetails(); */
class Media {

    protected String title;
    protected int durationMinutes;

    void displayMediaDetails() {

        System.out.println(
            "Title: " + title
        );

        System.out.println(
            "Duration: " + durationMinutes + " minutes"
        );
    }
}


class Movie extends Media {

    protected String genre;
    protected double rating;

    void displayMovieDetails() {

        System.out.println(
            "Genre: " + genre
        );

        System.out.println(
            "Rating: " + rating
        );
    }
}


class PremiumMovie extends Movie {

    double baseSubscriptionPrice;
    double premiumCharge;

    void displayPremiumDetails() {

        double totalSubscriptionCost =
            baseSubscriptionPrice + premiumCharge;

        System.out.println(
            "Base Subscription Price: $"
            + baseSubscriptionPrice
        );

        System.out.println(
            "Premium Charge: $" + premiumCharge
        );

        System.out.println(
            "Total Subscription Cost: $"
            + totalSubscriptionCost
        );
    }


    void displayCompleteDetails() {

        displayMediaDetails();

        displayMovieDetails();

        displayPremiumDetails();
    }
}


public class StreamingPlatform {

    public static void main(String[] args) {

        PremiumMovie movie =
            new PremiumMovie();

        movie.title = "Interstellar";
        movie.durationMinutes = 169;

        movie.genre = "Science Fiction";
        movie.rating = 8.7;

        movie.baseSubscriptionPrice = 15;
        movie.premiumCharge = 5;

        movie.displayCompleteDetails();
    }
}
