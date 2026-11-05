/*Selection Sort — Problem 1: Sort an Array in Ascending Order
Problem Statement
Given an integer array, sort the elements in ascending order using Selection Sort.
Input:
arr = {64, 25, 12, 22, 11}

Expected Output:
11 12 22 25 64

How Selection Sort Thinks
Selection Sort repeatedly:
Finds the smallest element from the unsorted portion → puts it at the beginning.
For example:
64  25  12  22  11
↑
i

Smallest = 11

Swap 64 and 11

11  25  12  22  64
↑
Sorted

Next pass:
11 | 25  12  22  64
     ↑
     i

Smallest = 12

11 | 12  25  22  64
     ↑
    Sorted

And this continues.
Java Solution */
public class SelectionSortAscending {
    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;

            //Find smallest element
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //Swap smallest element with current position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
