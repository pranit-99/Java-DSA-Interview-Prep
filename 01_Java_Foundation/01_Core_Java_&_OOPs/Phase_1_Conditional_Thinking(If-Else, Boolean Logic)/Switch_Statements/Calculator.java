public class Calculator {
    public static void main(String args[]){
        int a = 20;
        int b = 5;
        char operator = '*';

        switch(operator){
            case '+' -> System.out.println("Result = " + (a+b));
            case '-' -> System.out.println("Result = " + (a-b));
            case '*' -> System.out.println("Result = " + (a*b));
            case '/' -> System.out.println("Result = " + (a/b));
            default -> System.out.println("Invalid Operator");
        }
    }
}
/*public class Calculator {
    public static void main(String args[]){
        int a = 20;
        int b = 5;
        char operator = '*';

        switch(operator){
            case '+':
                System.out.println("Result = " + (a+b));
                break;

            case '-':
                System.out.println("Result = " + (a-b));
                break;

            case '*':
                System.out.println("Result = " + (a*b));
                break;

            case '/':
                System.out.println("Result = " + (a/b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
} */