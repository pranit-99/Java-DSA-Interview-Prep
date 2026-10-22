/*Problem S — Find the Second Largest Distinct Element
Independent Practice 17
Difficulty: Absolute Beginner → Easy
Topic: Linear Search / Array Traversal
Java File Name: SecondLargestElement.java
1. Problem Statement
Given an integer array, find the second largest distinct element using a single traversal.

The second largest element must be strictly smaller than the largest element.

You must solve this problem without sorting the array.
2. Example 1
Input:
int arr[] = {10, 25, 8, 40, 15, 30};


Expected Output:
Second largest element: 30 */

public class ProblemS {
    public static void main(String[] args) {
        int arr[] = {10, 25, 8, 40, 15, 30};
        int largest = arr[0];
        int secondLargest = 0;
        boolean found = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                found = true;
            } else if (arr[i] < largest &&
                       (!found || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                found = true;
            }
        }
        if (found) {
            System.out.println(
                "Second largest element: " + secondLargest
            );
        } else {
            System.out.println(
                "Second largest element does not exist"
            );
        }
    }
}

