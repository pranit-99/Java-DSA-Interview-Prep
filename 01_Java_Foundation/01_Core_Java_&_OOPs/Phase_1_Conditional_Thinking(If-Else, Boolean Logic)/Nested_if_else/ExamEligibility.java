/*A student can sit for the final exam only if:

First condition: Attendance is at least 75%.

Second condition: If attendance is sufficient, the student must also have submitted the assignment.

Use:

int attendance = 85;
boolean assignmentSubmitted = true;

Expected output:

Eligible for final exam */
public class ExamEligibility {
    public static void main(String[] args) {
        int attendance = 85;
        boolean assignmentSubmitted = true;

        if(attendance >= 75){
            if( assignmentSubmitted == true){
                System.out.println("Eligible for final exam");
            }else{
                System.out.println("Not Eligible for final exam");
            }
        }
    }
}
