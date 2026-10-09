//Print Numbers divisible by Three
public class Divisibleby {
    public static void main(String[] args) {
        int n = 30;
        for(int i = 1; i <=n; i++){
            if( i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
