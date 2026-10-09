/*Write a Java program that prints the day name based on a number.

Conditions
1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday
Anything else → Invalid day
Input
int day = 4;
Expected Output
Thursday */
public class DayName {

    public static void main(String args[]) {

        int day = 4;

        if(day == 1) {
            System.out.println("Monday");
        } 
        else if(day == 2) {
            System.out.println("Tuesday");
        } 
        else if(day == 3) {
            System.out.println("Wednesday");
        } 
        else if(day == 4) {
            System.out.println("Thursday");
        } 
        else if(day == 5) {
            System.out.println("Friday");
        } 
        else if(day == 6) {
            System.out.println("Saturday");
        } 
        else if(day == 7) {
            System.out.println("Sunday");
        } 
        else {
            System.out.println("Invalid day");
        }
    }
}
