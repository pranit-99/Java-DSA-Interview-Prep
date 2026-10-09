/*We'll start with a void recursive method and no loop.

Problem

A rocket launch system needs to display a countdown.

If:

int n = 5;

the output should be:

5
4
3
2
1
Launch!

Create: */
public class RocketLaunch {
    public static void countdown(int n){
        //Base condition
        if(n == 0){
            System.out.println("Launch");
            return;
        }

        //work
        System.out.println(n);

        //Recursive
        countdown(n-1);

    }
    public static void main(String[] args) {
        countdown(5);
    }
}
