/*Write a Java program that checks a number and prints:

Divisible by both 3 and 5
Divisible only by 3
Divisible only by 5
Not divisible by 3 or 5
Input
int number = 30;
Expected Output
Divisible by both 3 and 5 */
public class Divisibility {
    public static void main(String args[]){
        int number = 30;

        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("Divisible by both 3 and 5");
        }else if(number % 3 == 0 && number % 5 != 0){
            System.out.println("Divisible only by 3");
        }else if (number % 3 != 0 && number % 5 != 0){
            System.out.println("Divisible only by 5");
        }else{
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
