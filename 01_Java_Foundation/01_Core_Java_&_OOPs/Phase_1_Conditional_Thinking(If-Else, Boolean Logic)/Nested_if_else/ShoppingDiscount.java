/*A customer's discount depends first on whether they are a member or non-member. After that, a different condition is checked for each category.

Rules

If the customer is a member:

Purchase amount >= 500 → "20% discount"
Purchase amount < 500 → "10% discount"

If the customer is not a member:

Purchase amount >= 1000 → "5% discount"
Purchase amount < 1000 → "No discount"
Input
boolean isMember = false;
int purchaseAmount = 1200;
Expected Output
Customer is not a member
5% discount */
public class ShoppingDiscount {

    public static void main(String args[]) {

        boolean isMember = false;
        int purchaseAmount = 1200;

        if(isMember) {

            System.out.println("Customer is a member");

            if(purchaseAmount >= 500) {
                System.out.println("20% discount");
            } else {
                System.out.println("10% discount");
            }

        } else {

            System.out.println("Customer is not a member");

            if(purchaseAmount >= 1000) {
                System.out.println("5% discount");
            } else {
                System.out.println("No discount");
            }
        }
    }
}
