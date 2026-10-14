/*Problem I: Identify All-Positive Windows
Pattern: Fixed-Size Sliding Window
Java filename: I_IdentifyAllPositiveWindows.java
Problem Statement
Given an integer array arr and an integer k, count how many contiguous windows of size k contain only positive numbers (strictly greater than zero).
Input:
int[] arr = {2, 3, -1, 4, 5, 6, -2, 7};
int k = 3;


Expected output:
Number of all-positive windows: 1 */
public class ProblemI {
    public static void main(String[] args) {
        int arr[] = {2, 3, -1, 4, 5, 6, -2, 7};
        int k = 3;
        int nonPositiveCount = 0;
        int count = 0;

        for(int i = 0; i < k; i++){
            if(arr[i] <= 0){
                nonPositiveCount++;
            }
        }
            
            for(int i = k ; i < arr.length; i++){
                if(arr[i - k] <= 0){
                    nonPositiveCount--;
                }

                if(arr[i] <= 0){
                    nonPositiveCount++;
                }

                if(nonPositiveCount == 0){
                count++;
            }
            
        }
            System.err.println(count);
    }
}
