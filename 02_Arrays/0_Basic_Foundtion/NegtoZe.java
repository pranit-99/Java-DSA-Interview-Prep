public class NegtoZe {
   public static void main(String[] args) {
       int arr[] = {10, -5, 20, -8, 0, 15, -3};
       for(int i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            arr[i] = 0;
        }
       }
       for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] +" ");
       }

   } 
}
