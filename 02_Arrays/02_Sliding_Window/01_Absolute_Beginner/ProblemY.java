/*Yield Longest Positive Sum Window
Variable

Find the longest contiguous subarray with sum at most target; positive integers only. */
public class ProblemY {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 3, 2, 1};
        int target = 5;

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        System.out.println("Maximum Length: " + maxLength);
    }
}
