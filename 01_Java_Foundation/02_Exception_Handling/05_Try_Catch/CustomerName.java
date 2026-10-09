public class CustomerName {
    public static void main(String[] args) {
        String customerName = null;
        System.err.println("Customer Name: " + customerName);

        try {
            int nameLength  = customerName.length();
            System.err.println("Name Length:" + nameLength);
        } catch (NullPointerException e) {
            System.out.println("Cannot calculate customer name length.");
            System.out.println("Reason: Customer name is null.");
        }
        System.out.println("Customer processing completed.");
    }
}
