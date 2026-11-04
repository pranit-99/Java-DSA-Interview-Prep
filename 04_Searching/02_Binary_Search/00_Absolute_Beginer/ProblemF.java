

/*Problem F — Find the Correct Insertion Position
Level 1 · Absolute Beginner
New concept: Until now, we searched for an element already present or missing in an array.

Now we will find where a missing number should be inserted so that the array remains sorted.
1. Problem statement
You are given a sorted array of integers and a target number.

Your task is to find the index where the target should be inserted while maintaining ascending order.

If the target already exists, return its index.
2. Input
int[] arr = {2, 4, 6, 8, 10};
int target = 5;


Expected output:
Insertion position: 2 */
public class ProblemF {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left +(right - left) / 2;
            if(arr[mid] == target){
                System.out.println("Insertion Position: " + mid);
                return;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println("Insertion position: " + left);
    }
}
