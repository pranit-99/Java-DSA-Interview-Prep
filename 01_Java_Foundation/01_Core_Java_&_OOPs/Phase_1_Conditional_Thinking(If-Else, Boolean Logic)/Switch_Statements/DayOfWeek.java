/*Switch — Problem 1/6: Day of the Week
Problem

Given a number from 1–7, print the corresponding day:

1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday

If the number is outside 1–7, print:

Invalid day
Input
int day = 3;
Expected Output
Wednesday */
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 3;

        switch(day){
            case 1 -> System.out.println("Monday");
            
            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");
            
            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Fridday");

            case 6 -> System.out.println("Saturday");

            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Invalid Day");
            
        }
    }
}
/*-----------OLD SWITCH
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 3;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Fridday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
            
        }
    }
} */