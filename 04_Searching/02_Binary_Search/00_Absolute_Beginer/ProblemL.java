/*Problem L — Find the Last Occurrence of a Target
Level 1 · Absolute Beginner
In Problem K, you learned how to find the first occurrence of a target in a sorted integer array containing duplicates.

Now we'll solve the opposite problem: finding the last occurrence.

The key difference is what you do after finding the target.
1. Problem statement
Given a sorted integer array containing duplicate numbers, find the index of the last occurrence of the target using Binary Search.
2. Input
int[] arr = {2, 4, 4, 4, 4, 6, 8, 10};
int target = 4;


Expected output:
Last occurrence index: 4 */
public class ProblemL {
    public static void main(String args[]){
       int arr[]  = {2, 4, 4, 4, 4, 6, 8, 10};
       int target = 4;
       int left = 0;
       int right = arr.length - 1;
       int result = -1;

       while(left <= right){
        int mid = left + (right - left) / 2;

        if(arr[mid] == target){
            result = mid;
            left = mid + 1;
        }else if(arr[mid] < target){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
       }
       System.out.println("Last occurrence index: " + result);
    }
}
