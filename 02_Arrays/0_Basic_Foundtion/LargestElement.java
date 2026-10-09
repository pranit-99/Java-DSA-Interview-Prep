public class LargestElement {
    public static int largestElement(int arr[]){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {12, 5, 8, 21, 3, 17};
        System.out.println("Largest Emelent:-"+ largestElement(arr));
    }
}
