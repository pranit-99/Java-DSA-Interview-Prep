/*Bubble Sort — Problem 1: Sort an Array
Problem Statement
Given an integer array, sort all elements in ascending order using Bubble Sort.
Input:
arr = {5, 1, 4, 2, 8}

Expected Output:
1 2 4 5 8

Approach
Bubble Sort compares adjacent elements:
arr[j] > arr[j + 1]

If the left element is greater, swap them.
After every complete pass, the largest unsorted element reaches its correct position at the end. */
public class BubbleSortAsceding {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
