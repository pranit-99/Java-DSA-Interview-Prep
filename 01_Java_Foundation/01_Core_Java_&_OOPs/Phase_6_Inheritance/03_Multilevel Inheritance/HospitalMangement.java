/*Problem 2 of 8 — Hospital Management
Person → Patient → InPatient

Now we'll use a completely different domain: Hospital Management.

Problem 1 showed that a third-level child can access members inherited through the hierarchy.

Problem 2 focuses specifically on:

Can the final child use variables belonging to both its parent AND grandparent inside its own method?

Yes — provided those members are accessible.

Problem Statement

A hospital wants to maintain information about admitted patients.

Create this multilevel hierarchy:

Person
   ↓
Patient
   ↓
InPatient
Level 1 — Person

Fields:

protected String name;
protected int age;

Method:

void displayPersonDetails()
Level 2 — Patient

Patient extends Person.

Fields:

protected int patientId;
protected double consultationFee;

Method:

void displayPatientDetails()
Level 3 — InPatient

InPatient extends Patient.

Fields:

int numberOfDays;
double roomChargePerDay;

Create:

void calculateHospitalBill()

Calculate:

Room Cost = Number of Days × Room Charge Per Day

Total Hospital Bill = Consultation Fee + Room Cost
Test Data

Use:

Name: Rahul
Age: 35

Patient ID: 1001
Consultation Fee: $250

Number of Days: 4
Room Charge Per Day: $300

Calculation:

Room Cost
= 4 × 300
= $1200

Total Bill
= 250 + 1200
= $1450 */
class Person{
    protected String name;
    protected int age;

    void displayPersonDetails(){
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person{
    protected int patientId;
    protected  double consultationFee;

    void displayPatientDetails() {

        System.out.println("Patient ID: " + patientId);
        System.out.println("Consultation Fee: $" + consultationFee);
    }
}

class InPatient extends Patient{
    int numberOfDays;
    double roomChargePerDay;

    void calculateHospitalBill(){
        double roomCost = numberOfDays * roomChargePerDay;
        double totalBill = consultationFee + roomCost;
        System.out.println("Number of Days: " + numberOfDays);

        System.out.println("Room Charge Per Day: $" + roomChargePerDay);

        System.out.println("Total Room Cost: $" + roomCost);

        System.out.println("Total Hospital Bill: $" + totalBill);
    }
}
public class HospitalMangement {
    public static void main(String[] args) {

        InPatient patient = new InPatient();

        patient.name = "Rahul";
        patient.age = 35;

        patient.patientId = 1001;
        patient.consultationFee = 250;

        patient.numberOfDays = 4;
        patient.roomChargePerDay = 300;

        patient.displayPersonDetails();
        patient.displayPatientDetails();
        patient.calculateHospitalBill();
}
}
