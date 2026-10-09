public class EvenOdd {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Even Numbers");
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for(int j = 1; j<=n; j++){
            if(j % 2 != 0){
                System.out.print(j + " ");
            }
    }
}
}
/*public class EvenOdd {

    public static void main(String[] args) {

        int n = 20;

        System.out.println("Even Numbers");

        for(int i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Odd Numbers");

        for(int i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }
    }
} */
