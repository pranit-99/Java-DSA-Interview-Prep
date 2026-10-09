/*Exception Basics — Problem 2 of 8
Student Marks Lookup — ArrayIndexOutOfBoundsException

In Problem 1, you learned what happens when an ArithmeticException occurs. Now we'll intentionally try to access an invalid array position.

Problem Statement

A university system stores marks for 5 subjects:

Java       → 85
Python     → 78
Database   → 92
DSA        → 88
Cloud      → 81

The student asks the system to retrieve the mark at index 7.

But the array only contains 5 elements.

Your program should:

Create an integer array containing the 5 marks.
Store the requested index as 7.
Print "Student Marks Lookup Started".
Attempt to retrieve the mark.
Handle the exception if the index doesn't exist.
Display a meaningful message.
Continue execution.
Print "Student Marks Lookup Completed". */
public class StudentMarksLookup {
    public static void main(String args[]){
        int marks[] = {85, 78, 92, 88 ,81};
        int requestIndex = 7;
        System.out.println("Student Marks Lookup Started");
        try{
        int selectedMark = marks[requestIndex];
        System.out.println("Student Mark: " + selectedMark);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                "Invalid subject index."
            );
            System.out.println(
                "Please select an index between 0 and "
                + (marks.length - 1)
            );
        }
        System.out.println("Student Marks Lookup Completed");
    }
}
