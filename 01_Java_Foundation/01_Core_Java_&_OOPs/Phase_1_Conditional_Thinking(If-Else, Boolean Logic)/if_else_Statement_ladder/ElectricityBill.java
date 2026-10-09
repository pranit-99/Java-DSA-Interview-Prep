/*Write a Java program that determines the electricity charge category based on the number of units consumed.

Conditions
0 – 100 units     → Low Usage
101 – 200 units   → Medium Usage
201 – 300 units   → High Usage
Above 300 units   → Very High Usage
Input
int units = 250;
Expected Output
High Usage */
public class ElectricityBill {
    public static void main(String args[]) {

        int units = 250;

        if(units <= 100) {
            System.out.println("Low Usage");
        } 
        else if(units <= 200) {
            System.out.println("Medium Usage");
        } 
        else if(units <= 300) {
            System.out.println("High Usage");
        } 
        else {
            System.out.println("Very High Usage");
        }
    }
}
