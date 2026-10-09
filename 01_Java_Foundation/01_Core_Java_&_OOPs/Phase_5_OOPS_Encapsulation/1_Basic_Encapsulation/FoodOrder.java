/*Problem 11: Food Delivery Order

Create a class:

FoodOrder

with these private fields:

private int orderId;
private String customerName;
private double orderAmount;
private boolean orderCancelled;
Requirements

orderId

Must be greater than 0.
Can be assigned only once.
Provide a getter.

customerName

Cannot be null or empty.
Provide setter and getter.

orderAmount

Provide getter only.
Do not create setOrderAmount().

orderCancelled

Provide:
public boolean isOrderCancelled()
Do not create a normal setter.

Create:

addItem(double price)

It should add the price to orderAmount.

If:

price <= 0

print:

Invalid item price

If the order has already been cancelled, print:

Cannot add item to cancelled order

Otherwise:

orderAmount = orderAmount + price;

Create:

cancelOrder()

If the order is already cancelled:

Order is already cancelled

Otherwise:

orderCancelled = true;

and print:

Order cancelled successfully
Test Scenario
FoodOrder order = new FoodOrder();

order.setOrderId(501);
order.setCustomerName("Pranit");

order.addItem(12.50);
order.addItem(8.50);

System.out.println(order.getOrderAmount());

order.cancelOrder();

order.addItem(5.00);   // Should fail

Before cancellation:

12.50 + 8.50 = 21.00

Your boolean challenge is deciding where you need:

if(this.orderCancelled) */
public class FoodOrder {

    private int orderId;
    private String customerName;
    private double orderAmount;
    private boolean orderCancelled;


    public void setOrderId(int orderId) {

        if(this.orderId == 0 && orderId > 0) {

            this.orderId = orderId;

        } else {

            System.out.println(
                "Invalid Order ID or Order ID already assigned"
            );
        }
    }


    public int getOrderId() {

        return orderId;
    }


    public void setCustomerName(String customerName) {

        if(customerName != null && !customerName.isEmpty()) {

            this.customerName = customerName;

        } else {

            System.out.println("Invalid customer name");
        }
    }


    public String getCustomerName() {

        return customerName;
    }


    public double getOrderAmount() {

        return orderAmount;
    }


    public boolean isOrderCancelled() {

        return orderCancelled;
    }


    public void addItem(double price) {

        if(this.orderCancelled) {

            System.out.println(
                "Cannot add item to cancelled order"
            );

        } else if(price <= 0) {

            System.out.println(
                "Invalid item price"
            );

        } else {

            this.orderAmount =
                    this.orderAmount + price;

            System.out.println(
                "Item added successfully"
            );
        }
    }


    public void cancelOrder() {

        if(this.orderCancelled) {

            System.out.println(
                "Order is already cancelled"
            );

        } else {

            this.orderCancelled = true;

            System.out.println(
                "Order cancelled successfully"
            );
        }
    }


    public static void main(String[] args) {

        FoodOrder order = new FoodOrder();

        order.setOrderId(501);
        order.setCustomerName("Pranit");

        order.addItem(12.50);
        order.addItem(8.50);

        System.out.println(
            "Order Amount: $" + order.getOrderAmount()
        );

        System.out.println(
            "Order Cancelled: " + order.isOrderCancelled()
        );


        order.cancelOrder();


        // Should fail
        order.addItem(5.00);


        System.out.println();
        System.out.println("Final Order Details");

        System.out.println(
            "Order ID: " + order.getOrderId()
        );

        System.out.println(
            "Customer: " + order.getCustomerName()
        );

        System.out.println(
            "Amount: $" + order.getOrderAmount()
        );

        System.out.println(
            "Cancelled: " + order.isOrderCancelled()
        );
    }
}