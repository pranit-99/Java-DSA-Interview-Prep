/*Problem J — Search Insert Position with Multiple Test Cases 
1. Problem statement
You are given a sorted integer array and a target value.

Using Binary Search, find:
- The index of the target if it already exists.
- The correct insertion position if the target does not exist.
Important: This time, instead of writing all the searching logic inside main(), create a separate method called searchInsert().

This will help you learn how to reuse the same algorithm for multiple inputs.
2. Input
int[] arr = {3, 7, 11, 15, 19, 23, 27, 31};
int target = 17;


Expected output:
Insertion position: 4*/
public class ProblemJ {
    public static void main(String[] args) {
      int arr[] = {3, 7, 11, 15, 19, 23, 27, 31};
      int target = 17;
      int left = 0;
      int right = arr.length - 1;

      while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] == target){
            System.out.println("Insertion Position: " + mid);
            return; 
        }else if(arr[mid] < target){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
      }
      System.out.println("Insertion position: "+ left);
    }
}
