/*public class HeapSortDescending {

    public static void heapSort(int[] arr) {

        int n = arr.length;

        // Build Min Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Move smallest element to the end
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore Min Heap
            heapify(arr, i, 0);
        }
    }


    public static void heapify(int[] arr, int n, int i) {

        int smallest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // Check right child
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If parent is not smallest
        if (smallest != i) {

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Fix affected subtree
            heapify(arr, n, smallest);
        }
    }


    public static void main(String[] args) {

        int[] arr = {9, 4, 7, 1, 6, 3};

        heapSort(arr);

        System.out.println("Descending Order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
} */
public class HeapSortDescending {

    public static void heapSort(int[] arr) {

        int n = arr.length;

        // Build Min Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Move smallest element to the end
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore Min Heap
            heapify(arr, i, 0);
        }
    }


    public static void heapify(int[] arr, int n, int i) {

        int smallest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // Check right child
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If parent is not smallest
        if (smallest != i) {

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Fix affected subtree
            heapify(arr, n, smallest);
        }
    }


    public static void main(String[] args) {

        int[] arr = {9, 4, 7, 1, 6, 3};

        heapSort(arr);

        System.out.println("Descending Order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
