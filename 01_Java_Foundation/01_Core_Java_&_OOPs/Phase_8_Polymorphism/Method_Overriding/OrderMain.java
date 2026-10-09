/*E-Commerce Order Processing — super.method() with Overriding

So far, whenever a child overrides a method, we completely replaced the parent's implementation.

But sometimes we want:

Run the parent's existing logic first, then add extra child-specific logic.

For this, Java gives us:

super.methodName();
Problem Statement

Suppose an e-commerce application has a general Order class.

Every order must:

Validate the order.
Calculate the basic total.

An ExpressOrder needs all the normal processing plus an express delivery charge.

Instead of rewriting the parent's logic, the child can call: */
class Order {

    public void processOrder() {

        System.out.println("Validating Order");

        System.out.println("Calculating Basic Order Total");
    }
}


class ExpressOrder extends Order {

    @Override
    public void processOrder() {

        super.processOrder();

        System.out.println("Adding Express Delivery Charge");

        System.out.println("Express Order Processed");
    }
}


public class OrderMain {

    public static void main(String[] args) {

        Order order = new ExpressOrder();

        order.processOrder();
    }
}
