/*Selection Sort — Problem 2: Sort in Descending Order
Problem Statement
Given an integer array, sort it in descending order using Selection Sort.
Input:
arr = {20, 5, 15, 30, 10}

Expected Output:
30 20 15 10 5

Approach
For ascending Selection Sort, we find the minimum element.
For descending Selection Sort, we find the maximum element and place it at the beginning of the unsorted portion.
20  5  15  30  10
↑
i

Maximum = 30

Swap 20 and 30

30 | 5  15  20  10
↑
sorted

Next pass:
30 | 5  15  20  10
     ↑

Maximum = 20

30 | 20 | 15  5  10
     ↑
   sorted */
public class SelectionSortDescending {
    public static void main(String[] args) {
        int arr[] = {20, 5, 15, 30, 10};
        for(int i = 0; i < arr.length - 1; i++){
            int maxIndex = i;

            //Find maximum element
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("Array in Descending Order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
