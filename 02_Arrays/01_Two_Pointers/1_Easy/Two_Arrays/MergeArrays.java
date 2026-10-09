/*Merge Two Sorted Arrays
Type: Two Arrays / Two Sequences Two Pointers
Problem Statement
Given two sorted arrays, merge them into one sorted array.
arr1 = {1, 3, 5, 7}
arr2 = {2, 4, 6, 8}

Output:
1 2 3 4 5 6 7 8

Guidance
Here we use two pointers:
int i = 0;   // arr1
int j = 0;   // arr2

And another index for the result:
int k = 0;

Compare:
arr1[i] < arr2[j]
        ↓
Put arr1[i] into merged array
        ↓
i++

Otherwise
        ↓
Put arr2[j] into merged array
        ↓
j++

After one array finishes, copy the remaining elements from the other array. */
public class MergeArrays {
    public static void main(String args[]){
        int arr1[] = {1, 3, 5, 7};
        int arr2[]  = {2, 4, 6, 8};

        int merged[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k=  0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            merged[k] = arr2[j];
            j++;
            k++;
        }
        for(int num : merged) {
            System.out.print(num + " ");
        }

    }
}
