/*Problem B — Search for a Missing Number
Level 1 · Absolute Beginner
In Problem A, you successfully found a target that existed in the array.

Now, in Problem B, we will test whether your Binary Search logic works when the target is not present.

This will help you understand when the while loop terminates naturally without using break.
1. Problem statement
You are given a sorted integer array and a target number.

Your task is to search for the target using Binary Search.
- If the target exists, print its index.
- If the target does not exist, print "Target not found".
2. Input
int[] arr = {4, 8, 12, 16, 20, 24, 28, 32, 36};
int target = 22;


Expected output:
Target not found */
public class ProblemB {
  public static void main(String args[]){
    int arr[] = {4, 8, 12, 16, 20, 24, 28, 32, 36};
    int target = 22;
    int left = 0;
    int right = arr.length - 1;

    while(left <= right){
        int mid  = left + (right - left) / 2;
        if(arr[mid] == target){
            System.out.println("Target Found at:-" + mid);
            return;
        }else if(arr[mid] < target){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    System.out.println("Target Not Found");
  }  
}
