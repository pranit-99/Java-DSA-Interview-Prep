public class DrivingLicense {
    public static void checkLicenseEligibility(int age) throws Exception{
        if(age < 18){
            throw new Exception("Applicant must be at least 18 years old.");
        }
        System.out.println("Applicant is eligible for a driving license.");
    }
    public static void main(String args[]){
        int age = 16;
        try {
            checkLicenseEligibility(age);
        } catch (Exception e) {
            System.out.println("License Application Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("License eligibility check completed.");
    }
}
