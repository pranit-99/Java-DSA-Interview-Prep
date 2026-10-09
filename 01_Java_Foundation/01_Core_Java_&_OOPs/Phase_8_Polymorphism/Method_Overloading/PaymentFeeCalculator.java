/*Online Payment Fee Calculator — Static Method Overloading

Now we'll cover another important rule:

Static methods can also be overloaded.

Because the methods are static, we can call them using the class name without creating an object.

Problem Statement

An online payment application calculates transaction fees differently depending on the information provided.

Create three overloaded static methods:

calculateFee(double amount)

Standard payment → charge 2% fee.

calculateFee(double amount, double feePercentage)

Custom payment → calculate using the provided percentage.

calculateFee(double amount, double feePercentage, double fixedCharge)

Custom payment → percentage fee + fixed processing charge. */
public class PaymentFeeCalculator {
    public static double calculateFee(double amount){
        double fee = amount * 0.02;
        return fee;
    }

    public static double calculateFee(double amount, double feePercentage){
        double fee = amount * feePercentage / 100;
        return fee;
    }

    public static double calculateFee(double amount, double feePercentage, double fixedCharge){
        double percentageFee = amount * feePercentage / 100;
        double totalFee = percentageFee + fixedCharge;

        return totalFee;
    }
    public static void main(String[] args) {
        double fee1 = PaymentFeeCalculator.calculateFee(1000);
        System.out.println("Standard Fee: $" + fee1);

        System.out.println("--------------------------");

        double fee2 = PaymentFeeCalculator.calculateFee(1000, 3);
        System.out.println("Custom Fee: $" + fee2);


        System.out.println("--------------------------");


        double fee3 =
                PaymentFeeCalculator.calculateFee(
                        1000, 3, 5);

        System.out.println(
                "Custom Fee + Fixed Charge: $" + fee3);
    }
}
