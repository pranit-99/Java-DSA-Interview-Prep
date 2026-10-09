public class IndexofLast {
    public static int indexofLast(int arr[], int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] == target){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 50};
        /*int target = 40;*/
        System.out.println(indexofLast(arr, 20));
    }
}
