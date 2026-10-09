/*This one has a genuine decision-tree structure.

A student's next check depends on whether they passed or failed.

Rules

If marks >= 40 → student passed.

Then, only for passed students:

marks >= 75 → "Passed with Distinction"
otherwise → "Passed"

If marks < 40 → student failed.

Then, only for failed students:

marks >= 30 → "Eligible for Re-exam"
otherwise → "Must repeat the course"
Input
int marks = 35;
Expected Output
Student Failed
Eligible for Re-exam */
public class StudentResult {

    public static void main(String args[]) {

        int marks = 35;

        if(marks >= 40) {

            System.out.println("Student Passed");

            if(marks >= 75) {
                System.out.println("Passed with Distinction");
            } else {
                System.out.println("Passed");
            }

        } else {

            System.out.println("Student Failed");

            if(marks >= 30) {
                System.out.println("Eligible for Re-exam");
            } else {
                System.out.println("Must repeat the course");
            }
        }
    }
}