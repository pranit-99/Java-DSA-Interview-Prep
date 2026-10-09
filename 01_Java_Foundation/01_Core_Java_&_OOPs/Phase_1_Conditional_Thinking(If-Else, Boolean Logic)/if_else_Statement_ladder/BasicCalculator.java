/*Write a Java program that performs an operation based on an operator.

Input
int a = 20;
int b = 5;
char operator = '*';
Conditions
'+' → Addition
'-' → Subtraction
'*' → Multiplication
'/' → Division
Expected Output
Result = 100 */
public class BasicCalculator {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        char operator = '*';

        if(operator == '+'){
            System.out.println("Addition:-"+ a+b);
        }else if(operator == '-'){
            System.out.println("Subtraction:-"+ (a-b));
        }else if(operator == '*'){
            System.out.println("Multiplication:-"+ (a*b));
        }else if(operator == '/'){
            System.out.println("Division:-"+ a/b);
        }else{
            System.out.println("Modular:-"+ a%b);
        }
    }
}
