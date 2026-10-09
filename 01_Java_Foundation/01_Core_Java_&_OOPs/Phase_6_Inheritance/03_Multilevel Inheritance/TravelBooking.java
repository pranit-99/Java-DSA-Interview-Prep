/*Problem 6 of 8 — Travel/Airline Domain
Trip → FlightTrip → InternationalFlight

Now we reach one of the most important concepts in multilevel inheritance: constructor chaining.

You already learned in single-level inheritance:

Parent constructor
      ↓
Child constructor

But what happens with three levels?

Grandparent
     ↓
Parent
     ↓
Child

When we create only the final child object, Java executes constructors in this order:

Grandparent → Parent → Child
Problem Statement

Build a travel booking system using:

Trip
  ↓
FlightTrip
  ↓
InternationalFlight
Level 1 — Trip

Fields:

protected String passengerName;
protected String destination;

Constructor:

Trip(String passengerName, String destination)
Level 2 — FlightTrip

Add:

protected String airline;
protected double ticketPrice;

Constructor:

FlightTrip(
    String passengerName,
    String destination,
    String airline,
    double ticketPrice
)
Level 3 — InternationalFlight

Add:

String passportNumber;
double internationalTax;

Constructor receives information for all three levels.

Calculate:

Final Ticket Price
= Ticket Price + International Tax */
class Trip {

    protected String passengerName;
    protected String destination;


    Trip(String passengerName, String destination) {

        this.passengerName = passengerName;
        this.destination = destination;

        System.out.println(
            "Trip Constructor Executed"
        );
    }


    void displayTripDetails() {

        System.out.println(
            "Passenger Name: " + passengerName
        );

        System.out.println(
            "Destination: " + destination
        );
    }
}


class FlightTrip extends Trip {

    protected String airline;
    protected double ticketPrice;


    FlightTrip(
        String passengerName,
        String destination,
        String airline,
        double ticketPrice
    ) {

        super(passengerName, destination);

        this.airline = airline;
        this.ticketPrice = ticketPrice;

        System.out.println(
            "FlightTrip Constructor Executed"
        );
    }


    void displayFlightDetails() {

        System.out.println(
            "Airline: " + airline
        );

        System.out.println(
            "Ticket Price: $" + ticketPrice
        );
    }
}


class InternationalFlight extends FlightTrip {

    String passportNumber;
    double internationalTax;


    InternationalFlight(
        String passengerName,
        String destination,
        String airline,
        double ticketPrice,
        String passportNumber,
        double internationalTax
    ) {

        super(
            passengerName,
            destination,
            airline,
            ticketPrice
        );

        this.passportNumber = passportNumber;
        this.internationalTax = internationalTax;

        System.out.println(
            "InternationalFlight Constructor Executed"
        );
    }


    void displayInternationalFlight() {

        double finalPrice =
            ticketPrice + internationalTax;

        System.out.println(
            "Passport Number: " + passportNumber
        );

        System.out.println(
            "International Tax: $" + internationalTax
        );

        System.out.println(
            "Final Ticket Price: $" + finalPrice
        );
    }
}


public class TravelBooking {

    public static void main(String[] args) {

        InternationalFlight flight =
            new InternationalFlight(
                "Aarav",
                "London",
                "British Airways",
                1200,
                "P1234567",
                180
            );

        System.out.println();

        flight.displayTripDetails();
        flight.displayFlightDetails();
        flight.displayInternationalFlight();
    }
}
