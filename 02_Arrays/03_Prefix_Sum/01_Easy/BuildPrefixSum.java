/*Problem 1 — Build a Prefix Sum Array
Problem
Given:
int[] arr = {3, 5, 2, 6, 4};

Create and print the prefix sum array.
Expected:
3 8 10 16 20 */
public class BuildPrefixSum {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 4};
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1]  + arr[i];
        }

        for(int num : prefix){
            System.out.print(num + " ");
        }
    }
}
