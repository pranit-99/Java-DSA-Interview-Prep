/*Problem 1: Sort an Array in Ascending Order
Quick Sort is important because interviewers often test whether you understand pivot + partition + recursion.
Problem Statement
Sort the following array in ascending order using Quick Sort.
arr = {10, 7, 8, 9, 1, 5}

Expected output:
1 5 7 8 9 10

Core Idea
Quick Sort follows:
Choose Pivot → Partition → Recursively Sort
For our implementation, we'll choose the last element as the pivot.
10  7  8  9  1  5
                   ↑
                 pivot

During partitioning:
Values <= pivot → left side
Pivot           → correct position
Values > pivot  → right side

After partitioning around 5:
1 | 5 | 8  9  10  7
    ↑
  pivot

The important point is that 5 is now in its final sorted position. Quick Sort then recursively works on the portions to its left and right.
Java Solution */
public class QuickSortAscending {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Sort elements before pivot
            quickSort(arr, low, pivotIndex - 1);

            // Sort elements after pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot into its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
