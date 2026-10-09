public class OrderTotal {

    public static int calculateTotal(int[] orders, int index) {

        // Base condition
        if (index == orders.length) {
            return 0;
        }

        // Recursive call + return
        return orders[index] + calculateTotal(orders, index + 1);
    }

    public static void main(String[] args) {

        int[] orders = {100, 250, 75, 125};

        int total = calculateTotal(orders, 0);

        System.out.println("Total Order Amount: $" + total);
    }
}
