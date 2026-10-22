/*Problem A — Array Element Search
Guided Problem 1 of 2
Problem Statement: Given an integer array and a target value, determine whether the target exists in the array.

Example
int arr[] = {5, 10, 15, 20, 25};
int target = 15;

Expected output:
Element Found

Approach — How should we think?
1. Start searching from index 0.
2. Compare the current element with target.
3. If arr[i] == target, the element exists.
4. If the loop finishes without finding the target, print "Element Not Found"*/
public class ProblemA {
    public static void main(String args[]){
        int target = 15;
        int arr[] = {5, 10, 15, 20, 25};
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Element Found");
        }else{
            System.out.println("Element Not Found");
        }
    }
}
