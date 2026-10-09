/*Problem 3: Parking Pass Management

This is our third and final guided problem at the Basic level. After this, Problems 4–10 will be for you to solve yourself, one at a time.

We'll increase the difficulty only slightly. Still just basic encapsulation—no constructors or intermediate concepts.

Problem Statement

A company provides parking passes to its employees. The system needs to maintain basic information about each parking pass.

Create a class:

ParkingPass

Each parking pass should contain:

passId
employeeName
remainingEntries
Requirements
All fields must be private.
passId:
Must be greater than 0.
Can be assigned only once.
Can be viewed using a getter.
employeeName:
Can be viewed and changed.
Cannot be null or empty.
remainingEntries:
Can be viewed.
Should not have a normal setter.
Create:
addEntries(int entries)

It should:

Accept only a value greater than 0.
Add entries to the existing remainingEntries.
Otherwise print "Invalid number of entries".
Create:
useEntry()

It should:

Reduce remainingEntries by 1.
Only allow entry if at least one entry remains.
Otherwise print "No parking entries remaining". */
public class ParkingPass {

    private int passId;
    private String employeeName;
    private int remainingEntries;


    public void setPassId(int passId) {

        if(this.passId == 0 && passId > 0) {

            this.passId = passId;

        } else {

            System.out.println(
                "Invalid Pass ID or Pass ID already assigned"
            );
        }
    }


    public int getPassId() {

        return passId;
    }


    public void setEmployeeName(String employeeName) {

        if(employeeName != null && !employeeName.isEmpty()) {

            this.employeeName = employeeName;

        } else {

            System.out.println("Invalid employee name");
        }
    }


    public String getEmployeeName() {

        return employeeName;
    }


    public int getRemainingEntries() {

        return remainingEntries;
    }


    public void addEntries(int entries) {

        if(entries > 0) {

            this.remainingEntries =
                    this.remainingEntries + entries;

            System.out.println(
                entries + " parking entries added"
            );

        } else {

            System.out.println(
                "Invalid number of entries"
            );
        }
    }


    public void useEntry() {

        if(this.remainingEntries > 0) {

            this.remainingEntries =
                    this.remainingEntries - 1;

            System.out.println(
                "Parking entry used successfully"
            );

        } else {

            System.out.println(
                "No parking entries remaining"
            );
        }
    }


    public static void main(String[] args) {

        ParkingPass pass = new ParkingPass();

        pass.setPassId(301);

        pass.setEmployeeName("Pranit");

        pass.addEntries(10);

        pass.useEntry();

        pass.useEntry();

        System.out.println();
        System.out.println("Parking Pass Details");

        System.out.println(
            "Pass ID: " + pass.getPassId()
        );

        System.out.println(
            "Employee: " + pass.getEmployeeName()
        );

        System.out.println(
            "Remaining Entries: "
            + pass.getRemainingEntries()
        );
    }
}