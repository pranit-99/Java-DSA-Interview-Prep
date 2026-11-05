/*Insertion Sort — Problem 2: Sort in Descending Order
Problem Statement
Given an integer array, sort it in descending order using Insertion Sort.
Input:
arr = {10, 4, 15, 7, 20}

Expected Output:
20 15 10 7 4

Approach
The logic remains the same:
Pick key → Shift elements → Insert key
The only major difference is the comparison.
Ascending:
arr[j] > key

Descending:
arr[j] < key

Because in descending order, larger values need to come first. */
public class InsertionSortDescending {
    public static void main(String[] args){
        int arr[] = {10, 4, 15, 7, 20};
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            //shift smaller element to the eight
            while(j >= 0 && arr[j] < key){
                arr[j + 1] = arr[j];
                j--;
            }

            //Insert key at correct position
            arr[j + 1] = key;
        }
        System.out.println("Array in Descending Order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
