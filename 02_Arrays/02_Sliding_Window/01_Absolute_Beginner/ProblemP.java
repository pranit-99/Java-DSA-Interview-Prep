/*Problem P — Print First and Last Window Sums
Absolute Beginner
Fixed-Size Sliding Window

1. Understanding the Approach
We are given:
int[] arr = {3, 5, 2, 7, 4, 6, 1};
int k = 3;


We need to print only the first and last window sums, not the sums of every window.
Thinking process:
1. Calculate the sum of the first k elements and print it.
2. Move the window across the array using the sliding window formula.
3. Once the loop finishes, sum automatically contains the last window's sum.
4. Print that final sum.
We don't need a separate variable for the last window sum. */
public class ProblemP {
    public static void main(String args[]){
        int arr[] = {3, 5, 2, 7, 4, 6, 1};
        int k = 3;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }

        System.out.println("First Window Sum: " + sum);

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
        }

        System.err.println("Last Window Sum:" + sum);
    }
}
