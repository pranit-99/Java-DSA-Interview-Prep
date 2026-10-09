/*Problem Statement
Given a sorted integer array and a target difference, determine whether there are two distinct elements whose absolute difference equals the target.
You must solve this problem using the Opposite-Direction Two Pointers technique.
Example 1
Input:
arr = {1, 3, 5, 8, 12}
target = 7

Output:
true

Explanation:
8 - 1 = 7


Example 2
Input:
arr = {2, 4, 6, 10}
target = 5

Output:
false */
public class ArrayPairDifference {
    public static boolean hasPairDifference(int arr[], int target){
        int left = 0;
        int right = 1;

        while(right < arr.length){
            if(left == right){
                right++;
                continue;
            }

            int difference = arr[right] - arr[left];
            if(difference == target){
                return true;
            } else if(difference < target){
                right++;
            }else{
                left++;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 12};
        int target = 7;
        System.out.println(hasPairDifference(arr, target));
    }
}
