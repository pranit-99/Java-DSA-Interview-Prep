/*E-Commerce Product Inventory Management

Now we'll make the problem slightly more realistic.

This time, encapsulation will protect a product's price and stock so that outside code cannot randomly manipulate inventory.

We are still not using constructors.

Problem Statement

An e-commerce company needs to manage products in its inventory.

Create a class:

Product

Each product should maintain:

productId
productName
price
stockQuantity
Business Rules
All fields must be private.
Product ID can be assigned only once.
Product name can be viewed and changed.
Price can be viewed and changed, but the new price must be greater than 0.
Stock quantity can be viewed but should not have a normal setter.
Products should be added to inventory through restock().
Products should be sold through sellProduct().
Restock quantity must be greater than 0.
Selling quantity must be greater than 0.
A customer cannot purchase more items than are currently available.
Stock should never become negative. */
public class ProductInventory {
    private int productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public void setProductID(int productId){
        if(productId == 0 && productId > 0){
            this.productId = productId;
        }else{
            System.out.println("Invalid Product ID or Product ID already assigned");
        }
    }

    public int getProductID() {
        return productId;
    }

    public void setProductName(String productName){
        if(productName != null && !productName.isEmpty()){
            this.productName = productName;
        }else{
            System.out.println("Invalid Product name");
        }
    }

    public String getProductName(){
        return productName;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Price must be greater than 0");
        }
    }

    public double getPrice(){
        return price;
    }

    public int getStockQuantity(){
        return stockQuantity;
    }

    public void restock(int quantity){
        if(quantity > 0){
            this.stockQuantity = this.stockQuantity + quantity;
            System.out.println("Restock successful");
            System.out.println("Quantity added" + quantity);
        }else{
            System.out.println("Restock quantity must be greater than 0");
        }
    }

    public void sellProduct(int quantity) {

        if(quantity <= 0) {
            System.out.println("Purchase quantity must be greater than 0");
        } else if(quantity > this.stockQuantity) {
            System.out.println("Insufficient stock");
        } else {
            this.stockQuantity = this.stockQuantity - quantity;
            double totalAmount = this.price * quantity;
            System.out.println("Sale successful");
            System.out.println("Quantity sold: " + quantity);
            System.out.println("Total Amount: $" + totalAmount);

        }
    }

    public static void main(String args[]){
        ProductInventory product = new ProductInventory();

        product.setProductID(1001);
        product.setProductName("Wireless Headphones");
        product.setPrice(79.99);

        product.restock(50);

        System.out.println();
        System.out.println("Stock before sale: "
                           + product.getStockQuantity());

        product.sellProduct(3);

        System.out.println();
        System.out.println("Product Details");
        System.out.println("Product ID: "
                           + product.getProductID());
        System.out.println("Product Name: "
                           + product.getProductName());
        System.out.println("Price: $"
                           + product.getPrice());
        System.out.println("Remaining Stock: "
                           + product.getStockQuantity());
    }
}
