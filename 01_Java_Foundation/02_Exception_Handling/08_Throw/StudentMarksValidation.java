public class StudentMarksValidation {
    public static void main(String args[]){
        int marks = 120;
        try {
            System.out.println("Student Marks: " + marks);
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
                );
            }
            System.out.println("Marks are valid.");
            System.out.println("Student result processed successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Result Processing Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Student result processing completed.");
    }
}
