public class EvenNumbers {
    public static void main(String args[]){
        int n = 20;
        int i = 1;

        while(i <= n){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
