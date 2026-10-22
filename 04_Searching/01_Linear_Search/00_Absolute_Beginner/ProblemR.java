/*Problem R — Find the Missing Number in a Sequence
Independent Practice 16
Difficulty: Absolute Beginner
Topic: Linear Search / Array Traversal
Java File Name: FindMissingNumber.java
1. Problem Statement
You are given a sorted integer array containing numbers in increasing order. Normally, each number should be exactly 1 greater than the previous number.

However, exactly one number is missing from the sequence.

Your task is to find that missing number by traversing the array.
2. Example 1
Input:
int arr[] = {1, 2, 3, 5, 6, 7};


Expected Output:
Missing number: 4 */
public class ProblemR {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 5, 6, 7};
        int missing = -1;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] > 1){
                missing = arr[i] + 1;
                break;
            }
        }
        System.out.println("Missing number:" + missing);
    }
}
/*public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 6, 7};

        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }  */
