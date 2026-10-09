/*Problem 3 — Three-Way Partition Around a Pivot
Given an array and a pivot, rearrange the array so that:
Elements < pivot
Elements == pivot
Elements > pivot

Example:
Input:
arr = [4, 2, 5, 3, 3, 1, 3]
pivot = 3

Possible Output:
[2, 1, 3, 3, 3, 5, 4]

The exact order inside each group doesn't matter.
Focus: Understand the real/generalized DNF pattern rather than associating it only with 0, 1, 2. */
    public class ThreeWayPartition {

    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 3, 3, 1, 3};
        int pivot = 3;

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] < pivot) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == pivot) {

                mid++;

            } else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

