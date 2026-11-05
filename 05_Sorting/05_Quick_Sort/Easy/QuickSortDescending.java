/*Quick Sort — Problem 2: Sort in Descending Order
Problem Statement
Sort the given array in descending order using Quick Sort.
arr = {15, 3, 10, 8, 20, 5}

Expected output:
20 15 10 8 5 3

What Changes?
Just like our previous sorting algorithms, the overall Quick Sort structure remains the same.
For ascending order:
if (arr[j] <= pivot)

For descending order:
if (arr[j] >= pivot)

Now values greater than the pivot move to the left. */
public class QuickSortDescending {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Sort left side
            quickSort(arr, low, pivotIndex - 1);

            // Sort right side
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Greater elements go to the left
            if (arr[j] >= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot into correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void main(String[] args) {

        int[] arr = {15, 3, 10, 8, 20, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Descending Order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}