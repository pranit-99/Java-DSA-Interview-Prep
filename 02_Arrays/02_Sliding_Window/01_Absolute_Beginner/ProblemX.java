/*eXamine Consecutive Ones
Variable

Find the longest run of consecutive ones in a binary array. */
public class ProblemX {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                left = right + 1;
            }
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }
        System.out.println("Maximum Consecutive Ones: " + maxLength);
    }
}
