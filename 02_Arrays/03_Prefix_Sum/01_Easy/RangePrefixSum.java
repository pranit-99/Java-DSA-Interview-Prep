/*Problem 3 — Find Sum Between Two Indices
Now we use the actual range-sum formula.
Problem
Given:
int[] arr = {2, 4, 6, 8, 10};

Find the sum from index:
left = 1
right = 3

Expected:
18

Because:
arr[1] + arr[2] + arr[3]

4 + 6 + 8

= 18 */
public class RangePrefixSum {
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int left = 1;
        int right = 3;

        int sum;

        if(left == 0){
            sum = prefix[right];
        }else{
            sum = prefix[right] - prefix[left - 1];
        }

        System.out.println("Range Sum: " + sum);
    }
}
