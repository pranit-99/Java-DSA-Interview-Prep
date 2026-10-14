/*2. Problem A — Add Elements in Every Window of Size K
Guided solution 1 of 2
Problem: Given an integer array and a window size k, print the sum of every consecutive window of size k.
Input:
arr = {2, 4, 1, 5, 3}
k = 3


Expected output:
7
10
9 */
public class ProblemA {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 5, 3};
        int k = 3;
        int windowSum = 0;

        //First window
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        System.out.println(windowSum);

        //Slide the window
        for(int right = k; right < arr.length; right++){
            windowSum = windowSum - arr[right - k] + arr[right];
            System.out.println(windowSum);
        }
    }
}
