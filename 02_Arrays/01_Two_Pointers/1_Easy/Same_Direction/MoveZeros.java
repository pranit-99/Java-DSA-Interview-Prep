/*Easy Problem 5 — Move Zeros to End
Type: Same-Direction Two Pointers (slow & fast)
Problem Statement
Move all 0s to the end while maintaining the order of non-zero elements.
Input:
{0, 1, 0, 3, 12}

Output:
{1, 3, 12, 0, 0}

Guidance
Use two pointers:
int slow = 0;

fast scans the entire array:
for(int fast = 0; fast < arr.length; fast++)

Whenever arr[fast] is not zero, swap:
arr[slow] ↔ arr[fast]

Then:
slow++; */
public class MoveZeros {
    public static void main(String args[]){
        int arr[]  = {0, 1, 0, 3, 12};
        int slow = 0;
        for(int fast = 0; fast < arr.length; fast++){
            if(arr[fast] != 0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast]  = temp;
                slow++;
            }
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
