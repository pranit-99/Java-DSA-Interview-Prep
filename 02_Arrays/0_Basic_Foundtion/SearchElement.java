public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {10, 25, 7, 40, 15};
        int count = 0;
        int target = 30;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Found");
        }else
            {
            System.out.println("Not Found");
        }
       
    }
}
