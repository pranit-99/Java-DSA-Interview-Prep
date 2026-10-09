public class CustomerAge {
    public static void main(String[] args) {
        String customerAge = "TwentyFive";
        try {
            int length = customerAge.length();
            System.err.println("Input Length:" +length);
            int age = Integer.parseInt(customerAge);
            System.err.println("Customer Age:" + age);
        } catch (NullPointerException e) {
            System.out.println("Customer age is missing.");
            System.out.println("Reason: Age value is null.");
        }catch (NumberFormatException e){
            System.out.println("Invalid customer age.");
            System.out.println("Reason: Age must contain numbers only.");
        }
        System.err.println("Customer age processing completed");
    }
}
