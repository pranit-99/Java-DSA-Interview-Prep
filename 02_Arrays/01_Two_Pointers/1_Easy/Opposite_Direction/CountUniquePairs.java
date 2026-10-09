/*Java Filename: CountUniquePairs.java
Pointer Movement: Conditional (left++, right--, or both)
Problem Statement
Given a sorted integer array and a target value, count the number of unique pairs whose sum equals the target.
If the array contains duplicate values, count each distinct pair of values only once.
Example 1
Input:
arr = {1, 1, 2, 2, 3, 4, 5}
target = 6

Output: 2

Explanation:
(1, 5)
(2, 4)


Example 2
Input:
arr = {1, 2, 3, 4, 5, 6}
target = 7

Output: 3

Explanation:
(1, 6)
(2, 5)
(3, 4) */
public class CountUniquePairs {
    public static int countPairs(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                count++;

                int leftValue = arr[left];
                int rightValue = arr[right];

                while(left < right && arr[left] == leftValue){
                    left++;
                }

                while(left < right && arr[right] == rightValue){
                    right--;
                }
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 5};
        int target = 6;
        System.out.println("Unique Pairs: " + countPairs(arr, target));
    }
}
