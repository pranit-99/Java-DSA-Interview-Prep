/*Java StringBuffer — Absolute Beginner
Problem L — Insertion, Deletion, Replacement, and Reversal
Absolute Beginner
StringBuffer · Problem 2 of 5

Objective: Learn how to insert, delete, replace, and reverse characters inside a StringBuffer using five methods.
1. Five methods we'll learn
Method	Purpose	Return type
insert()	Inserts characters at a specified index	StringBuffer
delete()	Removes characters within a specified range	StringBuffer
deleteCharAt()	Removes one character at a specified index	StringBuffer
replace()	Replaces characters within a specified range	StringBuffer
reverse()	Reverses the character sequence	StringBuffer

All five methods modify the existing StringBuffer object.
2. Problem statement
Write a Java program that performs the following operations:
1. Create a StringBuffer containing "Java".
2. Insert " Core" at index 4.
3. Delete " Core" to restore "Java".
4. Delete the character 'J'.
5. Replace "ava" with "Python".
6. Reverse the resulting StringBuffer.
Input:
StringBuffer sb = new StringBuffer("Java");


Expected output:
Original: Java
After Insert: Java Core
After Delete: Java
After Delete Character: ava
After Replace: Python
After Reverse: nohtyP */
public class ProblemM {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original: " + sb);

        sb.insert(4, " Core");
        System.out.println("After Insert: " + sb);

        sb.delete(4, 9);
        System.out.println("After Delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After Delete Character: "+ sb);

        sb.replace(0, 3, "Python");
        System.out.println("After Replace: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
