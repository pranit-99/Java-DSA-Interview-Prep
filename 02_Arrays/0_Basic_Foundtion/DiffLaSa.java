public class DiffLaSa {
    public static int difference(int arr[]){
        int difference ;
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        difference = largest - smallest;
        return difference;
    }
    public static void main(String[] args) {
        int arr[] = {-10, -3, -20, -5};
        System.out.println(difference(arr));

    }
}
