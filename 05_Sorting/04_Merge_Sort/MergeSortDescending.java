/*Merge Sort — Problem 2: Sort in Descending Order
We'll keep this basic. The purpose is to make you comfortable modifying Merge Sort rather than introducing a new concept.
Problem Statement
Sort the given array in descending order using Merge Sort.
arr = {12, 5, 9, 1, 15, 7}

Expected output:
15 12 9 7 5 1

What changes?
The divide/recursion logic does not change at all.
mergeSort(arr, left, mid);
mergeSort(arr, mid + 1, right);

Only the comparison inside merge() changes.
Ascending:
if (leftArray[i] <= rightArray[j])

Descending:
if (leftArray[i] >= rightArray[j]) */
public class MergeSortDescending {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Divide left half
            mergeSort(arr, left, mid);

            // Divide right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }


    public static void merge(int[] arr, int left, int mid, int right) {

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy elements into temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge in descending order
        while (i < leftSize && j < rightSize) {

            if (leftArray[i] >= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left array
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Remaining elements from right array
        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int[] arr = {12, 5, 9, 1, 15, 7};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Descending Order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
