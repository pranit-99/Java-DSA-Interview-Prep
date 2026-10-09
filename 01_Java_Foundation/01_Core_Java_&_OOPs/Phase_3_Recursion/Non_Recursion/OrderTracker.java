/*An e-commerce company stores the delivery status of its orders using an integer array:

int[] orders = {1, 2, 1, 3, 2, 3, 1, 2};

The numbers mean:

1 → Processing
2 → Shipped
3 → Delivered

Create the method:

public static void trackOrders(int[] orders)

For every order, print its current status.

For example:

Order 1: Processing
Order 2: Shipped
Order 3: Processing
Order 4: Delivered */
public class OrderTracker {

    public static void trackOrders(int[] orders) {

        int processing = 0;
        int shipped = 0;
        int delivered = 0;
        int invalid = 0;

        for (int i = 0; i < orders.length; i++) {

            if (orders[i] == 1) {

                System.out.println("Order " + (i + 1) + ": Processing");
                System.out.println("Action Required: Order has not been shipped");

                processing++;

            } else if (orders[i] == 2) {

                System.out.println("Order " + (i + 1) + ": Shipped");

                shipped++;

            } else if (orders[i] == 3) {

                System.out.println("Order " + (i + 1) + ": Delivered");

                delivered++;

            } else {

                System.out.println("Order " + (i + 1) + ": Invalid Status");

                invalid++;
            }
        }

        System.out.println();
        System.out.println("Processing Orders: " + processing);
        System.out.println("Shipped Orders: " + shipped);
        System.out.println("Delivered Orders: " + delivered);
        System.out.println("Invalid Orders: " + invalid);
    }

    public static void main(String[] args) {

        int[] orders = {1, 2, 1, 3, 5, 2, 3, 1};

        trackOrders(orders);
    }
}
