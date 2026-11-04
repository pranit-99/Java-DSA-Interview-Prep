/*1. Problem statement
You are given a sorted array:
int[] arr = {2, 4, 6, 8, 10, 12, 14};
int target = 12;


Task: Find the index of 12 using Binary Search.

Expected output:
Target found at index: 5 */
public class Problem01 {
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 12;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                System.out.println("Target found at index:" + mid);
                break;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
    }
}
