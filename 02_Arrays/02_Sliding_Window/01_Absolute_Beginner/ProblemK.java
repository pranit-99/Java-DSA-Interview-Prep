/*Problem K: Keep Track of Negative Counts
Absolute Beginner
Java filename: K_KeepTrackNegativeCounts.java
Problem Statement
Given an integer array arr and an integer k, print the number of negative elements in every contiguous window of size k.
Input:
int[] arr = {-2, 4, -1, 5, -3, -6, 2};
int k = 3;


Expected output:
2
1
2
2
2 */
public class ProblemK {
    public static void main(String args[]){
        int arr[] = {-2, 4, -1, 5, -3, -6, 2};
        int k = 3;
        int count = 0;

        for(int i  = 0; i < k; i++){
            if(arr[i] < 0){
                count++;
            }
        }
        System.err.println(count);

        for(int i = k; i < arr.length; i++){
            if(arr[i - k] < 0){
                count--;
            }

            if(arr[i] < 0){
                count++;
            }
            System.err.println(count);
        }
    }
}
