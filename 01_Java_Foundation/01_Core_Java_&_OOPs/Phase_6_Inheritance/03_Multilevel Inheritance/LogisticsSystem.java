/*Problem 8 of 8 — Logistics Domain
Shipment → ExpressShipment → InternationalExpressShipment

This is our final Basic Multilevel Inheritance problem.

We'll combine what you've learned:

✓ Three-level inheritance
✓ protected fields
✓ Constructors at all three levels
✓ Constructor chaining
✓ super(...)
✓ Grandparent → Parent → Child initialization
✓ Inherited methods
✓ Inherited fields
✓ Child-specific fields
✓ Calculation using data from all levels
Problem Statement

A logistics company handles normal, express, and international express shipments.

Create:

Shipment
    ↓
ExpressShipment
    ↓
InternationalExpressShipment
Level 1 — Shipment

Fields:

protected String trackingNumber;
protected double weight;
protected double baseShippingCost;

Constructor initializes these fields.

Method:

void displayShipmentDetails()
Level 2 — ExpressShipment

Add:

protected double expressCharge;

Constructor initializes parent information using super(...).

Method:

void displayExpressDetails()
Level 3 — InternationalExpressShipment

Add:

String destinationCountry;
double customsCharge;

Constructor initializes Shipment and ExpressShipment information through constructor chaining.

Create:

void calculateTotalShippingCost()

Calculate:

Weight Charge = Weight × $2

Total Shipping Cost
=
Base Shipping Cost
+ Weight Charge
+ Express Charge
+ Customs Charge
Test Data
Tracking Number: SHP9001
Weight: 10 kg
Base Shipping Cost: $50

Express Charge: $25

Destination Country: Germany
Customs Charge: $40

Calculation:

Weight Charge
= 10 × 2
= $20

Total Shipping Cost
= 50 + 20 + 25 + 40
= $135 */
class Shipment {

    protected String trackingNumber;
    protected double weight;
    protected double baseShippingCost;


    Shipment(
        String trackingNumber,
        double weight,
        double baseShippingCost
    ) {

        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.baseShippingCost = baseShippingCost;
    }


    void displayShipmentDetails() {

        System.out.println(
            "Tracking Number: " + trackingNumber
        );

        System.out.println(
            "Weight: " + weight + " kg"
        );

        System.out.println(
            "Base Shipping Cost: $" + baseShippingCost
        );
    }
}


class ExpressShipment extends Shipment {

    protected double expressCharge;


    ExpressShipment(
        String trackingNumber,
        double weight,
        double baseShippingCost,
        double expressCharge
    ) {

        super(
            trackingNumber,
            weight,
            baseShippingCost
        );

        this.expressCharge = expressCharge;
    }


    void displayExpressDetails() {

        System.out.println(
            "Express Charge: $" + expressCharge
        );
    }
}


class InternationalExpressShipment
        extends ExpressShipment {

    String destinationCountry;
    double customsCharge;


    InternationalExpressShipment(
        String trackingNumber,
        double weight,
        double baseShippingCost,
        double expressCharge,
        String destinationCountry,
        double customsCharge
    ) {

        super(
            trackingNumber,
            weight,
            baseShippingCost,
            expressCharge
        );

        this.destinationCountry =
            destinationCountry;

        this.customsCharge =
            customsCharge;
    }


    void calculateTotalShippingCost() {

        double weightCharge =
            weight * 2;

        double totalShippingCost =
            baseShippingCost
            + weightCharge
            + expressCharge
            + customsCharge;

        System.out.println(
            "Destination Country: "
            + destinationCountry
        );

        System.out.println(
            "Weight Charge: $" + weightCharge
        );

        System.out.println(
            "Customs Charge: $" + customsCharge
        );

        System.out.println(
            "Total Shipping Cost: $"
            + totalShippingCost
        );
    }


    void displayCompleteShipment() {

        displayShipmentDetails();

        displayExpressDetails();

        calculateTotalShippingCost();
    }
}


public class LogisticsSystem {

    public static void main(String[] args) {

        InternationalExpressShipment shipment =
            new InternationalExpressShipment(
                "SHP9001",
                10,
                50,
                25,
                "Germany",
                40
            );

        shipment.displayCompleteShipment();
    }
}
