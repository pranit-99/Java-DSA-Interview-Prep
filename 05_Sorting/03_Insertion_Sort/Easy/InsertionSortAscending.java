/*Insertion Sort — Problem 1: Sort an Array in Ascending Order
Problem Statement
Given an integer array, sort all elements in ascending order using Insertion Sort.
Input:
arr = {5, 3, 8, 4, 2}

Expected Output:
2 3 4 5 8 */
public class InsertionSortAscending {
    public static void main(String args[]){
        int arr[] = {5, 3, 8, 4, 2};
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            // Shift larger elements one position to the right
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            //Insert key into its correct position
            arr[j+1] = key;
        }
        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
