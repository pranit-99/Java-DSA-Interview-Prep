/*Problem Statement

A banking application receives a customer's name from its database.

Normally:

Customer Name = "Pranit"

But suppose no name was returned:

Customer Name = null

The application tries to calculate the length of the customer's name using:

customerName.length();

Your program should:

Create a String variable named customerName.
Assign null to it.
Print "Customer Processing Started".
Try to calculate the customer's name length.
Handle the resulting exception.
Display a meaningful message.
Continue the program.
Print "Customer Processing Completed". */
public class CustomerNameProcessor {
    public static void main(String[] args) {
        String customerName = null;
        System.out.println("Customer Processing Started");
        try {
            int nameLength = customerName.length();
            System.out.println("Customer Name Length: " + nameLength);
        } catch (NullPointerException e) {
            System.out.println(
                "Customer name is unavailable."
            );
        }
        System.out.println("Customer Processing Completed");
    }
}
