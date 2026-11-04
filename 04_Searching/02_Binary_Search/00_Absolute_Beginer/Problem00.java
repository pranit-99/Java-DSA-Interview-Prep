public class Problem00 {
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                result = mid;
                break;
            }else if(arr[mid] < target){
                left = mid + 1; 
            }else{
                right = mid - 1;
            }
        }
        System.out.println("Target Index: " + result);
    }
}
