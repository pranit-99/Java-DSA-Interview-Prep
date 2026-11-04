/*Problem I — Search Insert Position When the Target Already Exists
Level 1 · Absolute Beginner
In Problems F, G, and H, we practiced finding insertion positions when the target was missing from the array.

Now we will work on a slightly different situation: What happens when the target already exists in the sorted array?

We will continue with the same Binary Search concept.
1. Problem statement
You are given a sorted integer array and a target value.

Your task is to find the target's index using Binary Search.

If the target exists, return its current index. Otherwise, return the position where it should be inserted.
2. Input
int[] arr = {4, 8, 12, 16, 20, 24, 28};
int target = 20;


Expected output:
Insertion position: 4 */
public class ProblemI {
    public static void main(String[] args) {
      int arr[] = {4, 8, 12, 16, 20, 24, 28};
      int target = 20;
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


