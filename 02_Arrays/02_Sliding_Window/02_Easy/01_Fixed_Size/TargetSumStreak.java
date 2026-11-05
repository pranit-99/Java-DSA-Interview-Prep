/*Problem T — Target Sum Streak
Easy · Fixed-Size Sliding Window · Consecutive Conditions

Java file: TargetSumStreak.java
1. Problem statement
Given an integer array arr, a fixed window size k, and a target value, find the maximum number of consecutive windows whose sums are greater than or equal to the target.

A window is valid when:
windowSum >= target


A streak continues as long as consecutive windows satisfy this condition. If a window fails, the current streak resets to zero.
2. Example
int arr[] = {4, 3, 5, 2, 6, 4, 1, 7};
int k = 3;
int target = 11;


Expected output:
4 */
public class TargetSumStreak {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 2, 6, 4, 1, 7};
        int k = 3;
        int target = 11;
        int sum  = 0;
        int currentStreak = 0;
        int maxStreak = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        if(sum >= target){
            currentStreak++;
            maxStreak = currentStreak;
        }

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            if(sum >= target){
            currentStreak++;
            if(currentStreak > maxStreak){
                maxStreak = currentStreak;
            }
        }else{
                currentStreak = 0;
            }
        }
        System.out.println("Longest Streak: " + maxStreak);
        }
    }

