public class ProductQuantity {

    public static void main(String[] args) {

        int quantity = -5;

        try {

            System.out.println("Product Quantity: " + quantity);

            if (quantity <= 0) {

                throw new IllegalArgumentException(
                    "Product quantity must be greater than zero."
                );
            }

            System.out.println("Product quantity is valid.");
            System.out.println("Inventory updated successfully.");

        } catch (IllegalArgumentException e) {

            System.out.println("Inventory Update Failed.");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("Inventory processing completed.");
    }
}