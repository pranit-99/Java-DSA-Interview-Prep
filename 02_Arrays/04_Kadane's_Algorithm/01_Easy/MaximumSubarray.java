/*Problem 3 — Find Maximum Sum AND the Subarray
Now we add one small extension.
Problem: Find the maximum sum and print the actual contiguous subarray responsible for it.
Input:
{-2, 1, -3, 4, -1, 2, 1, -5, 4}

Output:
Maximum Sum: 6
Subarray: 4 -1 2 1 */
public class MaximumSubarray {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {

                currentSum = arr[i];

                tempStart = i;

            } else {

                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {

                maxSum = currentSum;

                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);

        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
