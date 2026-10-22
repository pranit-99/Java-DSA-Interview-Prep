/*Problem P — Positive Product Windows
Easy · Fixed-Size Sliding Window · Mathematical Logic

Java file: PositiveProduct.java
1. Problem statement
Given an integer array arr and a fixed window size k, count how many contiguous windows of size k have a positive product.

A window is valid when:
\[
\text{Product of all elements in window} > 0
\]

Important: You must solve this using a genuine sliding-window approach without recalculating the product of every window.
2. Example
int arr[] = {-2, 3, -4, 5, 0, -1, -3};
int k = 3;


Expected output:
1


3. Understand the example
Window	Product	Positive?
[-2, 3, -4]	24	Yes
[3, -4, 5]	-60	No
[-4, 5, 0]	0	No
[5, 0, -1]	0	No
[0, -1, -3]	0	No
Correction: The expected output is 1, because only the first window has a positive product. */
public class PositiveProductWindow {
    public static void main(String[] args) {
      int arr[] = {-2, 3, -4, 5, 0, -1, -3};
      int k = 3;
      int negativeCount = 0;
      int zeroCount = 0;
      int count = 0;
      
      for(int i = 0; i < k; i++){
        if(arr[i] < 0){
            negativeCount++;
        }else if(arr[i] == 0){
            zeroCount++;
        }
      }

      if(zeroCount == 0 && negativeCount % 2 == 0){
        count++;
      }

      for(int i = k; i < arr.length; i++){
        if(arr[i - k] < 0){
            negativeCount--;
        }else if(arr[i - k] == 0){
            zeroCount--;
        }

        if(zeroCount == 0 && negativeCount % 2 == 0){
            count++;
        }
      }
      System.out.println("Positive product windows:"+count);
    }
}
