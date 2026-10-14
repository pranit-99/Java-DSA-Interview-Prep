/*Problem 16 (O): Odd-Even Array Partition
Easy
 Opposite-Direction Two Pointers

Java Filename: OddEvenArrayPartition.java
Pattern: In-place partitioning using conditional pointer movement and swapping.
This problem introduces a different concept from our previous pair-sum problems. Here, we use two pointers to rearrange an array without creating another array.
1. Problem statement
Given an unsorted integer array, rearrange its elements so that:
- All odd numbers appear on the left.
- All even numbers appear on the right.
- The original order of elements does not need to be maintained.
- You must modify the original array without using an additional array.
Example 1
Input:
arr = {2, 7, 4, 9, 6, 3}

Possible Output:
{3, 7, 9, 4, 6, 2}


Example 2
Input:
arr = {8, 2, 5, 1, 4, 7}

Possible Output:
{7, 1, 5, 2, 4, 8} */

import java.util.Arrays;

public class OddEvenArrayPartition {
    public static void partitionArray(int[] arr){
    int left = 0;
    int right  = arr.length - 1;
    while(left < right){
        if(arr[left] % 2 != 0){
            left++;
        }else if(arr[right] % 2 == 0){
            right--;
        }else{
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 4, 9, 6, 3};
        partitionArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
