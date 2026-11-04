/*Problem H — Insert a Number Greater Than All Elements
Level 1 · Absolute Beginner
In Problem G, you learned how Binary Search finds the insertion position when the target is smaller than every element.

Now we will solve the opposite situation: What happens when the target is greater than every element in the sorted array?

This problem will help you understand how left can move beyond the last index of an array.
1. Problem statement
You are given a sorted integer array and a target value.

Your task is to find the correct insertion index for the target while maintaining ascending order.

You do not need to insert the element physically.
2. Input
int[] arr = {5, 10, 15, 20, 25, 30, 35};
int target = 40;


Expected output:
Insertion position: 7 */
public class ProblemH {
    public static void main(String[] args) {
      int arr[] = {5, 10, 15, 20, 25, 30, 35};
      int target = 40;
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

