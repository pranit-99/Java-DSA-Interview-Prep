/*Window With At Most K Odd Numbers
Variable

Find the longest contiguous subarray containing at most k odd numbers. */
public class ProblemW{
public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5, 8};
        int k = 2;
        int left = 0;
        int oddCount = 0;
        int maxLength = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                oddCount++;
            }
            while (oddCount > k) {
                if (arr[left] % 2 != 0) {
                    oddCount--;
                }
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
