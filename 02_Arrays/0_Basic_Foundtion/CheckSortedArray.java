public class CheckSortedArray {

    public static boolean checkSorted(int arr[]) {

        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i]) {

                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(checkSorted(arr));
    }
}
