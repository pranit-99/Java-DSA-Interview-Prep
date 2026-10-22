/*Zero-Tolerant Binary Window
Variable

Find the longest binary subarray containing at most k zeros. */
public class ProblemZ {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {

                if (arr[left] == 0) {
                    zeroCount--;
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
