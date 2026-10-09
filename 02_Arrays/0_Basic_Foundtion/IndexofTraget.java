public class IndexofTraget {
    public static int index(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 25,40, 7, 40, 15};
        /*int target = 40;*/
        System.out.println(index(arr, 40));
    }
}
