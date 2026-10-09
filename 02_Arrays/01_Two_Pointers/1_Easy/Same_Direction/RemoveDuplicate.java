/*Easy Problem 6 — Remove Duplicates from Sorted Array
Type: Same-Direction Two Pointers (slow & fast)
Problem Statement
Given a sorted array, remove duplicates in-place so that each unique element appears only once.
Input:
{1, 1, 2, 2, 3, 4, 4}

After removing duplicates:
{1, 2, 3, 4}

Guidance
Because the array is sorted, duplicates will always be next to each other.
Start:
int slow = 0;

Let fast scan from index 1:
for(int fast = 1; fast < arr.length; fast++)

Compare:
arr[fast] != arr[slow]

If they are different, we found a new unique element.
Then:
slow moves forward
↓
Store arr[fast] at arr[slow] */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4};
        int slow = 0;
        for(int fast = 1; fast < arr.length; fast++){
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        for(int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
