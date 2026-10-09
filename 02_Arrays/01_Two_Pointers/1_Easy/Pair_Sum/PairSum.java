/*Problem 3 — Find Pair With Target Sum
Type: Pair Sum / Sorted Array — Two Pointers
Problem Statement
Given a sorted array and a target, find whether a pair of elements exists whose sum equals the target.
Input:
arr = {2, 4, 6, 8, 10}
target = 14

Output:
Pair Found: 4, 10

Guidance
Start:
[2, 4, 6, 8, 10]
 ↑              ↑
left           right

Calculate:
int sum = arr[left] + arr[right];

Use these rules:
sum == target  → Pair found

sum < target   → left++

sum > target   → right-- */
public class PairSum {
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        int target  = 10;

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
               System.out.println("Pair Found:" + arr[left] + "," + arr[right]);
               break; 
            }
            else if( sum < target){
                left++;
            }else{
                right--;
            }
        }
    }
}
