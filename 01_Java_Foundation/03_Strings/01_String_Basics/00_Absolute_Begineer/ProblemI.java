/*Problem H — Capacity and Memory Management
Absolute Beginner
StringBuilder · Problem 3 of 5

Objective: Understand how StringBuilder manages its internal storage and learn five methods related to capacity, length, and empty-state checking.
1. Five methods we'll learn
Method	Purpose	Return type
capacity()	Returns the current storage capacity	int
ensureCapacity()	Ensures capacity is at least the requested minimum	void
setLength()	Changes the length of the character sequence	void
trimToSize()	Attempts to reduce capacity to the current length	void
isEmpty()	Checks whether the character sequence is empty	boolean

2. Important concept — Length vs Capacity
Before solving the problem, understand this distinction:
- Length: The number of characters currently stored.
- Capacity: The number of characters the internal buffer can hold before it needs to grow.
For example: */
public class ProblemI {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        System.out.println(" Initial Capacity: " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("After Ensure Capacity: " +sb.capacity());

        sb.setLength(2);
        System.out.println("After set Length: " + sb);
        System.out.println("Curremt Length: " + sb.length());

        sb.trimToSize();
        System.out.println("After Trim to Size: " + sb.capacity());

        System.out.println("IS Empty: " + sb.isEmpty());
    }
}
