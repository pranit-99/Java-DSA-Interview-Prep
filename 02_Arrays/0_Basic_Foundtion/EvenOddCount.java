public class EvenOddCount {
    public static void main(String[] args) {
        int arr[] = {12, 7, 9, 20, 16, 5, 8};
        int Even = 0;
        int odd = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                Even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even = " + Even + " Odd = "+odd);
    }
}
