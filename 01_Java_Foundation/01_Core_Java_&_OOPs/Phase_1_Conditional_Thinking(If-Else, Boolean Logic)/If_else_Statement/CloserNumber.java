/*Given two different positive numbers, print the number that is closer to 100.

Input
int a = 85;
int b = 120;
Expected Output
85 is closer to 100

Because:

Distance of 85 from 100  = 15
Distance of 120 from 100 = 20

15 < 20 */
public class CloserNumber {
    public static void main(String args[]){
        int a = 85;
        int b = 120;

        int c = 100 - a;
        int d = b - 100;

        if(c < d){
            System.out.println(a+ " Closer to 100");
        }else{
            System.out.println(b +" Close to 100");
        }

    }
}
