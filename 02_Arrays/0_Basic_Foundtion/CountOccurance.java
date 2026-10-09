public class CountOccurance {
    public static int countOccurance(int arr[]){
    int count = 0;
    int target = 10;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 40, 20};
       System.out.print(countOccurance(arr));
    }
}
