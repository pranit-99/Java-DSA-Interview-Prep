/*Problem 7 — Move Negative Numbers to One Side
Type: Partitioning Two Pointers
Difficulty: Easy
Problem Statement
Given an array, move all negative numbers to the left side and positive numbers to the right side.
Input:
{2, -3, 4, -1, 5, -6}

Possible Output:
{-6, -3, -1, 4, 5, 2}

The original order does not need to be maintained.

Guidance
Use opposite pointers:
int left = 0;
int right = arr.length - 1;

Rules:
arr[left] < 0
    → already correct
    → left++

arr[right] >= 0
    → already correct
    → right--

Otherwise:
    arr[left] is positive
    arr[right] is negative
    → swap them */
public class MoveNegatives {
    public static void main(String args[]){
        int arr[] = {2, -3, 4, -1, 5, -6};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] < 0){
                left++;
            }else if(arr[right] >= 0){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
