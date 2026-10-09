class Workout {

    protected int durationMinutes;
    protected double bodyWeight;

    void displayWorkout() {

        System.out.println(
            "Duration: " + durationMinutes + " minutes"
        );

        System.out.println(
            "Body Weight: " + bodyWeight + " kg"
        );
    }
}


class Running extends Workout {

    double caloriesPerMinute;

    void calculateRunningCalories() {

        double caloriesBurned =
            durationMinutes * caloriesPerMinute;

        System.out.println(
            "Running Calories Burned: "
            + caloriesBurned
        );
    }
}


class Cycling extends Workout {

    double distanceKm;

    void calculateAverageSpeed() {

        double hours =
            durationMinutes / 60.0;

        double averageSpeed =
            distanceKm / hours;

        System.out.println(
            "Cycling Distance: " + distanceKm + " km"
        );

        System.out.println(
            "Average Speed: "
            + averageSpeed + " km/h"
        );
    }
}


public class FitnessApplication {

    public static void main(String[] args) {

        Running run = new Running();

        run.durationMinutes = 30;
        run.bodyWeight = 75;
        run.caloriesPerMinute = 10;

        run.displayWorkout();
        run.calculateRunningCalories();

        System.out.println("----------------");

        Cycling cycling = new Cycling();

        cycling.durationMinutes = 60;
        cycling.bodyWeight = 75;
        cycling.distanceKm = 25;

        cycling.displayWorkout();
        cycling.calculateAverageSpeed();
    }
}