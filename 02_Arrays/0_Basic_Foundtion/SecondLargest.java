public class SecondLargest {

    public static int secondLargest(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int arr[] = {10, 10, 8, 7};

        System.out.println("Second Largest Element: " + secondLargest(arr));
    }
}