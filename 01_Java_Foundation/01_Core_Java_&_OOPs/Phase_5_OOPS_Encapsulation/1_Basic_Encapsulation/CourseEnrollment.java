/*Problem 7: Online Course Enrollment

Now you solve this one yourself. We are still at Basic Encapsulation.

This problem changes the pattern slightly so you aren't just repeating increase/decrease problems.

Problem Statement

An online learning platform wants to manage a student's enrollment in a course.

Create a class:

CourseEnrollment

with these private fields:

private int enrollmentId;
private String studentName;
private boolean enrolled;
Requirements
enrollmentId
Must be greater than 0.
Can be assigned only once.
Provide a getter.
studentName
Provide a getter.
Do not create a normal setter.
It should be assigned when the student enrolls.
enrolled
Provide:
public boolean isEnrolled()
Do not create setEnrolled().
Create:
enrollStudent(String studentName)

It should check:

studentName cannot be null
studentName cannot be empty
student cannot already be enrolled

If the name is invalid:

Invalid student name

If already enrolled:

Student is already enrolled

Otherwise:

studentName = provided name
enrolled = true

and print:

Enrollment successful
Create:
cancelEnrollment()

If the student is currently enrolled:

studentName = null
enrolled = false

and print:

Enrollment cancelled

If no student is currently enrolled:

No active enrollment */
public class CourseEnrollment {
    private int enrollmentId;
    private String studentName;
    private boolean enrolled;

    public void setEnrollmentId(int enrollmentID){
        if(this.enrollmentId == 0 && enrollmentID > 0){
            this.enrollmentId = enrollmentID;
        }else{
            System.out.println("Enrollment ID must be greater than 0");
        }
    }

    public int getEnrollmentId(){
        return enrollmentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public boolean isEnrolled(){
        return enrolled;
    }

    public void enrollStudent(String studentName){
        if ( studentName == null || studentName.isEmpty()){
            System.out.println("Invalid User Name");
        }else if(this.enrolled){
            System.out.println("Student is already enrolled");
        }else{
            this.studentName = studentName;
            this.enrolled = true;
            System.out.println("Enrollment successful");
        }
    }

    public void cancelEnrollment(){
        if(this.enrolled){
            this.enrolled = false;
            this.studentName = null;
             System.out.println("Enrollment scancelled");
        }else{
            System.out.println("No active enrollment");
        }
    }

    public static void main(String args[]){
        CourseEnrollment course = new CourseEnrollment();
        course.setEnrollmentId(1001);
        course.enrollStudent("Pranit");

        System.out.println(course.getEnrollmentId());
        System.out.println(course.getStudentName());
        System.out.println(course.isEnrolled());
        course.enrollStudent("Pranit");
        course.cancelEnrollment();

        System.out.println(course.getStudentName());
        System.out.println(course.isEnrolled());
        

        course.cancelEnrollment();
    }
}
