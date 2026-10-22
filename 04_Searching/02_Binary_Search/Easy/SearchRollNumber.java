/*Binary Search — Problem 2: Find a Student's Roll Number
Let's do one more basic Binary Search problem before moving into Binary Search patterns.
Problem Statement
A school stores student roll numbers in sorted order.
Given an array of roll numbers and a targetRollNumber, determine whether the roll number exists.
If found, print its index. Otherwise, print "Roll number not found".
Example
rollNumbers = {101, 105, 110, 115, 120, 125, 130}

targetRollNumber = 120

Output:
Roll number found at index: 4 */
public class SearchRollNumber {

    public static void main(String[] args) {

        int[] rollNumbers = {101, 105, 110, 115, 120, 125, 130};
        int targetRollNumber = 120;

        int left = 0;
        int right = rollNumbers.length - 1;
        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (rollNumbers[mid] == targetRollNumber) {
                index = mid;
                break;
            }

            else if (rollNumbers[mid] < targetRollNumber) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Roll number found at index: " + index);
        } else {
            System.out.println("Roll number not found");
        }
    }
}
