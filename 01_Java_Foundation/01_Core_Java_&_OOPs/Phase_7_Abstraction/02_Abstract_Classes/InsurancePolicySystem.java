/*Guided Problem 8 — Insurance Policy System

Now we'll introduce another important rule:

An abstract class can contain multiple abstract methods.

And if a concrete child extends that abstract class, it must implement all inherited abstract methods.

Problem Statement

An insurance company provides:

HealthInsurance
CarInsurance

Every insurance policy must be able to:

1. Calculate the premium
2. Display the coverage

However, both operations work differently depending on the type of insurance.

Create an abstract class:

InsurancePolicy

with two abstract methods:

abstract double calculatePremium(double amount);

abstract void displayCoverage();

Create two child classes:

HealthInsurance
CarInsurance

For this basic problem, use:

Health Insurance Premium → 5% of insurance amount
Car Insurance Premium    → 3% of insurance amount

Use an insurance amount of:

$100,000

Coverage messages:

Health Insurance → Hospital and Medical Coverage
Car Insurance    → Accident and Vehicle Damage Coverage
Expected Output
Health Insurance Premium: $5000.0
Coverage: Hospital and Medical Coverage
--------------------------------
Car Insurance Premium: $3000.0
Coverage: Accident and Vehicle Damage Coverage*/
abstract class InsurancePolicy{
    @SuppressWarnings("unused")
    abstract double calculatePremium(double amount);
    @SuppressWarnings("unused")
    abstract void displayCoverage();
}

class HealthInsurance extends InsurancePolicy{
    @Override 
    double calculatePremium(double amount){
        double premium = amount * 0.05;
        return premium;
    }
    @Override
    void displayCoverage(){
    System.out.println("Coverage: Hospital and Medical Coverage");
    }
}

class CarInsurance extends InsurancePolicy {

    @Override
    double calculatePremium(double amount) {

        double premium = amount * 0.03;

        return premium;
    }


    @Override
    void displayCoverage() {

        System.out.println(
            "Coverage: Accident and Vehicle Damage Coverage"
        );
    }
}


public class InsurancePolicySystem {
    public static void main(String args[]){
        HealthInsurance health = new HealthInsurance();
        CarInsurance car = new CarInsurance();

        double healthPremium = health.calculatePremium(100000);
        System.out.println("Health Insurance Premium: $" + healthPremium);
        health.displayCoverage();
        System.out.println("--------------------------------");
        double carPremium = car.calculatePremium(100000);
        System.out.println("CarInsurance Premium: $"+ carPremium);
        car.displayCoverage();
    }
}
