public class CountPoNeZe {
    public static void main(String args[]){
        int arr[] = {5, -3, 0, 8, -1, 0, 4, -7};
        int Positive = 0, Negative = 0, Zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                Positive++;
            }
            else if(arr[i] < 0){
                Negative++;
            }else {
                Zero++;
            }
        }
        System.out.println("Positive = "+Positive);
        System.out.println("Negative = "+Negative);
        System.out.println("Zero = "+Zero);
    }
}
