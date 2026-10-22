/*Problem L — Largest Average Improvement
Easy · Fixed-Size Sliding Window · Arrays Only

Java file: LargestImprovement.java
1. Problem statement
Given an integer array arr and a fixed window size k, find the largest increase in average between two consecutive windows.

Only positive increases count as improvements. If no window's average increases, return 0.

You must solve this using the fixed-size sliding-window technique.
2. Example
int arr[] = {2, 4, 1, 7, 3, 9};
int k = 3;


Expected output:
2.67


The answer is rounded to two decimal places.3. Understand the problem
Window	Sum	Average	Change from previous
[2, 4, 1]	7	2.33	—
[4, 1, 7]	12	4.00	+1.67
[1, 7, 3]	11	3.67	−0.33
[7, 3, 9]	19	6.33	+2.67
The largest positive improvement is:
\[
6.33-3.67\approx 2.67
\]

Use unrounded values during calculations and round only the final output. */
public class LargestAvergeImprovement {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 7, 3, 9};
        int k = 3;
        int windowSum = 0;

        double previousAverage  = 0;
        double currentAverage = 0;
        double maxImprovement = 0;

        //First window
        for(int  i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }

        //Calculate first average
        previousAverage = (double) windowSum / k;

        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];

            currentAverage = (double) windowSum / k;
            double improvement = currentAverage - previousAverage;

            if(improvement > maxImprovement){
                maxImprovement = improvement;
            }

            previousAverage = currentAverage;
        }

        System.out.printf("Largest Improvement: %.2f%n",
                          maxImprovement);
    }
}
