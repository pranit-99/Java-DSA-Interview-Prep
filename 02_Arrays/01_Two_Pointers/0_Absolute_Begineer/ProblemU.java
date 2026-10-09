/*Problem U: Move Pointers Based on Which Element Is Smaller
Absolute Beginner
 Opposite Direction – Conditional Pointer Movement

Problem Statement
Given an integer array, use two pointers starting from opposite ends to compare the elements.
Follow these rules:
- If arr[left] < arr[right], move the left pointer one position forward.
- If arr[left] > arr[right], move the right pointer one position backward.
- If both elements are equal, move both pointers inward.
Count how many times the left pointer moves and how many times the right pointer moves.
Return the two counts.
Example 1
Input:
arr = {2, 8, 4, 6, 3}

Output:
Left Moves: 2
Right Moves: 2


Example 2
Input:
arr = {9, 3, 5, 2}

Output:
Left Moves: 0
Right Moves: 3


Example 3
Input:
arr = {4, 2, 7, 4}

Output:
Left Moves: 1
Right Moves: 3 */
public class ProblemU {
    public static void countMoves(int arr[]){
    int left = 0;
    int right = arr.length - 1;

    int leftMoves = 0;
    int rightMoves = 0;
    
    while(left < right){
        if(arr[left] < arr[right]){
            left++;
            leftMoves++;
        }else if(arr[left] > arr[right]){
            right--;
            rightMoves++;
        }else{
            left++;
                right--;
                leftMoves++;
                rightMoves++;
        }

    }
    System.out.println("Left Moves:" +leftMoves);
    System.out.println("Right Moves:" + rightMoves);
    }
    public static void main(String[] args) {
        int arr[]  = {2, 8, 4, 6, 3};
        countMoves(arr);
    }
}
