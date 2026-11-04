/*Problem G — Insert a Number Smaller Than All Elements
Level 1 · Absolute Beginner
In Problem F, we found the insertion position of a number that belonged somewhere in the middle of a sorted array.

Now we will practice a different boundary condition: What if the target is smaller than every element in the array?

You will solve this independently.
1. Problem statement
Given a sorted integer array and a target number, find the correct insertion index using Binary Search.

The target is smaller than every element in the array.

You do not need to insert the number physically. Just return its correct position.
2. Input
int[] arr = {10, 20, 30, 40, 50, 60, 70};
int target = 5;


Expected output:
Insertion position: 0 */
public class ProblemG {
   public static void main(String args[]){
    int arr[] = {10, 20, 30, 40, 50, 60, 70};
    int target = 5;
    int left  = 0;
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
    System.out.println("Insertion position: "+left);
   } 
}
