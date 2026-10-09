public class ExamEligibility {
    public static void checkEligibility(double attendance) throws Exception{
        if(attendance < 75){
            throw new Exception("Attendance mus be at least 75%");
        }
        System.out.println("Student is eligible for the exam");
        System.out.println("Attendance: " + attendance + "%");
    }
    public static void main(String[] args) {
        double attendance = 68.5;
        try {
            checkEligibility(attendance);
        } catch (Exception e) {
            System.out.println("Exam Eligibility Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Eligibility check completed.");
    }
}
