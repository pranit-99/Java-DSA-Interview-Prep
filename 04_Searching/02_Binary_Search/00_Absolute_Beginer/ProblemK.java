/*Problem K — Find the First Occurrence of a Target
1. Problem statement
Given a sorted integer array containing duplicate values, find the first index at which the target appears using Binary Search.
2. Input
int[] arr = {2, 4, 4, 4, 6, 8, 10};
int target = 4;


Expected output:
First occurrence index: 1 */
public class ProblemK {
    public static void main(String args[]){
        int arr[] = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;
        int result = -1;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                result = mid;
                right = mid - 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println("First Occurance:-" + result);       
    }
}
