public class ProductInventory {
    public static void main(String args[]){
        String products[] = {"Laptop", "Mouse", null, "Keyboard"};
        int productIndex = 2;
        try {
            String product = products[productIndex];
            System.out.println("Product: " + product);
            int productNameLength = product.length();
            System.out.println("Product Name Length: " + productNameLength);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Product not found.");
            System.out.println("Reason: Invalid product index.");
        }catch (NullPointerException e){
            System.out.println("Product information is missing.");
            System.out.println("Reason: Product name is null.");
        }
        System.out.println("Inventory processing completed.");
    }
}
