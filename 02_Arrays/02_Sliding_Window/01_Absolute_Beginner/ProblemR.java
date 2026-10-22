/*Problem R: Record Window Sum Differences
This is the last problem in our fixed-size sliding window series.
Filename: R_RecordWindowSumDifferences.java
Given:
int[] arr = {3, 5, 2, 7, 4, 6};
int k = 3;


Calculate the difference between every consecutive pair of window sums, using:
\[
Difference=CurrentWindowSum-PreviousWindowSum
\]

Expected output:
4
-1
4


For example, the first window sum is 10, the second is 14, so the first difference is 14 - 10 = 4. */
public class ProblemR {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 6};
        int k = 3;
        int Difference;
        int CurrentWindowSum = 0;
        int PreviousWindowSum;

        for(int i = 0; i < k; i++){
            CurrentWindowSum = CurrentWindowSum + arr[i];
        }

        PreviousWindowSum = CurrentWindowSum;

        for(int i = k; i < arr.length; i++){
            CurrentWindowSum = CurrentWindowSum - arr[i - k] + arr[i];
            Difference = CurrentWindowSum - PreviousWindowSum;
            PreviousWindowSum = CurrentWindowSum;
            System.err.println(Difference);
        }
    }
}
