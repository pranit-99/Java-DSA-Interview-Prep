public class OnlineOrderPayment {
    public static void processPayment(double balance, double orderAmount) throws Exception{
        if(orderAmount > balance){
            throw new Exception("Insufficient balance to complete the order.");
        }
        double remainingBalance = balance - orderAmount;

        System.out.println("Payment Successful");
        System.out.println("Order Amount: $" + orderAmount);
        System.out.println("Remaining Balance: $" + remainingBalance);

    }
    public static void main(String[] args) {
        double balance  = 1500;
        double orderAmount = 2000;

        try {
            processPayment(balance, orderAmount);
        } catch (Exception e) {
            System.out.println("Payment Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Order payment processing completed.");
    }
}
