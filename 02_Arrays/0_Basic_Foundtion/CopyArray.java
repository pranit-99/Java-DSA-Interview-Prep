public class CopyArray {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static int[] copyArray(int arr[]) {

        int copiedArray[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copiedArray[i] = arr[i];
        }

        return copiedArray;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int copiedArray[] = copyArray(arr);

        for(int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}
