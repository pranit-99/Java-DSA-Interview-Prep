/*Easy Problem 8 — Separate Even and Odd Numbers
Type: Partitioning Two Pointers
Problem Statement
Given an array, move all even numbers to the left and all odd numbers to the right.
Input:
{1, 2, 3, 4, 5, 6}

Possible Output:
{6, 2, 4, 3, 5, 1}

Order does not need to be maintained.
Guidance
int left = 0;
int right = arr.length - 1;

Rules:
arr[left] is even
    → left++

arr[right] is odd
    → right--

Otherwise
    → swap arr[left] and arr[right]
    → left++
    → right--

Remember:
number % 2 == 0   // Even
number % 2 != 0   // Odd */
public class EvenOdd {
    public static void main(String args[]){
        int arr[]  = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] % 2 == 0){
                left++;
            }else if(arr[right] % 2 != 0){
                right--;
            }else{
                int temp = arr[left];
                arr[left]  = arr[right];
                arr[right] = temp;
            }
        }
       for(int num : arr) {
            System.out.print(num + " ");
        } 
    }
}
