/*Easy Problem 10 — Common Elements in Two Sorted Arrays
Type: Two Arrays / Two Pointers
Difficulty: Easy
Problem Statement
Given two sorted arrays, find the elements that are present in both arrays.
arr1 = {1, 2, 4, 5, 7}
arr2 = {2, 3, 4, 6, 7}

Output:
2 4 7

Guidance
Use:
int i = 0;  // arr1
int j = 0;  // arr2

Follow three rules:
arr1[i] == arr2[j]
→ Common element found
→ print it
→ i++
→ j++

arr1[i] < arr2[j]
→ i++

arr1[i] > arr2[j]
→ j++

Your Task */
public class CommonElements {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 7};
        int arr2[] = {2, 3, 4, 6, 7};

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
}
