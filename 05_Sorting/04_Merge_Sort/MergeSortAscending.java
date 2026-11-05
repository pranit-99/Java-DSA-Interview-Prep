/*Merge Sort — Problem 1: Sort an Array in Ascending Order
Now we're entering an important interview-level sorting algorithm.
Unlike Bubble, Selection, and Insertion Sort, Merge Sort uses Divide and Conquer + Recursion.
Problem Statement
Sort the given array in ascending order using Merge Sort.
arr = {6, 3, 9, 5, 2, 8}

Expected:
2 3 5 6 8 9

Core Idea
Merge Sort has three steps:
Divide → Sort → Merge
We continuously divide:
              [6, 3, 9, 5, 2, 8]
                       ↓
             -------------------
             ↓                 ↓
         [6, 3, 9]         [5, 2, 8]
          ↓     ↓           ↓     ↓
       [6,3]   [9]       [5,2]   [8]
       ↓   ↓              ↓   ↓
     [6]   [3]          [5]   [2]

Once every part contains one element, recursion starts returning and we merge them in sorted order: */
public class MergeSortAscending {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both sorted halves
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

        // Compare elements from both arrays
        while (i < leftSize && j < rightSize) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
