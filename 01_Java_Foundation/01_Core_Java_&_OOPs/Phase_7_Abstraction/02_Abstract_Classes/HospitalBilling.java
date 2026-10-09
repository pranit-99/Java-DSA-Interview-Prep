/*Guided Problem 6 — Hospital Patient Billing System

Now we'll introduce:

An abstract class can contain variables/fields, and its child classes can inherit and use them.

Until now, our abstract classes mostly contained methods. But an abstract class is still a class, so it can also store data.

Problem Statement

A hospital has two types of patients:

GeneralPatient
EmergencyPatient

Every patient has:

patientName
patientId

These values are common to all patients, so we'll put them inside the abstract parent class Patient.

Every patient must also calculate their hospital bill differently.

Create:

abstract class Patient

with two fields:

String patientName;
int patientId;

For now, assign simple values directly from the child classes.

Create an abstract method:

abstract double calculateBill(double treatmentCost);

Use these rules:

General Patient
→ Treatment cost only

Emergency Patient
→ Treatment cost + $500 emergency charge

Use:

Treatment Cost = $2000 */
abstract class Patient{
    String patientName;
    int patientId;

    @SuppressWarnings("unused")
    abstract double calculateBill(double treatmentCost);

    void displayPatientDetails(){
        System.out.println("Patient Id:-" +patientId);
        System.err.println("Patient Name:-"+patientName);
    }
}

class GeneralPatient extends Patient{
    @Override 
    double calculateBill(double treatmentCost){
        double bill = treatmentCost;
        return bill;
    }
}

class EmergencyPatient extends Patient {
    @Override
    double calculateBill(double treatmentCost) {
        double emergencyCharge = 500;
        double bill = treatmentCost + emergencyCharge;
        return bill;
    }
}
public class HospitalBilling {
    public static void main(String[] args) {
        GeneralPatient general = new GeneralPatient();

        general.patientName = "John";
        general.patientId = 101;

        EmergencyPatient emergency = new EmergencyPatient();
        emergency.patientId = 101;
        emergency.patientName = "David";

        general.displayPatientDetails();
        double generalBill = general.calculateBill(2000);
        System.out.println("General Patient Bill: $" + generalBill);

        System.out.println("-----------------------------");

        emergency.displayPatientDetails();
        double emergencyBill = emergency.calculateBill(2000);
        System.out.println("Emergency Patient Bill: $" + emergencyBill);
    }
}
