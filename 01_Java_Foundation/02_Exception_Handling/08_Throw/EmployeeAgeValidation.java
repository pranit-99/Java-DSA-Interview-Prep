public class EmployeeAgeValidation {
    public static void main(String[] args) {
        int age = 16;
        try{
            System.out.println(" Employee Age:" +age);
            if(age < 18){
                throw new IllegalArgumentException(
                   "Employee must be at least 18 years old." 
                );
            }
            System.out.println("Employee age is valid.");
            System.out.println("Registration successful.");
        }catch (IllegalArgumentException e){
           System.out.println("Registration Failed.");
            System.out.println("Reason: " + e.getMessage()); 
        }
        System.out.println("Employee registration process completed.");
    }
}
