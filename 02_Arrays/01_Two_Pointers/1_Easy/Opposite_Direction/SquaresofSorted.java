/*Problem 1: Squares of a Sorted Array
Easy
 Array
 Opposite-Direction Two Pointers

Problem Statement
Given an integer array arr sorted in non-decreasing order, return a new array containing the square of each element, also sorted in non-decreasing order.
You must solve this problem using the Opposite-Direction Two Pointers technique.
Example 1
Input:
arr = {-4, -1, 0, 3, 10};


Output:
{0, 1, 9, 16, 100}


Example 2
Input:
arr = {-7, -3, 2, 3, 11}; */


import java.util.Arrays;

public class SquaresofSorted {

    public static int[] sortedSquares(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        int result[] = new int[arr.length];
        int index = arr.length - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};

        int result[] = sortedSquares(arr);

        System.out.println(Arrays.toString(result));
    }
}

