/*Problem 12: School Student Attendance

After finishing Problem 11, solve this one.

Create:

StudentAttendance

with:

private int studentId;
private String studentName;
private int attendedClasses;
private boolean presentToday;
Requirements

studentId

Must be greater than 0.
Can be assigned only once.
Provide getter.

studentName

Cannot be null or empty.
Provide setter and getter.

attendedClasses

Getter only.
No setter.

presentToday

Provide:
public boolean isPresentToday()
No setter.

Create:

markPresent()

If the student is already marked present:

Student is already marked present

Otherwise:

presentToday = true;
attendedClasses = attendedClasses + 1;

and print:

Attendance marked successfully

Create:

resetAttendanceForNextDay()

If the student is not currently marked present, print:

Attendance is already reset

Otherwise:

presentToday = false;

and print:

Attendance reset for next day
Example
StudentAttendance student = new StudentAttendance();

student.setStudentId(101);
student.setStudentName("Pranit");

student.markPresent();

System.out.println(student.getAttendedClasses());
System.out.println(student.isPresentToday());

student.markPresent();   // Should not increase again

student.resetAttendanceForNextDay();

System.out.println(student.isPresentToday());

student.markPresent();

System.out.println(student.getAttendedClasses());

The final number of attended classes should be:

2

For this problem, practice both:

if(this.presentToday)

and:

if(!this.presentToday) */
public class StudentAttendance {

    private int studentId;
    private String studentName;
    private int attendedClasses;
    private boolean presentToday;


    public void setStudentId(int studentId) {

        if(this.studentId == 0 && studentId > 0) {

            this.studentId = studentId;

        } else {

            System.out.println(
                "Invalid Student ID or Student ID already assigned"
            );
        }
    }


    public int getStudentId() {

        return studentId;
    }


    public void setStudentName(String studentName) {

        if(studentName != null && !studentName.isEmpty()) {

            this.studentName = studentName;

        } else {

            System.out.println(
                "Invalid student name"
            );
        }
    }


    public String getStudentName() {

        return studentName;
    }


    public int getAttendedClasses() {

        return attendedClasses;
    }


    public boolean isPresentToday() {

        return presentToday;
    }


    public void markPresent() {

        if(this.presentToday) {

            System.out.println(
                "Student is already marked present"
            );

        } else {

            this.presentToday = true;

            this.attendedClasses =
                    this.attendedClasses + 1;

            System.out.println(
                "Attendance marked successfully"
            );
        }
    }


    public void resetAttendanceForNextDay() {

        if(!this.presentToday) {

            System.out.println(
                "Attendance is already reset"
            );

        } else {

            this.presentToday = false;

            System.out.println(
                "Attendance reset for next day"
            );
        }
    }


    public static void main(String[] args) {

        StudentAttendance student =
                new StudentAttendance();

        student.setStudentId(101);
        student.setStudentName("Pranit");


        // Day 1
        student.markPresent();

        System.out.println(
            "Attended Classes: "
            + student.getAttendedClasses()
        );

        System.out.println(
            "Present Today: "
            + student.isPresentToday()
        );


        // Try marking again on same day
        student.markPresent();


        // Prepare for next day
        student.resetAttendanceForNextDay();

        System.out.println(
            "Present Today: "
            + student.isPresentToday()
        );


        // Day 2
        student.markPresent();


        System.out.println();
        System.out.println("Student Details");

        System.out.println(
            "Student ID: " + student.getStudentId()
        );

        System.out.println(
            "Student Name: " + student.getStudentName()
        );

        System.out.println(
            "Total Attended Classes: "
            + student.getAttendedClasses()
        );
    }
}