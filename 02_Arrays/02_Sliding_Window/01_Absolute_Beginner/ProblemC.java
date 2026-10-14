/*Problem C — Count Even Numbers in Each Window
Absolute Beginner
Fixed-Size Sliding Window

Problem Statement
Given an integer array arr and an integer k, count how many even numbers are present in every contiguous subarray (window) of size k.
Example 1
Input:
int[] arr = {2, 3, 4, 6, 7, 8};
int k = 3;


Expected Output:
2
2
2
2 */
public class ProblemC {
    public static void main(String args[]){
        int arr[] = {2, 3, 4, 6, 7, 8};
        int k = 3;
        int count  = 0;

        //First Window
        for(int i = 0; i < 3; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        //slide the window
        for(int i = k; i < arr.length; i++){
            //Remove outgoing
            if(arr[i - k] % 2 == 0){
                count--;
            }

            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
