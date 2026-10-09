/*Problem 1 — Smallest Subarray with Sum ≥ Target
Given:
int[] arr = {2, 1, 5, 2, 3, 2};
int target = 7;

Find the smallest length of a contiguous subarray whose sum is greater than or equal to 7.
Expected Output
2

Because:
[2, 1, 5] → 8     length = 3

[5, 2] → 7        length = 2  ← smallest

[2, 3, 2] → 7     length = 3

So answer:
2

How Dynamic Window Works Here
Start:
left = 0
right = 0

[2]
sum = 2

Sum isn't >= 7, so expand right:
[2, 1]
sum = 3

Still not enough. Expand:
[2, 1, 5]
sum = 8

Now:
sum >= 7

We found a valid window.
Its length:
right - left + 1

which is:
2 - 0 + 1 = 3

But maybe we can make it smaller.
So we shrink from left.
Remove 2:
[1, 5]
sum = 6

Now it is no longer valid.
So we stop shrinking and start expanding right again.
This is the core dynamic-window behavior:
Not enough → EXPAND right →

Condition satisfied → SHRINK left →

Condition broken → EXPAND right again → */
public class SmallestSubarray {
    public static int findSmallestLength(int arr[], int target){
        int left  = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++){
            //Expand Window
            windowSum = windowSum + arr[right];

            //Shrink window while condition is satisfied
            while (windowSum >= target){
                int currentLength = right - left + 1;

                if(currentLength < minLength){
                    minLength = currentLength;
                }
                windowSum = windowSum - arr[left];
                left++;
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 2, 3, 2};
        int target = 7;

        System.out.println("Smallest Length: "+ findSmallestLength(arr, target));
    }
}
