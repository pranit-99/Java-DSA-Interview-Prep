/*Problem 5: Mobile Data Plan

This one is for you to solve yourself. No solution unless you specifically ask for it.

We are still strictly at the Basic Encapsulation level.

Problem Statement

A mobile network company wants a simple system to manage a customer's monthly mobile data balance.

Create a class:

MobileDataPlan

The class should contain:

customerId
customerName
remainingDataGB
Requirements
All fields must be private.
customerId
Must be greater than 0.
Can be assigned only once.
Can be viewed using a getter.
customerName
Can be viewed and changed.
Cannot be null or empty.
remainingDataGB
Use double because a customer may have values such as 5.5 GB.
Can be viewed using a getter.
Should not have a normal setter.
Create:
addData(double data)

It should:

Accept data only if it is greater than 0.
Add it to the existing remainingDataGB.
Otherwise print:
Invalid data amount
Create:
useData(double data)

It should:

Reject 0 or negative amounts.
Prevent the customer from using more data than they currently have.
If valid, subtract the used data from remainingDataGB.

For an invalid amount, print:

Invalid data usage

If there isn't enough data, print:

Insufficient data balance

For successful usage, you can print:

Data used successfully
Example Scenario

Your main() can test:

Customer ID = 1001
Customer Name = Pranit

Add Data = 10.0 GB

Use Data = 2.5 GB

Remaining Data = 7.5 GB

Then test an invalid case:

Try to use 10 GB

Since only 7.5 GB remains: */
public class MobileDataPlan {
     private int  customerId;
     private String customerName;
     private double remainingDataGB;

     public void setCustomerId(int customerId){
        if(this.customerId == 0 && customerId > 0){
            this.customerId = customerId;
        }else{
            System.out.println("Customer ID is Already assigned");
        }
     }

     public int getCustomerId(){
        return customerId;
     }

     public void setCustomerName(String customerName){
        if(customerName != null && !customerName.isEmpty()){
            this.customerName = customerName;
        }else{
            System.out.println("Name already assigned");
        }
     }

     public String getcustomerName(){
        return customerName;
     }

     public void addData(double data){
        if(data > 0){
            this.remainingDataGB = this.remainingDataGB + data;
            System.out.println(data + " Data Added Successfully");
        }else{
            System.out.println("! Invalid data amount, Data must be Positive and greater than 0");
        }
     }

     public void useData(double data){
        if( data <= 0){
            System.out.println("Invalid data Usage");
        }else if(data > remainingDataGB){
            System.out.println("Insufficient Data Balance");
        }else{
            this.remainingDataGB = this.remainingDataGB - data;
            System.out.println(data + " Data used successfully " + this.remainingDataGB + " Avaibale");
        }
     }



     public double getremainingDataGB(){
        return remainingDataGB;
     }



    
    public static void main(String args[]){
        MobileDataPlan plan = new MobileDataPlan();

        plan.setCustomerId(101);
        plan.setCustomerName("Pranit");
        plan.addData(5.5);
        plan.useData(2.5);

        System.out.println();
        System.out.println("Name:-" + plan.getcustomerName());
        System.out.println("Customer ID:-" + plan.getCustomerId());
        System.out.println("Plan added Successfully" + plan.getremainingDataGB());
    }
}
