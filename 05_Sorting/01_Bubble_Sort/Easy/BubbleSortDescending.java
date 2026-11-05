/*Bubble Sort — Problem 2: Sort in Descending Order
Problem Statement
Given an integer array, sort all elements in descending order using Bubble Sort.
Input:
arr = {12, 5, 8, 2, 15, 7}

Expected Output:
15 12 8 7 5 2

Key Difference
For ascending order, we used:
if (arr[j] > arr[j + 1])

For descending order, simply reverse the condition:
if (arr[j] < arr[j + 1])

Now the larger element moves toward the left, while smaller elements gradually move toward the end. */
public class BubbleSortDescending {
    public static void main(String[] args) {
        int arr[] = {12, 5, 8, 2, 15, 7};
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array in Descending Order:");
        for(int num : arr){
           System.out.print(num + " "); 
        }
    }
}
