public class AverageOfElements {
    public static double average(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }
    public static void main(String args[]) {
        int arr[] = {5, 10, 20};
        System.out.println("Average of Elements = " + average(arr));
    }
}
