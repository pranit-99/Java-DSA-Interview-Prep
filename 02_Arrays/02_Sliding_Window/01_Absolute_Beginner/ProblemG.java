/*Problem G: Get Count of Odd Numbers
Pattern: Fixed-Size Sliding Window
Java filename: G_GetCountOddNumbers.java
Given an integer array and a window size k, print the number of odd elements in each contiguous window of size k.
Input:
int[] arr = {3, 6, 7, 9, 2, 5, 8};
int k = 3;


Expected output:
2
2
2
2
1 */
public class ProblemG {
  public static void main(String[] args) {
      int arr[] = {3, 6, 7, 9, 2, 5, 8};
      int k = 3;
      int oddCount = 0;

      //Create Window
      for(int i = 0; i < k; i++){
        if(arr[i] % 2 != 0){
            oddCount++;
        }
      }
      System.err.println(oddCount);

      //Slide the window
      for(int i = k; i < arr.length; i++){
        if(arr[i - k] % 2 != 0){
            oddCount--;
        }

        if(arr[i] % 2 != 0){
            oddCount++;
        }
        System.err.println(oddCount);
      }
   }  
}
