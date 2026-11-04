/*Problem M — Count Occurrences of a Target Using Binary Search
Level 1 · Absolute Beginner
In Problem K, you learned how to find the first occurrence of a target.

In Problem L, you learned how to find the last occurrence.

Now we'll combine both concepts to solve a new problem: counting how many times a target appears in a sorted integer array without checking every element.
1. Problem statement
Given a sorted integer array containing duplicate numbers, find how many times a target occurs using Binary Search.
2. Input
int[] arr = {2, 4, 4, 4, 4, 6, 8, 10};
int target = 4;


Expected output:
Number of occurrences: 4 */
public class ProblemM {
    // Find the first occurrence of the target
    public static int findFirst(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                result = mid;
                right = mid - 1;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }

    public static int findLast(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                result = mid;
                left = mid + 1;
            }else if(arr[mid] < target){
                left  = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[] arr = {2, 4, 4, 4, 4, 6, 8, 10};
        int target = 4;
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        int count = 0;
        if (first != -1) {
            count = last - first + 1;
        }
        System.out.println("Number of occurrences: " + count);
    }
}
