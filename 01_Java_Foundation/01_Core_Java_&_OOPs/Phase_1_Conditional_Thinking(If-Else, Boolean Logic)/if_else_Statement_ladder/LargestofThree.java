/*Write a Java program that determines the largest among three numbers.

Input
int a = 25;
int b = 70;
int c = 45;
Expected Output
70 is the largest */
public class LargestofThree {
    public static void main(String[] args) {
        int a = 25;
        int b = 70;
        int c = 45;

        if(a > b && a > c){
            System.out.println("a is Greater");
        }else if(b > a && b > c){
            System.out.println("b is Greater");
        }else{
            System.out.println("c is Greater");
        }
    }
}
