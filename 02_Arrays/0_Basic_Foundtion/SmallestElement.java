public class SmallestElement {
    public static int smallestElement(int arr[]){
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int arr[] = {18, 7, 25, 3, 14, 9};
        System.out.println("Smallest Emelent:-"+ smallestElement(arr));
    }
}

