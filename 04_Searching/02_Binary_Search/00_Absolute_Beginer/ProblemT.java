/*Problem T — Find the Integer Square Root Using Binary Search
Difficulty: Beginner
New concept: Binary Search on a numerical range instead of an array.
Problem statement
Given a non-negative integer number, find its integer square root using Binary Search.

If the number is not a perfect square, return the largest integer whose square is less than the given number.
Input
int number = 27;


Expected output:
Integer square root: 5 */
public class ProblemT {
   public static void main(String args[]){
    int number = 27;
    int left = 0;
    int right = number;
    int result = 0;

    while(left <= right){
        int mid = left + (right - left) / 2;
        long square = (long) mid * mid;

        if(square == number){
            result = mid;
            break;
        }else if (square < number){
            result = mid;
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    System.out.println("Integer square root: " + result);
   } 
}
