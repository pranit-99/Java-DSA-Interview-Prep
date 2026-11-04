/*Problem N — Find the Smallest Element Greater Than the Target
Level 1 · Absolute Beginner
In Problems K, L, and M, we searched for exact target values.

Now we'll introduce a different type of Binary Search problem.

Our goal is not to find the target itself. We need to find the smallest number that is strictly greater than the target.

We'll continue using integer arrays only.
1. Problem statement
Given a sorted integer array and a target value, find the smallest element greater than the target using Binary Search.

If no such element exists, return -1.
2. Input
int[] arr = {2, 5, 8, 12, 16, 20, 25};
int target = 10;


Expected output:
Smallest greater element: 12 */
public class ProblemN {
    public static void main(String args[]){
        int arr[] = {2, 5, 8, 12, 16, 20, 25};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/ 2;
            if(arr[mid] > target){
                result = arr[mid];
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println("Smallest greater element: " + result);
    }
}
