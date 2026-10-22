/*Problem C — Count Distinct Elements in Each Window
Easy
Fixed-Size Sliding Window

CountDistinctElements.java

1. Problem Statement
Given an integer array arr and an integer k, find the number of distinct (unique-valued) elements in every contiguous subarray of size k.

A distinct element is counted only once, even if it appears multiple times in the same window.
Example
int[] arr = {1, 2, 1, 3, 4, 2, 3};
int k = 4;


Expected output:
3
4
4
3


Explanation
Window	Distinct elements	Count
[1, 2, 1, 3]	1, 2, 3	3
[2, 1, 3, 4]	2, 1, 3, 4	4
[1, 3, 4, 2]	1, 3, 4, 2	4
[3, 4, 2, 3]	3, 4, 2	3
2. Approach — How should we think?
In our previous problems, we maintained:
- Problem A: windowSum
- Problem B: evenCount and oddCount
- Problem C: Frequency of each element
Why do we need frequencies?

Consider the window:
[1, 2, 1, 3]


The number 1 appears twice, but it should contribute only one to the distinct count.

We can use a Java HashMap<Integer, Integer> to maintain how many times each number appears in the current window.

For the first window, the map would contain:
Element (key)	Frequency (value)
1	2
2	1
3	1
Therefore, frequencyMap.size() is 3.
Sliding-window logic
When the window moves right:
1. Remove one occurrence of the outgoing element from the frequency map.
2. If its frequency becomes zero, remove that key completely.
3. Add one occurrence of the incoming element.
4. Print the number of keys remaining in the map.
Important: Removing a key when its frequency becomes zero is essential. Otherwise, map.size() would include elements that are no longer in the current window. */

public class CountDistinct {
    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        // Move through each window
        for (int i = 0; i <= arr.length - k; i++) {
            int count = 0;
            // Check each element in current window
            for (int j = i; j < i + k; j++) {
                boolean isDuplicate = false;
                // Compare with earlier elements
                for (int m = i; m < j; m++) {
                    if (arr[j] == arr[m]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    count++;
                }
            }
            System.out.println("Distinct Elements: " + count);
        }
    }
}

