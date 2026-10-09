class Transport {

    protected String passengerName;
    protected double baseFare;

    Transport(
        String passengerName,
        double baseFare
    ) {

        this.passengerName = passengerName;
        this.baseFare = baseFare;

        System.out.println(
            "Transport Constructor"
        );
    }

    void displayTransportDetails() {

        System.out.println(
            "Passenger: " + passengerName
        );

        System.out.println(
            "Base Fare: $" + baseFare
        );
    }
}


class Taxi extends Transport {

    double distanceCharge;

    Taxi(
        String passengerName,
        double baseFare,
        double distanceCharge
    ) {

        super(passengerName, baseFare);

        this.distanceCharge =
            distanceCharge;
    }

    void calculateTaxiFare() {

        double totalFare =
            baseFare + distanceCharge;

        System.out.println(
            "Taxi Fare: $" + totalFare
        );
    }
}


class Bus extends Transport {

    double luggageCharge;

    Bus(
        String passengerName,
        double baseFare,
        double luggageCharge
    ) {

        super(passengerName, baseFare);

        this.luggageCharge =
            luggageCharge;
    }

    void calculateBusFare() {

        double totalFare =
            baseFare + luggageCharge;

        System.out.println(
            "Bus Fare: $" + totalFare
        );
    }
}


public class TransportBooking {

    public static void main(String[] args) {

        Taxi taxi =
            new Taxi(
                "Aarav",
                20,
                15
            );

        taxi.displayTransportDetails();
        taxi.calculateTaxiFare();

        System.out.println("----------------");

        Bus bus =
            new Bus(
                "Rohan",
                10,
                5
            );

        bus.displayTransportDetails();
        bus.calculateBusFare();
    }
}
