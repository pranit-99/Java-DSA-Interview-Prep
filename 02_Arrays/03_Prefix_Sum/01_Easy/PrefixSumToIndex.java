/*Problem 2 — Find Sum from Beginning to an Index
Problem
Given:
int[] arr = {4, 2, 7, 1, 5};

Find the sum of elements from index 0 to index 3 using Prefix Sum.
Expected:
14

Because:
4 + 2 + 7 + 1 = 14 */
public class PrefixSumToIndex {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 5};
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int index = 3;

        System.out.println("Sum: " + prefix[index]);
    }
}
