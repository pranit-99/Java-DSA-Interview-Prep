/*Problem Q — Find the Peak Element Using Binary Search
Difficulty: Absolute Beginner
New concept: Comparing adjacent elements to determine search direction.
Problem statement
Given an integer array that strictly increases and then strictly decreases, find the peak element (the largest element) using Binary Search.

Input:
int[] arr = {2, 5, 9, 14, 20, 16, 11, 7, 3};


Expected output:
Peak element: 20
Peak index: 4 */
public class ProblemQ {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 14, 20, 16, 11, 7, 3};
        int left  = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        System.out.println("Peak element: " + arr[left]);
        System.out.println("Peak index: " + left);
    }}

