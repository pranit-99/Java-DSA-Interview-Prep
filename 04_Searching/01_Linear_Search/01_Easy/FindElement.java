/*Linear Search — Problem 1: Find an Element
Problem Statement
Given an integer array and a target value, use Linear Search to find the target.
If the target exists, print its index. Otherwise, print "Element not found".
Example
Input:
arr = {10, 25, 7, 40, 15}
target = 40

Output:
Element found at index: 3

Approach
Linear Search simply checks elements one by one from left to right: */
public class FindElement {
    public static void main(String args[]){
        int arr[] = {10, 25, 7, 40, 15};
        int target = 40;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found");
        }
    }
}
