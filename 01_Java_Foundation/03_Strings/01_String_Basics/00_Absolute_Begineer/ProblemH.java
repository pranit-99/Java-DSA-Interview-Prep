/*Problem G — Insertion, Deletion, Replacement, and Reversal
Absolute Beginner
StringBuilder · Problem 2 of 5

Objective: Learn how to insert, delete, replace, and reverse characters inside a StringBuilder using five methods.
1. Five methods we'll learn
Method	Purpose	Return type
insert()	Inserts text at a specified index	StringBuilder
delete()	Removes characters within a specified range	StringBuilder
deleteCharAt()	Removes one character at a specified index	StringBuilder
replace()	Replaces a range of characters with new text	StringBuilder
reverse()	Reverses the character sequence	StringBuilder

All five methods modify the existing StringBuilder object.
2. Problem statement
Write a Java program that performs the following operations on a StringBuilder. */
public class ProblemH {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

       sb.insert(4, " Core");
       System.out.println("After Insert: " + sb);

       sb.delete(4, 9);
       System.out.println("After Delete: " + sb);

       sb.deleteCharAt(0);
       System.out.println("After Delete Character: " + sb);

       sb.replace(0, 3, "Python");
       System.out.println("After Replace: " + sb);

       sb.reverse();
       System.out.println("After Reverse: " + sb);

    }
}
