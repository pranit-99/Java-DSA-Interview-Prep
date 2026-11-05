/*Heap Sort — Problem 1: Sort an Array in Ascending Order
Heap Sort is slightly different from everything we've done so far because it uses the Binary Heap concept.
For now, don't worry about mastering the entire Heap data structure. We'll study Heap deeply as its own DSA topic later. For sorting, understand the basic mechanism.
Problem Statement
Sort the following array in ascending order using Heap Sort.
arr = {12, 11, 13, 5, 6, 7}

Expected:
5 6 7 11 12 13

Core Idea
For ascending sorting, Heap Sort first creates a Max Heap.
A Max Heap means the parent is greater than or equal to its children.
For example:
        13
       /  \
     11    12
    / \    /
   5   6  7

The maximum element is therefore always at:
arr[0]

Heap Sort then repeatedly:
Build Max Heap → Take largest element → Move it to the end → Heapify remaining elements
Important Index Formulas
If a node is at index i: */
public class HeapSortAscending {

    public static void heapSort(int[] arr) {

        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Move largest element to the end
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore Max Heap
            heapify(arr, i, 0);
        }
    }


    public static void heapify(int[] arr, int n, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If parent is not largest
        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Fix affected subtree
            heapify(arr, n, largest);
        }
    }


    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        heapSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
