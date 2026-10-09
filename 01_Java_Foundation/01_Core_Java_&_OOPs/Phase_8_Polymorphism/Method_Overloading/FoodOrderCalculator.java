public class FoodOrderCalculator {

    // Method 1
    // Food Price Only
    public double calculateOrder(double foodPrice) {
        return foodPrice;
    }


    // Method 2
    // Food Price + Delivery Charge
    public double calculateOrder(double foodPrice, double deliveryCharge) {
        double finalAmount =foodPrice + deliveryCharge;
        return finalAmount;
    }


    // Method 3
    // Food Price + Delivery Charge + Discount
    public double calculateOrder(double foodPrice, double deliveryCharge, int discountPercentage) {
        double discountAmount = foodPrice * discountPercentage / 100;
        double finalAmount = foodPrice - discountAmount + deliveryCharge;
        return finalAmount;
    }


    public static void main(String[] args) {
        FoodOrderCalculator order = new FoodOrderCalculator();
        // Regular Order
        double result1 = order.calculateOrder(100);

        System.out.println("Regular Order: $" + result1);
        System.out.println("-----------------------");

        // Order + Delivery
        double result2 = order.calculateOrder(100, 10);

        System.out.println( "Order with Delivery: $" + result2);
        System.out.println("-----------------------");

        // Order + Delivery + Discount
        double result3 = order.calculateOrder(100, 10, 20);

        System.out.println("Order with Discount: $" + result3);
    }
}
